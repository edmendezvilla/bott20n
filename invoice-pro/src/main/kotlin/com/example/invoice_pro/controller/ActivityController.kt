package com.example.invoice_pro.controller

import com.example.invoice_pro.dto.ActivityDto
import com.example.invoice_pro.mapper.ActivityMapper
import com.example.invoice_pro.service.ActivityService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/activities")
class ActivityController(private val activityService: ActivityService) {

    @GetMapping
    fun getAllActivities() = activityService.getAllActivities()

    @GetMapping("/{id}")
    fun getActivityById(@PathVariable id: Long) = activityService.getActivityById(id)

    @PostMapping
    fun createActivity(@RequestBody activityDto: ActivityDto) = activityService.createActivity(ActivityMapper.toEntity(activityDto))
}
