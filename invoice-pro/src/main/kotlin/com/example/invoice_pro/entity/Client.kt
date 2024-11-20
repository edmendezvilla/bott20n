package com.example.invoice_pro.entity

import jakarta.persistence.*

@Entity
data class Client(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "full_name", nullable = false)
    val fullName: String,

    val age: Int,

    val address: String? = null // Campo opcional
)
