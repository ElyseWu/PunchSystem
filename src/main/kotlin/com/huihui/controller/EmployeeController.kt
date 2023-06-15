package com.huihui.controller

import com.huihui.entity.EmployeeEntity
import com.huihui.model.RegisterBody
import com.huihui.service.EmployeeService
import io.micronaut.http.annotation.*
import java.util.UUID

@Controller("/employee")
class EmployeeController (private val employeeService: EmployeeService){

    @Post("/create")
    fun createEmployee(@Body employeeEntity: EmployeeEntity) {
        employeeService.create(employeeEntity)
    }

    @Get("/{employeeId}")
    @Throws(Exception::class)
    fun getEmployeeById(@PathVariable("employeeId") employeeId: UUID): EmployeeEntity? {
        return employeeService.getEmployeeById(employeeId)
    }

//    @Put("/{employeeId}")
//    fun updateEmployee(@PathVariable employeeId: UUID, @Body body: RegisterBody) {
//        employeeService.updateEmployeeById(employeeId, body.email, body.firstName, body.lastName, body.role)
//    }

    @Delete("/{employeeId}")
    fun deleteEmployee(@PathVariable employeeId: UUID) {
        employeeService.deleteEmployee(employeeId)
    }
}