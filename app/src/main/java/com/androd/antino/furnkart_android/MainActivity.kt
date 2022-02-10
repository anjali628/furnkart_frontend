package com.androd.antino.furnkart_android

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androd.antino.furnkart_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}