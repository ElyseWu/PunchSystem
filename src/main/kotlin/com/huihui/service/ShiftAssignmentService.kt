//package com.huihui.service
//
//import com.huihui.entity.IsActiveEntity
//import com.huihui.entity.RequestTimeEntity
//import com.huihui.entity.ShiftAssignmentEntity
//import com.huihui.repository.IsActiveRepository
//import com.huihui.repository.RequestTimeRepository
//import com.huihui.repository.ShiftAssignmentRepository
//import jakarta.inject.Singleton
//import java.time.LocalDateTime
//import java.util.*
//
//@Singleton
//class ShiftAssignmentService (private val shiftAssignmentRepository: ShiftAssignmentRepository,
//                              private val isActiveRepository: IsActiveRepository,
//                              private val requestTimeRepository: RequestTimeRepository
//) {
//
//    fun assignShiftByEmployeeId(employeeId: UUID, startTime: LocalDateTime, endTime: LocalDateTime) {
//        //1. check if this employee is active
//        //2. if it is, check startTime and endTime has requestTime off (get all request time off and check overlap)
//        //3. if not, assign shift
//        val isActive: IsActiveEntity ?= isActiveRepository.getIsActiveEntityByEmployeeId(employeeId)
//        if (isActive == null || !isActive.isActive) {
//            return
//            //            throw new Exception("oops, this employee is not exist");
//        }
//        val requestTimeOffByThisEmployee: List<RequestTimeEntity?> ?=
//            requestTimeRepository.getRequestTimeOffEntityByEmployeeId(employeeId)
//        if (requestTimeOffByThisEmployee == null || hasNotOverLap(requestTimeOffByThisEmployee, startTime, endTime)) {
//            //we can assign shift to this employee
//            val newShift = ShiftAssignmentEntity(null, employeeId, startTime, endTime)
//            shiftAssignmentRepository.save(newShift)
//        }
//    }
//
//    private fun hasNotOverLap(requests: List<RequestTimeEntity?>?, start: LocalDateTime, end: LocalDateTime): Boolean {
//        //check request and [start, end] has overlap
//        if (requests != null) {
//            val sortedRequests = requests.filterNotNull().sortedBy { it.startTime }
//            for (request in sortedRequests) {
//                if (request.endTime.isBefore(start)) {
//                    continue
//                } else if (request.startTime.isAfter(end)) {
//                    continue
//                } else {
//                    return false
//                }
//            }
//        }
//
//        return true
//    }
//}