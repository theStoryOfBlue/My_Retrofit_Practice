package com.example.retrofit_practice.Data

data class Data(
    val code: String,
    val count: Int,
    val list: List<Detail>,
    val message: String
)