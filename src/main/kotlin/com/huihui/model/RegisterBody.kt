package com.huihui.model


data class RegisterBody(
    val email: String,
    val password: String,
    val firstName: String,
    val lastName: String,
    val role: String
)
