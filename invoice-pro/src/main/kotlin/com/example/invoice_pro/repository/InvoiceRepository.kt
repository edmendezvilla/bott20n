package com.example.invoice_pro.repository

import com.example.invoice_pro.entity.Invoice
import org.springframework.data.jpa.repository.JpaRepository

interface InvoiceRepository : JpaRepository<Invoice, Long>
