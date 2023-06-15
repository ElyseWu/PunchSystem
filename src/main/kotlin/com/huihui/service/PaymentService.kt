//package com.huihui.service
//
//import com.huihui.entity.PayRateEntity
//import com.huihui.entity.TimeSheetEntity
//import com.huihui.model.TotalPayDto
//import com.huihui.repository.PayRateRepository
//import com.huihui.repository.TimeSheetRepository
//import jakarta.inject.Singleton
//import java.lang.IllegalStateException
//import java.util.*
//
//@Singleton
//class PaymentService (private val payRateRepository: PayRateRepository,
//        private val timeSheetRepository: TimeSheetRepository
//) {
//
//    fun setPayRate(employeeId: UUID, payRate: Double, overTimePayRate: Double) {
//        val payRateEntity = PayRateEntity(null, employeeId, payRate, overTimePayRate)
//        payRateRepository.save(payRateEntity)
//    }
//
//    fun payToEmployee(employeeId: UUID): TotalPayDto {
//        //1. according employeeId, get payRate and overTimePayRate from PayRateEntity and get totalWorkingTime form timeSheetEntity
//        //2. caculate totalpay
//        val payRateEntity: PayRateEntity? = payRateRepository.getPayRateEntityByEmployeeId(employeeId)
//        val payRate: Double = payRateEntity?.payRate ?: throw IllegalStateException("PayRateEntity not found for employeeId: $employeeId")
//        val overPayRate: Double = payRateEntity.overPayRate
//        val timeSheetEntity: TimeSheetEntity = timeSheetRepository.getByEmployeeId(employeeId)
//        val totalWorkingTIme: Double  = timeSheetEntity.totalWorkingTime
//        var totalPay = 0.0
//        totalPay = if (totalWorkingTIme <= 40) {
//            totalWorkingTIme * payRate
//        } else {
//            payRate * 40 + overPayRate * (totalWorkingTIme - 40)
//        }
//        return TotalPayDto(employeeId, totalWorkingTIme, totalPay)
//    }
//
//}