//package com.huihui.controller
//
//import com.huihui.model.RequestTimeOffDto
//import com.huihui.service.RequestTimeService
//import io.micronaut.http.annotation.Body
//import io.micronaut.http.annotation.Controller
//import io.micronaut.http.annotation.Post
//import jakarta.inject.Inject
//
//
//@Controller
//class RequestTimeController (@Inject private val requestTimeService: RequestTimeService){
////    private val requestTimeOffService: RequestTimeOffService? = null
////
////    fun RequestTimeOffController(requestTimeOffService: RequestTimeOffService?) {
////        this.requestTimeOffService = requestTimeOffService
////    }
//
//    @Post("/requestTimeOff")
//    fun requestTimeOff(@Body requestTimeDto: RequestTimeOffDto) {
//        requestTimeService.requestTimeOff(
//            requestTimeDto.employeeId,
//            requestTimeDto.startTime,
//            requestTimeDto.endTime
//        )
//    }
//}