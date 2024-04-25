package br.com.sennatech.desafio.controller;

import br.com.sennatech.desafio.dtos.AtualizarClienteDTO;
import br.com.sennatech.desafio.dtos.CadastroClienteDTO;
import br.com.sennatech.desafio.dtos.ListagemClienteDTO;
import br.com.sennatech.desafio.services.ClienteService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/academia")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid CadastroClienteDTO dados) {
        service.cadastroCliente(dados);
    }

    @GetMapping
    public Page<ListagemClienteDTO> listar(Pageable pageable) {
        return service.listarClientes(pageable);
    }

    @GetMapping("/{id}")
    public ListagemClienteDTO buscarCliente(@PathVariable Long id) {
        return service.buscarCliente(id);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid AtualizarClienteDTO dados) {
        service.atualizarCliente(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Long id) {
        service.deletarCliente(id);
    }
}
