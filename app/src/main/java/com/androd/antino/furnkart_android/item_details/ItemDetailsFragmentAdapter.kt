package com.androd.antino.furnkart_android.item_details

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.androd.antino.furnkart_android.R


class ItemDetailsFragmentAdapter(private val images:List<Int>):
    RecyclerView.Adapter<ItemDetailsFragmentAdapter.ViewPagerViewHolder>() {

    inner  class ViewPagerViewHolder(itemView:View): RecyclerView.ViewHolder(itemView)
    {
        val imageView: ImageView = itemView.findViewById(R.id.img_corner_sofa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_details_each_item,parent,false)
        return ViewPagerViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val Image=images[position]
        //holder.itemView.ivImage.setIMage
        holder.imageView.setImageResource(Image)
    }

    override fun getItemCount(): Int {
        return images.size
    }

}




