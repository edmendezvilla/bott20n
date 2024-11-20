package com.example.invoice_pro.dto

import java.time.LocalDateTime

data class LeadDto(
    val id: Long?,
    val name: String,
    val email: String?,
    val phone: String?,
    val status: String,
    val createdAt: LocalDateTime
)
