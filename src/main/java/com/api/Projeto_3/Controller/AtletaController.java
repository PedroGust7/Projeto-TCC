package com.api.Projeto_3.Controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.api.Projeto_3.dtos.AtletaDtos;
import com.api.Projeto_3.service.AtletaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/atleta")
public class AtletaController {


   
    @Autowired
    AtletaService service;


    @GetMapping(value = "/cadastro")
    public String getCadastroAtleta() {
        return "cadastro";
    }


    @PostMapping("/save")
    public ResponseEntity<AtletaDtos> postAtletaInsert(@RequestBody AtletaDtos atletaDtos) {
        AtletaDtos atl = service.InsertAtleta(atletaDtos);

        URI uir = ServletUriComponentsBuilder.fromCurrentRequest().path("/id")
        .buildAndExpand(atl.getId()).toUri();
        return ResponseEntity.created(uir).body(atl);
    }
    
    
}
