//package com.huihui.service
//
//import com.huihui.entity.RequestTimeEntity
//import com.huihui.repository.RequestTimeRepository
//import jakarta.inject.Singleton
//import java.time.LocalDateTime
//import java.util.*
//
//@Singleton
//class RequestTimeService (private val requestTimeOffRepository: RequestTimeRepository) {
//
//    fun requestTimeOff(employeeId: UUID, startTime: LocalDateTime, endTime: LocalDateTime) {
//        val newRequest = RequestTimeEntity(null, employeeId, startTime, endTime)
//        requestTimeOffRepository.save(newRequest)
//    }
//}