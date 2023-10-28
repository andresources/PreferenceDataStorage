package com.preferencedatastorage

data class MerchantDetail(
    val emailAddress: String = "",
    val mobileNumber: String = "",
    val businessName: String = "",
    val businessAddress: String = "",
    val businessWebsite: String = "",
    val businessCategory: String = "",
    val businessLocation: String = "",
){
    fun getDetails() : String = "$emailAddress-$businessLocation"
}