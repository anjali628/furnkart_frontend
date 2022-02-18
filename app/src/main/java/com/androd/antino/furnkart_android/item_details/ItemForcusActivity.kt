package com.androd.antino.furnkart_android

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.androd.antino.furnkart_android.databinding.ActivityItemDetailsBinding
import com.androd.antino.furnkart_android.databinding.ActivityItemForcusBinding
import com.androd.antino.furnkart_android.item_details.ItemDetailsFragmentAdapter

class ItemForcus : AppCompatActivity() {

    private lateinit var binding: ActivityItemForcusBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemForcusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val images = listOf(
            R.drawable.corner_sofa_itemdetails,
            R.drawable.corner_sofa_itemdetails,
            R.drawable.corner_sofa_itemdetails,
            R.drawable.corner_sofa_itemdetails,
            R.drawable.corner_sofa_itemdetails
        )

        val adapter = ItemDetailsFragmentAdapter(images)
        binding.vpItemForcus.adapter = adapter

        binding.vpItemForcus.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                changeColor()
                super.onPageSelected(position)

            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
                changeColor()

            }

        })

    }

    fun changeColor() {

        val value = binding.vpItemForcus.currentItem

        if (value == 0) {

            binding.ivDote1.setImageResource(R.drawable.selected_dot)
            binding.ivDote2.setImageResource(R.drawable.normal_dot)
            binding.ivDote3.setImageResource(R.drawable.normal_dot)
            binding.ivDote4.setImageResource(R.drawable.normal_dot)
            binding.ivDote5.setImageResource(R.drawable.normal_dot)
            binding.ivDouble1.visibility = View.VISIBLE
            binding.ivDouble2.visibility = View.INVISIBLE
            binding.ivDouble3.visibility = View.INVISIBLE
            binding.ivDouble4.visibility = View.INVISIBLE
            binding.ivDouble5.visibility = View.INVISIBLE



        } else if (value == 1) {
            binding.ivDote1.setImageResource(R.drawable.normal_dot)
            binding.ivDote2.setImageResource(R.drawable.selected_dot)
            binding.ivDote3.setImageResource(R.drawable.normal_dot)
            binding.ivDote4.setImageResource(R.drawable.normal_dot)
            binding.ivDote5.setImageResource(R.drawable.normal_dot)
            binding.ivDouble1.visibility = View.INVISIBLE
            binding.ivDouble2.visibility = View.VISIBLE
            binding.ivDouble3.visibility = View.INVISIBLE
            binding.ivDouble4.visibility = View.INVISIBLE
            binding.ivDouble5.visibility = View.INVISIBLE

        } else if (value == 2) {

            binding.ivDote1.setImageResource(R.drawable.normal_dot)
            binding.ivDote2.setImageResource(R.drawable.normal_dot)
            binding.ivDote3.setImageResource(R.drawable.selected_dot)
            binding.ivDote4.setImageResource(R.drawable.normal_dot)
            binding.ivDote5.setImageResource(R.drawable.normal_dot)
            binding.ivDouble1.visibility = View.INVISIBLE
            binding.ivDouble2.visibility = View.INVISIBLE
            binding.ivDouble3.visibility = View.VISIBLE
            binding.ivDouble4.visibility = View.INVISIBLE
            binding.ivDouble5.visibility = View.INVISIBLE

        } else if (value == 3) {

            binding.ivDote1.setImageResource(R.drawable.normal_dot)
            binding.ivDote2.setImageResource(R.drawable.normal_dot)
            binding.ivDote3.setImageResource(R.drawable.normal_dot)
            binding.ivDote4.setImageResource(R.drawable.selected_dot)
            binding.ivDote5.setImageResource(R.drawable.normal_dot)
            binding.ivDouble1.visibility = View.INVISIBLE
            binding.ivDouble2.visibility = View.INVISIBLE
            binding.ivDouble3.visibility = View.INVISIBLE
            binding.ivDouble4.visibility = View.VISIBLE
            binding.ivDouble5.visibility = View.INVISIBLE

        } else if (value == 4) {
            binding.ivDote1.setImageResource(R.drawable.normal_dot)
            binding.ivDote2.setImageResource(R.drawable.normal_dot)
            binding.ivDote3.setImageResource(R.drawable.normal_dot)
            binding.ivDote4.setImageResource(R.drawable.normal_dot)
            binding.ivDote5.setImageResource(R.drawable.selected_dot)
            binding.ivDouble1.visibility = View.INVISIBLE
            binding.ivDouble2.visibility = View.INVISIBLE
            binding.ivDouble3.visibility = View.INVISIBLE
            binding.ivDouble4.visibility = View.INVISIBLE
            binding.ivDouble5.visibility = View.VISIBLE

        }
    }
}