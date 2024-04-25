package br.com.sennatech.desafio.dtos;

import jakarta.validation.constraints.NotNull;

public record AtualizarClienteDTO(
        @NotNull
        Long id,
        String nome,
        String email,
        String telefone,
        DadosEnderecoDTO endereco
) {
}
