package com.example.invoice_pro.service

import com.example.invoice_pro.dto.ClientDto
import com.example.invoice_pro.mapper.ClientMapper
import com.example.invoice_pro.repository.ClientRepository
import org.springframework.stereotype.Service

@Service
class ClientService(private val clientRepository: ClientRepository) {
    fun getAllClients(): List<ClientDto> =
        clientRepository.findAll().map { ClientMapper.toDto(it) }

    fun saveClient(clientDto: ClientDto): ClientDto {
        val client = ClientMapper.toEntity(clientDto)
        return ClientMapper.toDto(clientRepository.save(client))
    }
}
