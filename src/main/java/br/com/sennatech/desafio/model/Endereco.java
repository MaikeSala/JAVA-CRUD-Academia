package br.com.sennatech.desafio.model;

import br.com.sennatech.desafio.dtos.DadosEnderecoDTO;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Endereco {
    private String logradouro;
    private String numero;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(DadosEnderecoDTO dados) {
        this.logradouro = dados.logradouro();
        this.numero = dados.numero();
        this.cep = dados.cep();
        this.cidade = dados.cidade();
        this.estado = dados.estado();
        this.pais = dados.pais();
    }

    public void enderecoAtt(DadosEnderecoDTO dados) {
        if(dados.logradouro() != null) {
            this.logradouro = dados.logradouro();
        }
        if(dados.numero() != null) {
            this.numero = dados.numero();
        }
        if(dados.cep() != null) {
            this.cep = dados.cep();
        }
        if(dados.cidade() != null) {
            this.cidade = dados.cidade();
        }
        if(dados.estado() != null) {
            this.estado = dados.estado();
        }
        if(dados.pais() != null) {
            this.pais = dados.pais();
        }
    }
}
