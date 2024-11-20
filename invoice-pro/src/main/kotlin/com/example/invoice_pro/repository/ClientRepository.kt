package com.example.invoice_pro.repository

import com.example.invoice_pro.entity.Client
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository : JpaRepository<Client, Long>
