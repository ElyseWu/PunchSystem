package com.huihui.entity

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import java.util.*

@MappedEntity(value = "is_active")
data class IsActiveEntity(
    @field:Id
    @GeneratedValue
    val id: UUID?,
    val employeeId: UUID,
    val isActive: Boolean
)
