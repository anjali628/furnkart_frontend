package com.androd.antino.furnkart_android.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.androd.antino.furnkart_android.forgotPassword.ForgotPasswordActivity
import com.androd.antino.furnkart_android.Home_option1
import com.androd.antino.furnkart_android.R
import com.androd.antino.furnkart_android.model.PostLogin
import com.androd.antino.furnkart_android.databinding.ActivityLoginBinding
import com.androd.antino.furnkart_android.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {
   // private lateinit var googleSignInClient:GoogleSignInClient
    private lateinit var postLogin:PostLogin
    private lateinit var binding: ActivityLoginBinding
    private lateinit var loginViewModel:LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        var show:Boolean=false

        binding.eyeLogin.setOnClickListener {
            if (show) {
                show = false
                binding.eyeLogin.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                binding.etPasswordLogin.transformationMethod = PasswordTransformationMethod()

            } else {

                show = true
                binding.eyeLogin.setImageResource(R.drawable.ic_baseline_visibility_24)
                binding.etPasswordLogin.transformationMethod = null

            }
        }


        binding.tvForgotPassword.setOnClickListener {
            startActivity(Intent(this@LoginActivity, ForgotPasswordActivity::class.java))
        }

       /* // Configure Google Sign In
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        googleSignInClient = GoogleSignIn.getClient(this, gso)


*/

        binding.btnLogin.setOnClickListener {

            val email = binding.etEmailLogin.text.toString().trim()
            val password = binding.etPasswordLogin.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(applicationContext, "All Fields Are Required", Toast.LENGTH_SHORT)
                    .show()
            }

            else
            {
                loginAccountWithEmailAndPassword(email, password)
            }
        }
    }

    private fun loginAccountWithEmailAndPassword(email: String, password: String) {

        postLogin.email=email
        postLogin.password=password


        loginViewModel.getLogin(postLogin)
        loginViewModel = ViewModelProvider(this)[LoginViewModel::class.java]
        loginViewModel.loginResponse
        loginViewModel.loginResponse.observe(this, Observer {

           Toast.makeText(applicationContext,it.message,Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@LoginActivity, Home_option1::class.java))

        })

    }


    }



