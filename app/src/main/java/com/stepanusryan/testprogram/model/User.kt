package com.stepanusryan.testprogram.model
import com.google.gson.annotations.SerializedName

data class User(
    @field:SerializedName("email")
    var email :String ?= null,
    @field:SerializedName("username")
    var username :String ?= null,
    @field:SerializedName("username")
    var password :String ?= null
)