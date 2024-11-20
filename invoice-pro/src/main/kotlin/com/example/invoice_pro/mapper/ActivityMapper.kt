package com.example.invoice_pro.mapper

import com.example.invoice_pro.dto.ActivityDto
import com.example.invoice_pro.entity.Activity

object ActivityMapper {
    // Convierte la entidad Activity a DTO
    fun toDto(activity: Activity): ActivityDto =
        ActivityDto(
            id = activity.id,
            leadId = activity.lead.id,  // Aquí solo necesitas el id de la entidad Lead
            type = activity.type,
            description = activity.description,
            createdAt = activity.createdAt
        )

    // Convierte el DTO de Activity a la entidad Activity
    fun toEntity(activityDto: ActivityDto): Activity =
        Activity(
            id = activityDto.id ?: 0,  // Si es null, asigna 0 por defecto
            leadId = activityDto.leadId ?: 0, // Solo pasas el ID aquí
            type = activityDto.type,
            description = activityDto.description,
            createdAt = activityDto.createdAt,
            lead = TODO()
        )
}
