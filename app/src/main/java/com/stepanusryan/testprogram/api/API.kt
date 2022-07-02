package com.stepanusryan.testprogram.api

import com.stepanusryan.testprogram.model.Checklist
import com.stepanusryan.testprogram.model.User
import retrofit2.Call
import retrofit2.http.*

interface API {
    @POST("register")
    fun addUser(@Body userData : User) : Call<User>
    @POST("login")
    fun postLogin() : Call<User>
    @GET("checklist")
    fun getAllCheckList():Call<Checklist>
    @GET("checklist/checklistId/item")
    fun getAllCheckListId():Call<Checklist>
    @POST("checklist")
    @GET("checklist/checklistId/item/checklistItemId")
    fun getAllCheckListIdItem():Call<Checklist>
    @POST("checklist")
    fun addChecklist(@Body name :String):Call<Checklist>
    @POST("checklist/checklistId/item")
    fun addChecklistId(@Body itemName :String):Call<Checklist>
    @DELETE("checklist/checklistId")
    fun delete()
    @DELETE("checklist/checklistId/item/checklistItemId")
    fun deleteChecklist()
    @PUT("checklist/checklistId/item/checklistItemId")
    fun update()
    @PUT("checklist/checklistId/item/rename/checklistItemId")
    fun rename()

}