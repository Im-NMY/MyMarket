package com.example.market.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.market.R
import com.example.market.domain.BestProductsModel
import com.example.market.domain.HotProductsModel
import com.example.market.domain.ProductsModel

class ProductAdapter() : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    private var hotProductData: ProductsModel = ProductsModel(
        emptyList(),
        emptyList()
    )
//    private var bestProductData: List<BestProductsModel> = emptyList()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val textTitle: TextView
        val subtitle: TextView
        val cvLabel: CardView

        init {
            textTitle = view.findViewById(R.id.tvTitle)
            subtitle = view.findViewById(R.id.tvSubtitle)
            cvLabel = view.findViewById(R.id.cvNew)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_hot_product, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.e("trewq", "$position")
        holder.textTitle.text = hotProductData.HotProductsList[position].title
        holder.cvLabel.isVisible = hotProductData.HotProductsList[position].isNew
//        holder.subtitle.text = bestProductData[position].title

    }

    override fun getItemCount() = hotProductData.HotProductsList.size

    fun setData(prod: ProductsModel) {
        hotProductData = prod
        notifyDataSetChanged()
    }
}