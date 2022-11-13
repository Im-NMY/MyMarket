package com.example.market

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.market.base.viewBinding
import com.example.market.databinding.FragmentTestBinding
import com.example.market.domain.phones.BestProductsModel
import com.example.market.domain.testmodel.BestProdListItem
import com.example.market.domain.testmodel.CategoriesListItem
import com.example.market.domain.testmodel.HotProdListItem
import com.example.market.ui.MainScreenDelegates
import com.example.market.ui.MarketViewModel
import com.example.market.ui.ViewState
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainFragment : Fragment(R.layout.fragment_test) {

    private val binding by viewBinding { FragmentTestBinding.bind(it) }

    private val adapter = ListDelegationAdapter(
        MainScreenDelegates.horizontalCategoryDelegate,
        MainScreenDelegates.horizontalHotProdDelegate,
        MainScreenDelegates.verticalBestProd
    )

    private val viewModel: MarketViewModel by viewModel()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.viewState.observe(viewLifecycleOwner, ::render)

        with(binding) {
            rvMainFragmentTest.adapter = adapter
        }
    }

    private fun render(viewState: ViewState) {

        val test: BestProductsModel
        adapter.apply {
            items = listOf(
                CategoriesListItem(
                    iconList = viewState.categories
                ),
                HotProdListItem(
                    HotProductsList = viewState.products.HotProductsList,
                ),
                BestProdListItem(
                    BestProductsList = viewState.products.BestProductsList
                )
            )
            notifyDataSetChanged()
        }
    }
}

