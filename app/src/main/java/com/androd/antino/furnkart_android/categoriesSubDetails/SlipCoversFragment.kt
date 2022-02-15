package com.androd.antino.furnkart_android.categoriesSubDetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.androd.antino.furnkart_android.R
import com.androd.antino.furnkart_android.categoriesSubDetails.SlipCoversFragmentAdapter
import com.androd.antino.furnkart_android.databinding.FragmentSlipCoversBinding
import com.androd.antino.furnkart_android.databinding.FragmentSlipcoversBinding

class SlipcoversFragment : Fragment() {
    private lateinit var recyclerView_slipcovers: SlipCoversFragmentAdapter

    private lateinit var binding: FragmentSlipCoversBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        val view= inflater!!.inflate(R.layout.fragment_slipcovers, container, false)
        return view


        //initRecyclerView()


        /* val dogRepository = DogRepository()
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
*/
    }

}









