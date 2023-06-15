package com.huihui.service

import com.huihui.entity.EmployeeEntity
import com.huihui.entity.IsActiveEntity
import com.huihui.entity.TimeSheetEntity
import com.huihui.repository.EmployeeRepository
import com.huihui.repository.IsActiveRepository
import com.huihui.repository.TimeSheetRepository
import jakarta.inject.Singleton
import java.util.*

@Singleton
class EmployeeService (private val employeeRepository: EmployeeRepository,
                       private val isActiveRepository: IsActiveRepository,
                       private val timeSheetRepository: TimeSheetRepository,) {



    fun create(
        employeeEntity: EmployeeEntity
    ) {
        //1. create new emoloyee into employee table
        //2. create new isActive into isActive table
        //3. create a timesheet row to this new employee
        employeeRepository.save(employeeEntity)
        //        employeeRepository.updateNameByEmail(email, firstName, lastName, role);
        val savedEmployee: EmployeeEntity = employeeRepository.getEmployeeEntityByEmail(employeeEntity.email)
        val employeeId: UUID = savedEmployee.id ?: throw IllegalStateException("Employee ID cannot be null")
        val newIsActive = IsActiveEntity(null, employeeId, true)
        isActiveRepository.save(newIsActive)
        val timeSheet = TimeSheetEntity(null, employeeId, 0.0)
        timeSheetRepository.save(timeSheet)
    }

    @Throws(Exception::class)
    fun getEmployeeById(employeeId: UUID): EmployeeEntity? {
        return employeeRepository.getEmployeeEntityById(employeeId)
    }

//    fun updateEmployeeById(employeeId: UUID, email: String, firstName: String, lastName: String, role: String) {
//        employeeRepository.updateNameByEmail(employeeId, email, firstName, lastName, role)
//    }

    fun deleteEmployee(employeeId: UUID) {
        //I need to change isActiveRepository
        isActiveRepository.setIsActiveFalse(employeeId)
    }
}