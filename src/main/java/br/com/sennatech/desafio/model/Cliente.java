package br.com.sennatech.desafio.model;

import br.com.sennatech.desafio.dtos.AtualizarClienteDTO;
import br.com.sennatech.desafio.dtos.CadastroClienteDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "clientes")
@Entity(name = "Cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataNascimento;
    private String telefone;
    private String email;
    private String dataAdesao;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    @Enumerated(EnumType.STRING)
    private Plano tipoPlano;

    @Embedded
    private Endereco endereco;

    public Cliente(CadastroClienteDTO dados) {
        this.nome = dados.nome();
        this.dataNascimento = dados.dataNascimento();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.dataAdesao = dados.dataAdesao();
        this.genero = dados.genero();
        this.tipoPlano = dados.tipoPlano();
        this.endereco = new Endereco(dados.endereco());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataAdesao() {
        return dataAdesao;
    }

    public void setDataAdesao(String dataAdesao) {
        this.dataAdesao = dataAdesao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Plano getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(Plano tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void clienteAtt(AtualizarClienteDTO dados) {
        if(dados.nome() != null) {
            this.nome = dados.nome();
        }
        if(dados.email() != null) {
            this.email = dados.email();
        }
        if(dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if(dados.endereco() != null) {
            this.endereco.enderecoAtt(dados.endereco());
        }
    }
}
