package br.com.sennatech.desafio.dtos;

import br.com.sennatech.desafio.model.Cliente;
import br.com.sennatech.desafio.model.Genero;
import br.com.sennatech.desafio.model.Plano;

public record ListagemClienteDTO(
        String nome,
        String email,
        Genero genero,
        Plano tipoPlano
) {
    public ListagemClienteDTO(Cliente cliente) {
        this(cliente.getNome(), cliente.getEmail(), cliente.getGenero(), cliente.getTipoPlano());
    }
}
