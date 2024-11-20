package com.example.invoice_pro.dto

import java.math.BigDecimal
import java.time.LocalDate

data class InvoiceDto(
    val id: Long?,
    val code: String?,
    val createdAt: LocalDate,
    val total: BigDecimal,
    val clientId: Long
)
