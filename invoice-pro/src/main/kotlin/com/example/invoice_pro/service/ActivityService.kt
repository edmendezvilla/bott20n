package com.example.invoice_pro.service

import com.example.invoice_pro.entity.Activity
import com.example.invoice_pro.repository.ActivityRepository
import org.springframework.stereotype.Service

@Service
class ActivityService(private val activityRepository: ActivityRepository) {
    fun getAllActivities(): List<Activity> = activityRepository.findAll()
    fun getActivityById(id: Long): Activity? = activityRepository.findById(id).orElse(null)
    fun createActivity(activity: Activity): Activity = activityRepository.save(activity)
}
