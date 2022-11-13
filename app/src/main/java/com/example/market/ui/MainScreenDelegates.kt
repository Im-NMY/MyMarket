package com.example.market.ui

import androidx.core.view.isVisible
import androidx.recyclerview.widget.GridLayoutManager
import com.example.market.base.Item
import com.example.market.databinding.*
import com.example.market.domain.CategoryModel
import com.example.market.domain.phones.BestProductsModel
import com.example.market.domain.phones.HotProductsModel
import com.example.market.domain.testmodel.BestProdListItem
import com.example.market.domain.testmodel.CategoriesListItem
import com.example.market.domain.testmodel.HotProdListItem
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding


//        Glide.with(holder.itemView).load(productData.HotProductsList[position].picture).fitCenter().into(holder.ivHotProd)
object MainScreenDelegates {

    /**
     * Делегат для отоброжения Item с вложенным списком для Hot Sales
     * Имеет свой Адаптер для заполнения списка
     */
    val horizontalCategoryDelegate =
        adapterDelegateViewBinding<CategoriesListItem, Item, RvItemHorizontalCategoryBinding>(
            { layoutInflater, container ->
                RvItemHorizontalCategoryBinding.inflate(layoutInflater, container, false).apply {
                    recyclerView.adapter = horizontalAdapter1

                }
            }
        ) {
            bind {
                (binding.recyclerView.adapter as ListDelegationAdapter<List<Item>>).apply {
                    items = item.iconList
                    notifyDataSetChanged()
                }
            }
        }
    /**
     * Делегат для отоброжения Item CardView
     * инициализирует все имеющие View
     */
    private val categoriesDelegate =
        adapterDelegateViewBinding<CategoryModel, Item, CvItemCategoriesBinding>(
            { inflater, container ->
                CvItemCategoriesBinding.inflate(inflater, container, false)
            }
        ) {
            bind {
                binding.ivCategory.setImageResource(item.category)

            }
        }

    private val horizontalAdapter1 = ListDelegationAdapter(
        categoriesDelegate
    )

    val horizontalHotProdDelegate =
        adapterDelegateViewBinding<HotProdListItem, Item, RvItemHorizontalHotProdBinding>(
            { layoutInflater, container ->
                RvItemHorizontalHotProdBinding.inflate(layoutInflater, container, false).apply {
                    rvHorizontalHotProd.adapter = horizontalAdapter2
                }
            }
        ) {
            bind {
                (binding.rvHorizontalHotProd.adapter as ListDelegationAdapter<List<Item>>).apply {
                    items = item.HotProductsList
                    notifyDataSetChanged()

                }
            }
        }
    private val hotProdDelegate =
        adapterDelegateViewBinding<HotProductsModel, Item, CvItemHotProductBinding>(
            { inflater, container ->
                CvItemHotProductBinding.inflate(inflater, container, false)
            }
        ) {
            bind {
                binding.cvNew.isVisible = item.isNew
                binding.tvTitle.text = item.title
                binding.tvSubtitle.text = item.subtitle
            }
        }
    private val horizontalAdapter2 = ListDelegationAdapter(
        hotProdDelegate
    )

    val verticalBestProd =
        adapterDelegateViewBinding<BestProdListItem, Item, RvItemVerticalBestProdBinding>(
            { inflater, container ->
                RvItemVerticalBestProdBinding.inflate(inflater, container, false).apply {
                    recyclerView.adapter = verticalAdapter
                    recyclerView.layoutManager = GridLayoutManager(container.context,2)
                }
            }
        ) {
            bind {
                (binding.recyclerView.adapter as ListDelegationAdapter<List<Item>>).apply {
                    items = item.BestProductsList
                    notifyDataSetChanged()
                }
            }
        }

    private val bestProdDelegate =
        adapterDelegateViewBinding<BestProductsModel, Item, CvItemBestProductBinding>(
            { inflater, container ->
                CvItemBestProductBinding.inflate(inflater, container, false)
            }
        ){
            bind {
                binding.tvBestPrice.text = item.price.toString()
                binding.tvBestTitle.text = item.title
                binding.tvBestDiscount.text = item.discount.toString()
            }
        }
    private val verticalAdapter = ListDelegationAdapter(
        bestProdDelegate
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