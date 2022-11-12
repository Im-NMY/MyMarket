package com.example.market.ui

import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import com.example.market.base.Item
import com.example.market.databinding.CvItemHotProductBinding
import com.example.market.databinding.RvItemHorizontalCategoryBinding
import com.example.market.databinding.RvItemHorizontalHotProdBinding
import com.example.market.domain.Categories
import com.example.market.domain.CategoriesListItem
import com.example.market.domain.phones.HotProductsModel
import com.example.market.domain.phones.ProductsModel
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

object MainScreenDelegates{

    val categoriesDelegate =
        adapterDelegateViewBinding<CategoriesListItem, Item, RvItemHorizontalCategoryBinding>(
        {layoutInflater, container ->
            RvItemHorizontalCategoryBinding.inflate(layoutInflater, container, false)}
    ){
        bind {
//            binding.recyclerView.adapter = horizontalAdapter

        }

    }

    val HotProdDelegate = adapterDelegateViewBinding<ProductsModel, Item, RvItemHorizontalHotProdBinding>(
        {inflater, container ->
            RvItemHorizontalHotProdBinding.inflate(inflater, container, false) }
    ){
        bind {
            binding.rvHorizontalHotProd.adapter = horizontalAdapter
        }

    }

   private val hotProdItemDelegate = adapterDelegateViewBinding<HotProductsModel, Item, CvItemHotProductBinding >(
        {layoutInflater, container -> CvItemHotProductBinding.inflate(layoutInflater, container, false)}
    ){
        bind {
            binding.tvTitle.text = item.title
            binding.tvSubtitle.text = item.subtitle
            binding.cvNew.isVisible = item.isNew
        }
    }

    private val horizontalAdapter = ListDelegationAdapter(
        hotProdItemDelegate
    )

}


















//fun colorAdapterDelegate(
//    onClick: (Int) -> Unit
//): AdapterDelegate<List<Item>> =
//    adapterDelegateLayoutContainer<ToolItem.ColorModel, Item>(
//        R.layout.item_palette
//    ) {
//
//        val color: ImageView = findViewById(R.id.color)
//        itemView.setOnClickListener { onClick(adapterPosition) }
//
//        bind { list ->
//            color.setColorFilter(
//                context.resources.getColor(item.color, null),
//                PorterDuff.Mode.SRC_IN
//            )
//        }
//    }
//
//fun sizeAdapterDelegate(
//    onClick: (Int) -> Unit
//): AdapterDelegate<List<Item>> =
//    adapterDelegateLayoutContainer<ToolItem.SizeModel, Item>(
//        R.layout.item_size
//    ) {
//        val size: TextView = findViewById(R.id.size)
//        itemView.setOnClickListener { onClick(adapterPosition) }
//        bind { list ->
//            size.text = item.size.toString()
//        }
//    }
//
//fun toolsAdapterDelegate(
//    onToolsClick: (Int) -> Unit
//): AdapterDelegate<List<Item>> = adapterDelegateLayoutContainer<ToolItem.ToolModel, Item>(
//    R.layout.item_tools
//) {
//
//    val ivTool: ImageView = findViewById(R.id.ivTool)
//
//    bind { list ->
//        ivTool.setImageResource(item.type.value)
//        when (item.type) {
//
//            TOOLS.SIZE -> {
//                val textSelectedSize: TextView by lazy { findViewById(R.id.tvSelectedSize) }
//                textSelectedSize.text = item.selectedSize.value.toString()
//                ivTool.isVisible = false
//                textSelectedSize.isVisible = true
//            }
//
//            TOOLS.PALETTE -> {
//                ivTool.setColorFilter(
//                    context.resources.getColor(item.selectedColor.value, null),
//                    PorterDuff.Mode.SRC_IN
//                )
//            }
//            else -> {
//                if (item.isSelected) {
//                    ivTool.setBackgroundResource(R.drawable.bg_selected)
//                } else {
//                    ivTool.setBackgroundResource(android.R.color.transparent)
//                }
//            }
//        }
//
//        itemView.setOnClickListener {
//            onToolsClick(adapterPosition)
//        }
//    }
//}