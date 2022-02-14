package com.androd.antino.furnkart_android

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.androd.antino.furnkart_android.Model.SlipCoversModel
import com.androd.antino.furnkart_android.SlipCoversFragmentAdapter.*

class SlipCoversFragmentAdapter(var context: Context):RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder>(){


    var dataList= emptyList<SlipCoversModel>()

    suspend fun setDataList(dataList:List<SlipCoversModel>)
    {
        this.dataList=dataList
    }

    class ViewHolder (itemView:View):RecyclerView.ViewHolder(itemView)
    {
        var iv_living1:ImageView
        var tv_rate:TextView
        var ib_fav:ImageButton

        init {

            iv_living1=itemView.findViewById(R.id.iv_living1)
            tv_rate=itemView.findViewById(R.id.tv_rate)
            ib_fav=itemView.findViewById(R.id.ib_fav)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


        var view=LayoutInflater.from(parent.context).inflate(R.layout.categories_sub_details2_each_item,parent,false)
        return ViewHolder(view)
    }


    override fun getItemCount()=dataList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        var data=dataList[position]

        holder.itemView.tv_te

    }

}