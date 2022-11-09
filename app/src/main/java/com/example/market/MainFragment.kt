package com.example.market

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.market.ui.MarketViewModel
import com.example.market.ui.ProductAdapter
import com.example.market.ui.ViewState
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainFragment : Fragment(R.layout.fragment_main) {


    private val viewModel: MarketViewModel by viewModel()
    private val rvHotProd: RecyclerView by lazy { requireActivity().findViewById(R.id.rvHotProd) }
    private val tvTitle: TextView by lazy { requireActivity().findViewById(R.id.tvTitle) }
    private val adapter: ProductAdapter by lazy { ProductAdapter() }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.viewState.observe(viewLifecycleOwner, :: render)
        rvHotProd.adapter = adapter
    }

    private fun render(viewState: ViewState){
        adapter.setData(viewState.products)
    }
}