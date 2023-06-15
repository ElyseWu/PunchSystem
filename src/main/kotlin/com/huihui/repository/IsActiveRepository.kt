package com.huihui.repository

import com.huihui.entity.IsActiveEntity
import io.micronaut.data.annotation.Query
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import java.util.*

@JdbcRepository(dialect = Dialect.POSTGRES)
interface IsActiveRepository : CrudRepository<IsActiveEntity, UUID> {
    @Override
    @Query("UPDATE is_active SET is_active = false WHERE employee_id = :employeeId")
    fun setIsActiveFalse(employeeId: UUID)

    fun getIsActiveEntityByEmployeeId(employeeId: UUID): IsActiveEntity?
}