package com.androd.antino.furnkart_android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class CategoriesSubDetails2Activity : AppCompatActivity() {
    var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories_sub_details2)


            tabLayout = findViewById<TabLayout>(R.id.tl_sub_details)
            viewPager = findViewById<ViewPager>(R.id.vp_sub_details)


            tabLayout!!.addTab(tabLayout!!.newTab().setText("Tables"))
            tabLayout!!.addTab(tabLayout!!.newTab().setText("Benches"))
            tabLayout!!.addTab(tabLayout!!.newTab().setText("Slipcovers"))
            tabLayout!!.addTab(tabLayout!!.newTab().setText("Leather Furniture"))
            tabLayout!!.tabGravity = TabLayout.GRAVITY_FILL

            val adapter = ViewPagerFragmentAdapter(this, supportFragmentManager, tabLayout!!.tabCount)
            viewPager!!.adapter = adapter

            viewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

            tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab) {
                    viewPager!!.currentItem = tab.position
                }
                override fun onTabUnselected(tab: TabLayout.Tab) {

                }
                override fun onTabReselected(tab: TabLayout.Tab) {

                }
            })

        }

}