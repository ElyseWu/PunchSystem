//package com.huihui.repository
//
//import com.huihui.entity.PunchTimeEntity
//import io.micronaut.data.jdbc.annotation.JdbcRepository
//import io.micronaut.data.model.query.builder.sql.Dialect
//import io.micronaut.data.repository.CrudRepository
//import java.util.*
//
//@JdbcRepository(dialect = Dialect.POSTGRES)
//interface PunchTimeRepository : CrudRepository<PunchTimeEntity, UUID> {
//    fun getPunchTimeEntitiesByEmployeeId(employeeId: UUID?): List<PunchTimeEntity?>?
//}