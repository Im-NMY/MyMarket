package com.example.market

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.market.base.viewBinding
import com.example.market.data.network.modules.HotProductsRemoteModel
import com.example.market.databinding.FragmentTestBinding
import com.example.market.domain.Categories
import com.example.market.domain.CategoriesListItem
import com.example.market.domain.phones.HotProductsModel
import com.example.market.domain.phones.ProductsModel
import com.example.market.ui.MainScreenDelegates
import com.example.market.ui.MarketViewModel
import com.example.market.ui.ViewState
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainFragment : Fragment(R.layout.fragment_test) {

    private val binding by viewBinding { FragmentTestBinding.bind(it) }

    private val adapter = ListDelegationAdapter(
        MainScreenDelegates.HotProdDelegate

    )

    private val viewModel: MarketViewModel by viewModel()
    private val rvHotProd: RecyclerView by lazy { requireActivity().findViewById(R.id.rvHotProd) }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.viewState.observe(viewLifecycleOwner, ::render)

        with(binding) {
            rvMainFragmentTest.adapter = adapter


        }

    }

    private fun render(viewState: ViewState){

        val list = listOf<HotProductsModel>()
        adapter.apply {
            items = list
            notifyDataSetChanged()
        }
    }
}

