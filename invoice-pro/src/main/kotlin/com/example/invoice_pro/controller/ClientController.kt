package com.example.invoice_pro.controller

import com.example.invoice_pro.dto.ClientDto
import com.example.invoice_pro.service.ClientService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/clients")
class ClientController(private val clientService: ClientService) {
    @GetMapping
    fun getAllClients(): List<ClientDto> = clientService.getAllClients()

    @PostMapping
    fun saveClient(@RequestBody clientDto: ClientDto): ClientDto = clientService.saveClient(clientDto)
}
