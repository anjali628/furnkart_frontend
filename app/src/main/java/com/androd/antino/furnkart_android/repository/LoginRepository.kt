package com.androd.antino.furnkart_android.repository

import com.androd.antino.furnkart_android.model.PostLogin
import com.androd.antino.furnkart_android.network.RetrofitBuilder

object LoginRepository  {

    suspend fun postLogin(postLogin: PostLogin) = RetrofitBuilder.api.login(postLogin)

    }