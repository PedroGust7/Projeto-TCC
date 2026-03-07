package com.api.Projeto_3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.Projeto_3.dtos.AtletaDtos;
import com.api.Projeto_3.service.AtletaService;



@Controller
@RequestMapping("/atleta")
public class AtletaController {


   
    @Autowired
    AtletaService service;


    @GetMapping(value = "/cadastro")
    public String getCadastroAtleta(AtletaDtos dtos) {
        return "cadastro";
    }


    @PostMapping("/insert")
    public ResponseEntity<AtletaDtos>TestAtletaInsert( @RequestBody AtletaDtos atletaDtos) {
    var en = service.InsertAtleta(atletaDtos);
    return ResponseEntity.ok(en);
    }

     @PostMapping("/save")
    public String postAtletaInsert(  AtletaDtos atletaDtos) {
    var en = service.InsertAtleta(atletaDtos);
    return "redirect:/atleta/cadastro";
    }
   
    
}
