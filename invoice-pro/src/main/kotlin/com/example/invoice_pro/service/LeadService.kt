package com.example.invoice_pro.service

import com.example.invoice_pro.entity.Lead
import com.example.invoice_pro.repository.LeadRepository
import org.springframework.stereotype.Service

@Service
class LeadService(private val leadRepository: LeadRepository) {
    fun getAllLeads(): List<Lead> = leadRepository.findAll()
    fun getLeadById(id: Long): Lead? = leadRepository.findById(id).orElse(null)
    fun createLead(lead: Lead): Lead = leadRepository.save(lead)
}
