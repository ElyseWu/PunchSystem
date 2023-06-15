//package com.huihui.controller
//
//import com.huihui.model.TimeSheetDto
//import com.huihui.service.TimeSheetService
//import io.micronaut.http.annotation.Controller
//import io.micronaut.http.annotation.Get
//import io.micronaut.http.annotation.PathVariable
//import jakarta.inject.Inject
//import java.util.*
//
//
//@Controller
//class TimeSheetController (@Inject private val timeSheetService: TimeSheetService) {
////    private val timeSheetService: TimeSheetService? = null
////
////    fun TimeSheetController(timeSheetService: TimeSheetService?) {
////        this.timeSheetService = timeSheetService
////    }
//
//    @Get("/timeSheet/{employeeId}")
//    fun getCart(@PathVariable("employeeId") employeeId: UUID): TimeSheetDto? {
//        return timeSheetService.getTimeSheet(employeeId)
//    }
//}