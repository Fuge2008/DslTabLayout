package com.angcyo.dsltablayout.demo.dslitem

import com.angcyo.dsladapter.DslAdapterItem
import com.angcyo.dsladapter.DslViewHolder
import com.angcyo.dsladapter.dpi
import com.angcyo.dsltablayout.demo.R
import com.angcyo.tablayout.DslTabLayout

/**
 *
 * Email:angcyo@126.com
 * @author angcyo
 * @date 2019/11/23
 */
class DslSegmentTabLayoutItem : DslAdapterItem() {

    init {
        itemTopInsert = 10 * dpi
        itemLayoutId = R.layout.item_segment_tab_layout
    }

    override fun onItemBind(
        itemHolder: DslViewHolder,
        itemPosition: Int,
        adapterItem: DslAdapterItem
    ) {
        super.onItemBind(itemHolder, itemPosition, adapterItem)

        itemHolder.v<DslTabLayout>(R.id.tab_layout)?.apply {

        }
    }
}