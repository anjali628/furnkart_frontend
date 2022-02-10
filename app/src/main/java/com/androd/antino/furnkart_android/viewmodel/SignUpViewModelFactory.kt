package com.androd.antino.furnkart_android.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.androd.antino.furnkart_android.repository.LoginRepository
import com.androd.antino.furnkart_android.repository.SignUpRepository


class SignUpViewModelFactory(private val SignUpRepository: SignUpRepository): ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        return SignUpViewModel(SignUpRepository) as T

    }
}
