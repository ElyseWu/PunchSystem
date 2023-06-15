//package com.huihui.service
//
//import com.huihui.entity.PunchTimeEntity
//import com.huihui.entity.TimeSheetEntity
//import com.huihui.entity.WorkingTimeEntity
//import com.huihui.repository.PunchTimeRepository
//import com.huihui.repository.TimeSheetRepository
//import com.huihui.repository.WorkingTimeRepository
//import jakarta.inject.Singleton
//import java.time.Duration
//import java.time.LocalDateTime
//import java.util.*
//
//@Singleton
//class PunchTimeService (private val punchTimeRepository: PunchTimeRepository,
//                        private val workingTimeRepository: WorkingTimeRepository,
//                        private val timeSheetRepository: TimeSheetRepository
//){
//
//
//    fun createEmployeePunch(employeeId: UUID, punchTime: LocalDateTime, inOutOrBreak: String) {
//        //check if we need to caculate working hours from last time and store into time sheet
//        if (inOutOrBreak == "break" || inOutOrBreak == "out") {
//            //we need to caculate working hours between last time punch and this time punch
//            //and store the information in working_time table
//            //time sheet is the total working time
//            val punchTimes:  List<PunchTimeEntity?>?  = punchTimeRepository.getPunchTimeEntitiesByEmployeeId(employeeId)
//            val prev: PunchTimeEntity? = punchTimes?. lastOrNull()
//            if (prev != null) {
//                val duration = Duration.between(prev.punchTime, punchTime)
//                val workingTimeInMin = duration.toMinutes()
//                val workingTime = workingTimeInMin / 60.0
//                val newWorkingTimeEntity = WorkingTimeEntity(null, employeeId, workingTime)
//                workingTimeRepository.save(newWorkingTimeEntity)
//                val timeSheet: TimeSheetEntity = timeSheetRepository.getByEmployeeId(employeeId)
//                timeSheetRepository.updateTotalWorkingTime(timeSheet.id, timeSheet.totalWorkingTime + workingTime)
//            }
//        }
//
//        //create a new punch record in punch time table
//        val newPunchTime = PunchTimeEntity(null, employeeId, punchTime, inOutOrBreak)
//        punchTimeRepository.save(newPunchTime)
//    }
//
//}