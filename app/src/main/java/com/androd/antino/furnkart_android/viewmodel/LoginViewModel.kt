package com.androd.antino.furnkart_android.viewmodel

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.androd.antino.furnkart_android.Model.PostLogin
import com.androd.antino.furnkart_android.Model.PostLoginResponse
import com.androd.antino.furnkart_android.repository.LoginRepository
import com.androd.antino.furnkart_android.repository.SignUpRepository
import kotlinx.coroutines.launch

class LoginViewModel(LoginRepository: LoginRepository) :ViewModel() {

    private val _loginResponse:MutableLiveData<PostLoginResponse> = MutableLiveData()
    val loginResponse:LiveData<PostLoginResponse> = _loginResponse


    fun getLogin(postLogin: PostLogin) = viewModelScope.launch {
        try{

            val postLoginResponse = LoginRepository.postLogin(postLogin)
            _loginResponse.value = postLoginResponse
        }
        catch (e:Exception){
            Log.d("Failed","Failed Response: ${e.message}")

        }

    }

}



