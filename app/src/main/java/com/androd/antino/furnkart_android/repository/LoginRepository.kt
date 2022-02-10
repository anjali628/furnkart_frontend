package com.androd.antino.furnkart_android.repository

import com.androd.antino.furnkart_android.Model.PostLogin
import com.androd.antino.furnkart_android.Model.PostSignUp
import com.androd.antino.furnkart_android.Network.RetrofitBuilder

object LoginRepository  {

    suspend fun postLogin(postLogin: PostLogin) = RetrofitBuilder.api.login(postLogin)

    }