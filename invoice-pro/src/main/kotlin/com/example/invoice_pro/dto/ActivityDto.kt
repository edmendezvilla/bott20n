package com.example.invoice_pro.dto

import java.time.LocalDateTime

data class ActivityDto(  // Usa `data class` para una clase de DTO
    val id: Long?,
    val leadId: Long?,
    val type: String,
    val description: String,
    val createdAt: LocalDateTime
)