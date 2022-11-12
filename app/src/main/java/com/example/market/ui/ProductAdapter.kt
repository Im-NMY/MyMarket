package com.example.market.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.market.R
import com.example.market.domain.phones.ProductsModel

//class ProductAdapter() : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
//
//    private var productData: ProductsModel = ProductsModel(
//        emptyList(),
//        emptyList()
//    )
////    private var bestProductData: List<BestProductsModel> = emptyList()
//
//    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//
//        val textTitle: TextView
//        val subtitle: TextView
//        val cvLabel: CardView
//        val ivHotProd: ImageView
//
//        init {
//            textTitle = view.findViewById(R.id.tvTitle)
//            subtitle = view.findViewById(R.id.tvSubtitle)
//            cvLabel = view.findViewById(R.id.cvNew)
//            ivHotProd = view.findViewById(R.id.ivHotProd)
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view = LayoutInflater.from(parent.context)
//            .inflate(R.layout.cv_item_hot_product, parent, false)
//        return ViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        Log.e("trewq", "$position")
//        holder.textTitle.text = productData.HotProductsList[position].title
//        holder.cvLabel.isVisible = productData.HotProductsList[position].isNew
//        holder.subtitle.text = productData.HotProductsList[position].subtitle
//        Glide.with(holder.itemView).load(productData.HotProductsList[position].picture).fitCenter().into(holder.ivHotProd)
//
//    }
//
//    override fun getItemCount() = productData.HotProductsList.size
//
//    fun setData(prod: ProductsModel) {
//        productData = prod
//        notifyDataSetChanged()
//    }
//}