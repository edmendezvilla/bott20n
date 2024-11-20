package com.example.invoice_pro.controller

import com.example.invoice_pro.dto.InvoiceDto
import com.example.invoice_pro.service.InvoiceService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/invoices")
class InvoiceController(private val invoiceService: InvoiceService) {
    @GetMapping
    fun getAllInvoices(): List<InvoiceDto> = invoiceService.getAllInvoices()

    @PostMapping
    fun saveInvoice(@RequestBody invoiceDto: InvoiceDto): InvoiceDto = invoiceService.saveInvoice(invoiceDto)
}
