//package com.huihui.service
//
//import com.huihui.entity.TimeSheetEntity
//import com.huihui.entity.WorkingTimeEntity
//import com.huihui.model.TimeSheetDto
//import com.huihui.repository.PunchTimeRepository
//import com.huihui.repository.TimeSheetRepository
//import com.huihui.repository.WorkingTimeRepository
//import jakarta.inject.Singleton
//import java.util.UUID
//
//
//@Singleton
//class TimeSheetService (private val timeSheetRepository: TimeSheetRepository,
//                        private val punchTimeRepository: PunchTimeRepository,
//                        private val workingTimeRepository: WorkingTimeRepository
//){
//
//    fun getTimeSheet(employeeId: UUID): TimeSheetDto? {
//        //get TimeSheetDto: id, total working time and list of working time entity
//        //timesheetEntity can
//        val timeSheet: TimeSheetEntity = timeSheetRepository.getByEmployeeId(employeeId)
//        val workingTimes: List<WorkingTimeEntity> = workingTimeRepository.getWorkingTimeEntitiesByEmployeeId(employeeId)
//        val id: UUID? = timeSheet.id
//        val totalWorkingTime : Double = timeSheet.totalWorkingTime
//        return TimeSheetDto(id, totalWorkingTime, workingTimes)
//    }
//}