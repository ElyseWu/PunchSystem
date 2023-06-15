//package com.huihui.controller
//
//import com.huihui.model.PunchTimeDto
//import com.huihui.service.PunchTimeService
//import io.micronaut.http.annotation.Body
//import io.micronaut.http.annotation.Controller
//import io.micronaut.http.annotation.Post
//import jakarta.inject.Inject
//
//@Controller
//class PunchTimeController (@Inject private val punchTimeService: PunchTimeService) {
////    private val punchTimeService: PunchTimeService? = null
////
////    fun PunchTimeController(punchTimeService: PunchTimeService?) {
////        this.punchTimeService = punchTimeService
////    }
//
//    @Post("/punch")
//    fun punchTimeByEmployeeId(@Body punchTimeDto: PunchTimeDto) {
//        punchTimeService.createEmployeePunch(
//            punchTimeDto.employeeId,
//            punchTimeDto.punchTime,
//            punchTimeDto.inOutOrBreak
//        )
//    }
//}