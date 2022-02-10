package com.androd.antino.furnkart_android.repository

import com.androd.antino.furnkart_android.Model.PostSignUp
import com.androd.antino.furnkart_android.Network.RetrofitBuilder

object SignUpRepository {
    suspend fun postSignUp(postSignUp: PostSignUp)= RetrofitBuilder.api.signup(postSignUp)

}