package com.example.invoice_pro.mapper

import com.example.invoice_pro.dto.ClientDto
import com.example.invoice_pro.entity.Client

object ClientMapper {
    fun toDto(client: Client): ClientDto =
        ClientDto(client.id, client.fullName, client.age, client.address)

    fun toEntity(clientDto: ClientDto): Client =
        Client(clientDto.id ?: 0, clientDto.fullName, clientDto.age, clientDto.address)
}
