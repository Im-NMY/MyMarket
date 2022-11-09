package com.example.market.ui

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.example.market.base.BaseViewModel
import com.example.market.base.Event
import com.example.market.domain.*
import kotlinx.coroutines.launch

class MarketViewModel(private val interactions: Interactions) : BaseViewModel<ViewState>() {

    init {
        processDataEvent(DataEvent.LoadProducts)
    }

    override fun initialViewState() = ViewState(
        products = ProductsModel(emptyList(), emptyList()),
        basketProducts = emptyList(),
        detailsProduct = DetailsProductModel(
            cpu = "",
            camera = "",
            capacity = emptyList(),
            color = emptyList(),
            id = 0,
            images = emptyList(),
            isFavorites = true,
            price = 0,
            rating = 0.0f,
            sd = "",
            ssd = "",
        )

    )

    override fun reduce(event: Event, previousState: ViewState): ViewState? {
        when (event) {
            is DataEvent.LoadProducts -> {
                viewModelScope.launch {
                    interactions.getProducts().fold(
                        onError = {
                            Log.e("Error", it.localizedMessage)
                        },
                        onSuccess = {
                            processDataEvent(DataEvent.OnLoadProductSucceed(it))
                        }
                    )
                }
                return null
            }
            is DataEvent.OnLoadProductSucceed -> {
                Log.e("qwe", "${event.prod}")
                return previousState.copy(
                    products = event.prod
                )
            }
            else -> return null
        }
    }
}