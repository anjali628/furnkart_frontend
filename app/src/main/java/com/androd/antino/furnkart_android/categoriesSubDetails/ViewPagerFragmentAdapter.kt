package com.androd.antino.furnkart_android.categoriesSubDetails
import android.content.Context;
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerFragmentAdapter(fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {

    // this is for fragment tabs
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                //  val homeFragment: HomeFragment = HomeFragment()
                return TableFragment()
            }
            1 -> {
                return BenchesFragment()
            }
            2 -> {
                // val movieFragment = MovieFragment()
                return SlipcoversFragment()
            }
            3 ->
            {
                return LeatherFurniture()
            }
            else -> return TableFragment()
        }
    }

    // this counts total number of tabs
    override fun getCount(): Int {
        return totalTabs
    }
}