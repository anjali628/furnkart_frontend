package com.androd.antino.furnkart_android.model

data class PostSignUpResponse(
    val message:String,
    val profile:Profile
){
    data class Profile(
        val email: String,
        val email_hash:String,
        val email_verified:Boolean,
        val password:String,
        val country_code:String,
        val mobileNumber:String,
        val mobileNumber_hash:String,
        val mobile_verified:String,
        val address:List<String>,
        val birthday:String,
        val verification_otp:String,
        val verification_otp_session_id:String,
        val _id:String,
        val createdAt:String,
        val updatedAt:String,
        val __v:Int

    )
}


