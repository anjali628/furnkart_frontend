package com.androd.antino.furnkart_android.categoriesSubDetails

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.androd.antino.furnkart_android.R
import com.androd.antino.furnkart_android.model.SlipCoversModel

class SlipCoversFragmentAdapter(var context: Context) :
        RecyclerView.Adapter<SlipCoversFragmentAdapter.SlipCoverViewHolder>()
{


    var dataList = emptyList<SlipCoversModel>()

    suspend fun setDataList(dataList: List<SlipCoversModel>) {
        this.dataList = dataList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SlipCoverViewHolder {
        return SlipCoverViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.categories_sub_details2_each_item,parent,false))

    }

    override fun onBindViewHolder(holder: SlipCoverViewHolder, position: Int) {
        holder.iv_living1
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class SlipCoverViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
    {
        val iv_living1:ImageView=itemView.findViewById(R.id.iv_living1)

        val ib_

    }


}
