package com.example.invoice_pro.entity

import jakarta.persistence.*
import java.time.LocalDateTime


@Entity
data class Activity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne
    @JoinColumn(name = "lead_id", referencedColumnName = "id")
    val lead: Lead,  // Relación con Lead, puedes usar `leadId` si solo necesitas el ID

    val type: String,

    val description: String,

    @Column(name = "created_at")
    val createdAt: LocalDateTime,
    val leadId: Long
)
