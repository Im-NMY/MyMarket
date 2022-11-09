package com.example.market.ui

import android.content.Context
import android.util.AttributeSet
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.market.R
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter

//class CategoryLayout @JvmOverloads constructor(
//    context: Context,
//    attrs: AttributeSet? = null,
//    defStyleAttr: Int = 0
//) : CardView(context, attrs, defStyleAttr) {
//
//    private var onClick: (Int) -> Unit = {}
//
//    private val CategoryList: RecyclerView by lazy { findViewById(R.id.rvCategory) }
//
//    private val adapterDelegate = ListDelegationAdapter(
//        colorAdapterDelegate {
//            onClick(it)
//        },
//        toolsAdapterDelegate {
//            onClick(it)
//        },
//        sizeAdapterDelegate {
//            onClick(it)
//        }
//    )
//
//    override fun onAttachedToWindow() {
//        super.onAttachedToWindow()
//
//        CategoryList.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
//        CategoryList.setAdapterAndCleanupOnDetachFromWindow(adapterDelegate)
//    }
//
//    fun render(list: List<ToolItem>) {
//        adapterDelegate.setData(list)
//    }
//
//    fun setOnClickListener(onClick: (Int) -> Unit) {
//        this.onClick = onClick
//    }
//}
