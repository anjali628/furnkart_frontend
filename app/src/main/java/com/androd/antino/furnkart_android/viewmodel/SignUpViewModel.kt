package com.androd.antino.furnkart_android.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.androd.antino.furnkart_android.Model.PostLogin
import com.androd.antino.furnkart_android.Model.PostLoginResponse
import com.androd.antino.furnkart_android.Model.PostSignUp
import com.androd.antino.furnkart_android.Model.PostSignUpResponse
import com.androd.antino.furnkart_android.repository.LoginRepository
import com.androd.antino.furnkart_android.repository.SignUpRepository
import kotlinx.coroutines.launch


class SignUpViewModel : ViewModel() {

    private val _signupResponse: MutableLiveData<PostSignUpResponse> = MutableLiveData()
    val signupResponse: LiveData<PostSignUpResponse> = _signupResponse


    fun getSignUp(postSignUp: PostSignUp) = viewModelScope.launch {
        try{

            val postSignUpResponse = SignUpRepository.postSignUp(postSignUp)
            _signupResponse.value = postSignUpResponse
        }
        catch (e:Exception){
            Log.d("Failed","Failed Response: ${e.message}")

        }

    }

}
