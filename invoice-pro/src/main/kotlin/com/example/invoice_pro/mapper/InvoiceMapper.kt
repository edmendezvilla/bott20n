package com.example.invoice_pro.mapper

import com.example.invoice_pro.dto.InvoiceDto
import com.example.invoice_pro.entity.Client
import com.example.invoice_pro.entity.Invoice

object InvoiceMapper {
    fun toDto(invoice: Invoice): InvoiceDto =
        InvoiceDto(
            invoice.id,
            invoice.code,
            invoice.createdAt,
            invoice.total,
            invoice.client.id
        )

    fun toEntity(invoiceDto: InvoiceDto, client: Client): Invoice =
        Invoice(
            invoiceDto.id ?: 0,
            invoiceDto.code,
            invoiceDto.createdAt,
            invoiceDto.total,
            client
        )
}
