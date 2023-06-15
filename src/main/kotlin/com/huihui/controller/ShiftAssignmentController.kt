//package com.huihui.controller
//
//import com.huihui.model.ShiftAssignmentDto
//import com.huihui.service.ShiftAssignmentService
//import io.micronaut.http.annotation.Body
//import io.micronaut.http.annotation.Controller
//import io.micronaut.http.annotation.Post
//import jakarta.inject.Inject
//
//
//@Controller
//class ShiftAssignmentController (@Inject private val shiftAssignmentService: ShiftAssignmentService){
////    private val shiftAssignmentService: ShiftAssignmentService? = null
////    fun ShiftAssignmentController(shiftAssignmentService: ShiftAssignmentService?) {
////        this.shiftAssignmentService = shiftAssignmentService
////    }
//
//    @Post("/assign")
//    fun assignShift(@Body shiftAssignmentDto: ShiftAssignmentDto) {
//        shiftAssignmentService.assignShiftByEmployeeId(
//            shiftAssignmentDto.employeeId,
//            shiftAssignmentDto.startTime,
//            shiftAssignmentDto.endTime
//        )
//    }
//}