//package com.huihui.controller
//
//import com.huihui.model.PayRateDto
//import com.huihui.model.TotalPayDto
//import com.huihui.service.PaymentService
//import io.micronaut.http.annotation.Body
//import io.micronaut.http.annotation.Controller
//import io.micronaut.http.annotation.PathVariable
//import io.micronaut.http.annotation.Post
//import jakarta.inject.Inject
//import java.util.*
//
//@Controller
//class PaymentController (@Inject private val paymentService: PaymentService){
////    private val paymentService: PaymentService? = null
////    fun PaymentController(paymentService: PaymentService?) {
////        this.paymentService = paymentService
////    }
//
//    //1. set pay rate
//    @Post("/payRate")
//    fun setPayRateByEmployeeId(@Body payRateDto: PayRateDto) {
//        paymentService.setPayRate(payRateDto.employeeId, payRateDto.payRate, payRateDto.overPayRate)
//    }
//
//    //2. send payment to employee
//    //return a total payment dto to user, including employee id and payment number
//    @Post("/pay/{employeeId}")
//    fun payToEmployeeByEmployeeID(@PathVariable("employeeId") employeeId: UUID): TotalPayDto? {
//        return paymentService.payToEmployee(employeeId)
//    }
//}