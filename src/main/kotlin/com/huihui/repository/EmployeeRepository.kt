package com.huihui.repository

import com.huihui.entity.EmployeeEntity
import io.micronaut.data.annotation.Query
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import java.util.*

@JdbcRepository(dialect = Dialect.POSTGRES)
interface EmployeeRepository : CrudRepository<EmployeeEntity, UUID> {
    fun getEmployeeEntityById(employeeID: UUID): EmployeeEntity
    fun getEmployeeEntityByEmail(email: String): EmployeeEntity
    fun updateEmployeeEntityById(employeeID: UUID, employeeEntity: EmployeeEntity) : EmployeeEntity

//    @Override
//    @Query("UPDATE employees SET email = :email, first_name = :firstName, last_name = :lastName, role = :role WHERE id = :employeeId")
//    fun updateNameByEmail(employeeId: UUID, email: String, firstName: String, lastName: String, role: String)
}