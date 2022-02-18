package com.androd.antino.furnkart_android.forgotPassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.androd.antino.furnkart_android.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityForgotPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding= ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()


        binding.btnSend.setOnClickListener {
            val email=binding.etEmailForgotPassword.text.toString().trim()

            if(email.isEmpty())
            {
                Toast.makeText(applicationContext,"Enter the email",Toast.LENGTH_SHORT).show()
            }
            else
            {

            }


        }


    }
}