//package com.huihui.repository
//
//import com.huihui.entity.RequestTimeEntity
//import io.micronaut.data.jdbc.annotation.JdbcRepository
//import io.micronaut.data.model.query.builder.sql.Dialect
//import io.micronaut.data.repository.CrudRepository
//import java.util.*
//
//@JdbcRepository(dialect = Dialect.POSTGRES)
//interface RequestTimeRepository : CrudRepository<RequestTimeEntity, UUID> {
//    fun getRequestTimeOffEntityByEmployeeId(employeeId: UUID?): List<RequestTimeEntity?>?
//}