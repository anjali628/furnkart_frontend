package com.androd.antino.furnkart_android

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.androd.antino.furnkart_android.databinding.ActivityMainBinding
import com.androd.antino.furnkart_android.databinding.FragmentSlipcoversBinding

class SlipcoversFragment : Fragment() {
    private lateinit var recyclerView_slipcovers: SlipCoversFragmentAdapter

    private lateinit var binding: FragmentSlipcoversBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        val view= inflater!!.inflate(R.layout.fragment_slipcovers, container, false)
        return view


            initRecyclerView()


            val dogRepository = DogRepository()
            dogViewModel = ViewModelProvider(this, viewModelFactory)[DogViewModel::class.java]
            dogViewModel.getDogPhotos()
            dogViewModel.dogMutableLiveData.observe(this, Observer {

                for (i in 0 until it.size) {
                    Log.d("TAG_IMAGES_OF_DOG", "onCreate: " + it.get(i).url)

                }
                dogAdapter.setData(it as ArrayList<Dog>)

                binding.progressBar.visibility= View.INVISIBLE
                binding.recyclerView.visibility= View.VISIBLE
            })

        }

        private fun initRecyclerView() {

            dogAdapter = DogAdapter(this, ArrayList())
            binding.rvSlipcovers.apply {
                setHasFixedSize(true)
                layoutManager = GridLayoutManager(this)
                adapter = dogAdapter

            }
        }
    }




}




}