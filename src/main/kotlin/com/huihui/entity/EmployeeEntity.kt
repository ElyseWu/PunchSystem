package com.huihui.entity

import io.micronaut.data.annotation.AutoPopulated
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import java.util.*


@MappedEntity(value = "employees")
data class EmployeeEntity(
    @field:Id
//    @Id
    @GeneratedValue
//    val id: Long?,
    val id: UUID?,
    val email: String,
    val password: String,
    val firstName: String,
    val lastName: String,
    val role: String
)
