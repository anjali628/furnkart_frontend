package com.androd.antino.furnkart_android

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.androd.antino.furnkart_android.databinding.ActivityItemDetailsBinding
import com.androd.antino.furnkart_android.item_details.ItemDetailsFragmentAdapter

class ItemDeatailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityItemDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityItemDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val images= listOf(R.drawable.corner_sofa_itemdetails,R.drawable.corner_sofa_itemdetails,R.drawable.corner_sofa_itemdetails,
            R.drawable.corner_sofa_itemdetails,R.drawable.corner_sofa_itemdetails)

        val adapter= ItemDetailsFragmentAdapter(images)
        binding.vpItemDetails.adapter=adapter

        binding.vpItemDetails.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                changeColor()
                super.onPageSelected(position)

            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
                changeColor()

            }

            override fun onPageScrolled(position: Int,
                                        positionOffset: Float,
                                        positionOffsetPixels: Int) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)

            }
        })



    }
    fun changeColor() {

        val value = binding.vpItemDetails.currentItem

        if (value == 0) {

            binding.ivDot1.setImageResource(R.drawable.selected_dot)
            binding.ivDot2.setImageResource(R.drawable.normal_dot)
            binding.ivDot3.setImageResource(R.drawable.normal_dot)
            binding.ivDot4.setImageResource(R.drawable.normal_dot)
            binding.ivDot5.setImageResource(R.drawable.normal_dot)
            binding.ivDouble1.visibility=View.VISIBLE
            binding.ivDouble2.visibility=View.INVISIBLE
            binding.ivDouble3.visibility=View.INVISIBLE
            binding.ivDouble4.visibility=View.INVISIBLE
            binding.ivDouble5.visibility=View.INVISIBLE
            binding.ivDouble11.visibility=View.VISIBLE
            binding.ivDouble22.visibility=View.INVISIBLE
            binding.ivDouble33.visibility=View.INVISIBLE
            binding.ivDouble44.visibility=View.INVISIBLE
            binding.ivDouble55.visibility=View.INVISIBLE


        } else if (value == 1) {

            binding.ivDot1.setImageResource(R.drawable.normal_dot)
            binding.ivDot2.setImageResource(R.drawable.selected_dot)
            binding.ivDot3.setImageResource(R.drawable.normal_dot)
            binding.ivDot4.setImageResource(R.drawable.normal_dot)
            binding.ivDot5.setImageResource(R.drawable.normal_dot)

            binding.ivDouble1.visibility=View.INVISIBLE
            binding.ivDouble2.visibility=View.VISIBLE
            binding.ivDouble3.visibility=View.INVISIBLE
            binding.ivDouble4.visibility=View.INVISIBLE
            binding.ivDouble5.visibility=View.INVISIBLE
            binding.ivDouble11.visibility=View.INVISIBLE
            binding.ivDouble22.visibility=View.VISIBLE
            binding.ivDouble33.visibility=View.INVISIBLE
            binding.ivDouble44.visibility=View.INVISIBLE
            binding.ivDouble55.visibility=View.INVISIBLE


        } else if (value == 2) {

            binding.ivDot1.setImageResource(R.drawable.normal_dot)
            binding.ivDot2.setImageResource(R.drawable.normal_dot)
            binding.ivDot3.setImageResource(R.drawable.selected_dot)
            binding.ivDot4.setImageResource(R.drawable.normal_dot)
            binding.ivDot5.setImageResource(R.drawable.normal_dot)
            binding.ivDouble1.visibility=View.INVISIBLE
            binding.ivDouble2.visibility=View.INVISIBLE
            binding.ivDouble3.visibility=View.VISIBLE
            binding.ivDouble4.visibility=View.INVISIBLE
            binding.ivDouble5.visibility=View.INVISIBLE
            binding.ivDouble11.visibility=View.INVISIBLE
            binding.ivDouble22.visibility=View.INVISIBLE
            binding.ivDouble33.visibility=View.VISIBLE
            binding.ivDouble44.visibility=View.INVISIBLE
            binding.ivDouble55.visibility=View.INVISIBLE

        } else if (value == 3) {

            binding.ivDot1.setImageResource(R.drawable.normal_dot)
            binding.ivDot2.setImageResource(R.drawable.normal_dot)
            binding.ivDot3.setImageResource(R.drawable.normal_dot)
            binding.ivDot4.setImageResource(R.drawable.selected_dot)
            binding.ivDot5.setImageResource(R.drawable.normal_dot)
            binding.ivDouble1.visibility=View.INVISIBLE
            binding.ivDouble2.visibility=View.INVISIBLE
            binding.ivDouble3.visibility=View.INVISIBLE
            binding.ivDouble4.visibility=View.VISIBLE
            binding.ivDouble5.visibility=View.INVISIBLE
            binding.ivDouble11.visibility=View.INVISIBLE
            binding.ivDouble22.visibility=View.INVISIBLE
            binding.ivDouble33.visibility=View.INVISIBLE
            binding.ivDouble44.visibility=View.VISIBLE
            binding.ivDouble55.visibility=View.INVISIBLE

        } else if (value == 4) {
            binding.ivDot1.setImageResource(R.drawable.normal_dot)
            binding.ivDot2.setImageResource(R.drawable.normal_dot)
            binding.ivDot3.setImageResource(R.drawable.normal_dot)
            binding.ivDot4.setImageResource(R.drawable.normal_dot)
            binding.ivDot5.setImageResource(R.drawable.selected_dot)
            binding.ivDouble1.visibility=View.INVISIBLE
            binding.ivDouble2.visibility=View.INVISIBLE
            binding.ivDouble3.visibility=View.INVISIBLE
            binding.ivDouble4.visibility=View.INVISIBLE
            binding.ivDouble5.visibility=View.VISIBLE
            binding.ivDouble11.visibility=View.INVISIBLE
            binding.ivDouble22.visibility=View.INVISIBLE
            binding.ivDouble33.visibility=View.INVISIBLE
            binding.ivDouble44.visibility=View.INVISIBLE
            binding.ivDouble55.visibility=View.VISIBLE

        }
    }
}