package com.company.model

data class Property(
    val type: String,
    val area: Int? = null,
    val rooms: Int? = null,
    val houseArea: Int? = null,
    val address: String? = null,
    val price: Int? = null
)