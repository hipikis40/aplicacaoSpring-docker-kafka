package com.cliente.kafka.cliente.controller;

import com.cliente.kafka.cliente.model.Endereco;
import com.cliente.kafka.cliente.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/endereco")
public class EnderecoResource {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public ResponseEntity<Endereco> saveEndereco(@RequestBody Endereco endereco){
        enderecoService.save(endereco);
        return ResponseEntity.ok(endereco);
    }

    @GetMapping
    public ResponseEntity<List<Endereco>> getListaEndereco(){
        List<Endereco> listaEndereco = enderecoService.getListaEndereco();
        return ResponseEntity.ok(listaEndereco);
    }
}
