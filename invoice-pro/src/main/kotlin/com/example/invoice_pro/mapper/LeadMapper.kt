package com.example.invoice_pro.mapper

import com.example.invoice_pro.dto.LeadDto
import com.example.invoice_pro.entity.Lead

object LeadMapper {
    fun toDto(lead: Lead): LeadDto =
        LeadDto(lead.id, lead.name, lead.email, lead.phone, lead.status, lead.createdAt)

    fun toEntity(leadDto: LeadDto): Lead =
        Lead(leadDto.id ?: 0, leadDto.name, leadDto.email, leadDto.phone, leadDto.status, leadDto.createdAt)
}
