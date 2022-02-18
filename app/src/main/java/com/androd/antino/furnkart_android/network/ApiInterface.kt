package com.androd.antino.furnkart_android.network

import com.androd.antino.furnkart_android.model.PostLogin
import com.androd.antino.furnkart_android.model.PostLoginResponse
import com.androd.antino.furnkart_android.model.PostSignUp
import com.androd.antino.furnkart_android.model.PostSignUpResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {

    companion object {
        const val BASE_URL = "https://fd3a-49-206-39-176.ngrok.io/api/v1/user/"
    }

    @POST("sign-up")
    suspend fun signup(
        @Body userSignUp:PostSignUp
    ):PostSignUpResponse


    @POST("log-in")
    suspend fun login(
        @Body userLogin:PostLogin
    ):PostLoginResponse


}






