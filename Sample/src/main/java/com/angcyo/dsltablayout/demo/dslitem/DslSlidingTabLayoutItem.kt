package com.angcyo.dsltablayout.demo.dslitem

import com.angcyo.dsladapter.DslAdapterItem
import com.angcyo.dsladapter.DslViewHolder
import com.angcyo.dsltablayout.demo.R
import com.angcyo.dsltablayout.demo.getDrawable2
import com.angcyo.dsltablayout.demo.randomColor
import com.angcyo.tablayout.DslTabLayout

/**
 *
 * Email:angcyo@126.com
 * @author angcyo
 * @date 2019/11/23
 */
class DslSlidingTabLayoutItem : DslAdapterItem() {
    init {
        itemLayoutId = R.layout.item_sliding_tab_layout
    }

    override fun onItemBind(
        itemHolder: DslViewHolder,
        itemPosition: Int,
        adapterItem: DslAdapterItem
    ) {
        super.onItemBind(itemHolder, itemPosition, adapterItem)

        itemHolder.v<DslTabLayout>(R.id.tab_layout)?.apply {
            setBackgroundColor(randomColor())
            tabIndicator.indicatorDrawable =
                itemHolder.itemView.context.getDrawable2(R.drawable.indicator_white_line)
        }
    }
}