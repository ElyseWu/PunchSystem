package com.huihui.repository

import com.huihui.entity.TimeSheetEntity
import io.micronaut.data.annotation.Query
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import java.util.*

@JdbcRepository(dialect = Dialect.POSTGRES)
interface TimeSheetRepository : CrudRepository<TimeSheetEntity, UUID> {
    fun getByEmployeeId(employeeId: UUID): TimeSheetEntity

    @Override
    @Query("UPDATE time_sheet SET total_working_time = :totalWorkingTime WHERE id = :timeSheetId")
    fun updateTotalWorkingTime(timeSheetId: Long?, totalWorkingTime: Double?)
}