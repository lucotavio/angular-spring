package br.com.storm.clientes.rest;

import br.com.storm.clientes.entity.Cliente;
import br.com.storm.clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/clientes")
public class ClienteRestController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar( @RequestBody @Valid  Cliente cliente){
        return this.repository.save(cliente);
    }

    @GetMapping("{id}")
    public Cliente pesquisarPorId( @PathVariable Integer id){
        return this.repository.findById(id)
                              .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Integer id){

        repository.findById(id)
                .map(cliente ->{
                    repository.delete(cliente);
                    return Void.TYPE;

                }).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Cliente atualizar(@RequestBody @Valid Cliente cliente){
        return repository.save(cliente);
    }
}
