package br.com.sennatech.desafio.services;

import br.com.sennatech.desafio.dtos.AtualizarClienteDTO;
import br.com.sennatech.desafio.dtos.CadastroClienteDTO;
import br.com.sennatech.desafio.dtos.ListagemClienteDTO;
import br.com.sennatech.desafio.model.Cliente;
import br.com.sennatech.desafio.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public void cadastroCliente(CadastroClienteDTO dados) {
        repository.save(new Cliente(dados));
    }

    public Page<ListagemClienteDTO> listarClientes(Pageable pageable) {
        return repository.findAll(pageable).map(ListagemClienteDTO::new);
    }

    public ListagemClienteDTO buscarCliente(Long id) {
        var cliente = repository.getReferenceById(id);
        return new ListagemClienteDTO(cliente);
    }

    public void atualizarCliente(AtualizarClienteDTO dados) {
        var cliente = repository.getReferenceById(dados.id());
        cliente.clienteAtt(dados);
    }

    public void deletarCliente(Long id) {
        repository.deleteById(id);
    }

}
