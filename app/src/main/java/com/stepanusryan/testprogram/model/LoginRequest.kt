package com.stepanusryan.testprogram.model

import com.google.gson.annotations.SerializedName

data class LoginRequest (
    @field:SerializedName("username")
    var username :String?= null,
    @field:SerializedName("password")
    var password :String?= null
)