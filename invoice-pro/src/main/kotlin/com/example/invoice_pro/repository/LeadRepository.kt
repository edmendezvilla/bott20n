package com.example.invoice_pro.repository

import com.example.invoice_pro.entity.Lead
import org.springframework.data.jpa.repository.JpaRepository

interface LeadRepository : JpaRepository<Lead, Long>
