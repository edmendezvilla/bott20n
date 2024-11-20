package com.example.invoice_pro.controller

import com.example.invoice_pro.dto.LeadDto
import com.example.invoice_pro.mapper.LeadMapper
import com.example.invoice_pro.service.LeadService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/leads")
class LeadController(private val leadService: LeadService) {

    @GetMapping
    fun getAllLeads() = leadService.getAllLeads()

    @GetMapping("/{id}")
    fun getLeadById(@PathVariable id: Long) = leadService.getLeadById(id)

    @PostMapping
    fun createLead(@RequestBody leadDto: LeadDto) = leadService.createLead(LeadMapper.toEntity(leadDto))
}
