package com.example.invoice_pro.service

import com.example.invoice_pro.dto.InvoiceDto
import com.example.invoice_pro.mapper.InvoiceMapper
import com.example.invoice_pro.repository.ClientRepository
import com.example.invoice_pro.repository.InvoiceRepository
import org.springframework.stereotype.Service

@Service
class InvoiceService(
    private val invoiceRepository: InvoiceRepository,
    private val clientRepository: ClientRepository
) {
    fun getAllInvoices(): List<InvoiceDto> =
        invoiceRepository.findAll().map { InvoiceMapper.toDto(it) }

    fun saveInvoice(invoiceDto: InvoiceDto): InvoiceDto {
        val client = clientRepository.findById(invoiceDto.clientId)
            .orElseThrow { IllegalArgumentException("Client not found") }
        val invoice = InvoiceMapper.toEntity(invoiceDto, client)
        return InvoiceMapper.toDto(invoiceRepository.save(invoice))
    }
}
