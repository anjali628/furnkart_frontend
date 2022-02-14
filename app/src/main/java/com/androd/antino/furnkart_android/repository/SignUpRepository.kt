package com.androd.antino.furnkart_android.repository

import com.androd.antino.furnkart_android.model.PostSignUp
import com.androd.antino.furnkart_android.network.RetrofitBuilder

object SignUpRepository {
    suspend fun postSignUp(postSignUp: PostSignUp)= RetrofitBuilder.api.signup(postSignUp)

}