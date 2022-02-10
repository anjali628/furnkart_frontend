package com.androd.antino.furnkart_android.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.androd.antino.furnkart_android.repository.LoginRepository


class LoginViewModelFactory(private val LoginRepository: LoginRepository): ViewModelProvider.Factory{

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {

            return LoginViewModel(LoginRepository) as T

        }
    }
