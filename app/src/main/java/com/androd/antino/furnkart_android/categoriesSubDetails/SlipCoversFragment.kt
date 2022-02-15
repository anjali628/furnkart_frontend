package com.androd.antino.furnkart_android.categoriesSubDetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.androd.antino.furnkart_android.R
import com.androd.antino.furnkart_android.databinding.FragmentSlipCoversBinding
import com.androd.antino.furnkart_android.model.SlipCoversModel

class SlipcoversFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerView_slipcover_Adapter: SlipCoversFragmentAdapter
    private lateinit var dataList:ArrayList<SlipCoversModel>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_slip_covers, container, false)

        recyclerView=view.findViewById(R.id.rv_slipcovers)
        dataList=ArrayList()

        initRecyclerView()

        dataList.add(SlipCoversModel(R.drawable.living_1,"$166",1))
        dataList.add(SlipCoversModel(R.drawable.living_2,"$166",1))
        dataList.add(SlipCoversModel(R.drawable.living_3,"$166",1))
        dataList.add(SlipCoversModel(R.drawable.living_4,"$166",1))
        dataList.add(SlipCoversModel(R.drawable.living_1,"$166",1))
        dataList.add(SlipCoversModel(R.drawable.living_1,"$166",1))
        dataList.add(SlipCoversModel(R.drawable.living_2,"$166",1))
        dataList.add(SlipCoversModel(R.drawable.living_3,"$166",1))
        dataList.add(SlipCoversModel(R.drawable.living_4,"$166",1))
        dataList.add(SlipCoversModel(R.drawable.living_1,"$166",1))

        recyclerView_slipcover_Adapter.notifyDataSetChanged()

        return view
    }


    private fun initRecyclerView() {

      recyclerView_slipcover_Adapter= context?.let { SlipCoversFragmentAdapter(it,dataList) }!!
        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = StaggeredGridLayoutManager(2,LinearLayoutManager.VERTICAL)
            adapter = recyclerView_slipcover_Adapter

        }

    }
}











