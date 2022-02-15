package com.androd.antino.furnkart_android.categoriesSubDetails

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.androd.antino.furnkart_android.R
import com.androd.antino.furnkart_android.model.SlipCoversModel

class SlipCoversFragmentAdapter(private val context:Context, private var slipList:ArrayList<SlipCoversModel>) :
        RecyclerView.Adapter<SlipCoversFragmentAdapter.SlipCoverViewHolder>()
{

    class SlipCoverViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
    {
        val iv_living1:ImageView=itemView.findViewById(R.id.iv_living1)
        val ib_fav:ImageButton=itemView.findViewById(R.id.ib_fav)
        val tv_rate:TextView=itemView.findViewById(R.id.tv_rate)
        val view_each_item:View=itemView.findViewById(R.id.view_each_item)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SlipCoverViewHolder {
        return SlipCoverViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.categories_sub_details2_each_item,parent,false))

    }

    override fun onBindViewHolder(holder: SlipCoverViewHolder, position: Int) {
        holder.iv_living1.setImageResource(slipList.get(position).iv_living1)
        //holder.ib_fav.setImageResource(slipList.get(position).ib_fav)
        holder.tv_rate.text=slipList.get(position).tv_rate

        if (position==1)
        {
            holder.view_each_item.visibility=View.VISIBLE

        }
        else{
            holder.view_each_item.visibility=View.GONE
        }
    }

    override fun getItemCount(): Int {
        return slipList.size
    }

 /*   fun setDataList(dataList: List<SlipCoversModel>) {
        this.dataList = dataList
    }
*/

}
