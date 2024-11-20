package com.example.invoice_pro.entity

import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDate

@Entity
data class Invoice(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val code: String? = null,

    @Column(name = "created_at")
    val createdAt: LocalDate = LocalDate.now(),

    val total: BigDecimal,

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    val client: Client
)
