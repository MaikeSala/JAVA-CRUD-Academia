package br.com.sennatech.desafio.dtos;

import br.com.sennatech.desafio.model.Genero;
import br.com.sennatech.desafio.model.Plano;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CadastroClienteDTO(

        @NotBlank
        String nome,
        @NotBlank
        String dataNascimento,
        @NotNull
        Genero genero,
        @NotBlank
        String telefone,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String dataAdesao,
        @NotNull
        Plano tipoPlano,
        @NotNull
        @Valid
        DadosEnderecoDTO endereco
) {
}
