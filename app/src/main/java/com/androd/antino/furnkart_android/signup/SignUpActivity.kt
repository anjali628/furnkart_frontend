package com.androd.antino.furnkart_android.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.androd.antino.furnkart_android.R
import com.androd.antino.furnkart_android.model.PostSignUp
import com.androd.antino.furnkart_android.databinding.ActivitySignUpBinding
import com.androd.antino.furnkart_android.login.LoginActivity
import com.androd.antino.furnkart_android.viewmodel.SignUpViewModel

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var postSignup: PostSignUp
    private lateinit var signupViewModel: SignUpViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        var show:Boolean=false

        binding.eyeSignup.setOnClickListener {
            if (show) {
                show = false
                binding.eyeSignup.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                binding.etPasswordSignup.transformationMethod = PasswordTransformationMethod()

            } else {

                show = true
                binding.eyeSignup.setImageResource(R.drawable.ic_baseline_visibility_24)
                binding.etPasswordSignup.transformationMethod = null

            }
        }

        binding.tvSignin.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
            
        }

        binding.btnSignup.setOnClickListener {

            val email = binding.etEmailSignup.text.toString().trim()
            val password = binding.etPasswordSignup.text.toString().trim()
            val mobileNumber = binding.etPhoneSignup.text.toString().trim()
            val birthday = binding.etDobSignup.text.toString().trim()


            if (email.isEmpty() || password.isEmpty() || mobileNumber.isEmpty() || birthday.isEmpty()) {
                Toast.makeText(applicationContext, "All Fields Are Required", Toast.LENGTH_SHORT)
                    .show()
            }
            else if (password.length < 7) {
                Toast.makeText(
                    applicationContext, "Password Length Should Be Greater Than 7",
                    Toast.LENGTH_SHORT
                ).show()
            }

            else {
                signUpAccountWithEmailAndPassword(email, password, mobileNumber, birthday )
            }
            
        }
    }

    private fun signUpAccountWithEmailAndPassword(email: String, password: String, mobileNumber: String, birthday: String) {


        postSignup.email=email
        postSignup.password=password
        postSignup.mobileNumber=mobileNumber
        postSignup.birthday=birthday

        signupViewModel.getSignUp(postSignup)
        signupViewModel = ViewModelProvider(this)[SignUpViewModel::class.java]
        signupViewModel.signupResponse
        signupViewModel.signupResponse.observe(this, Observer {

            Toast.makeText(applicationContext,it.message,Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, LoginActivity::class.java))

        })

    }

}
