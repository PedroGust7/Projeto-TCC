package com.api.Projeto_3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.api.Projeto_3.dtos.AtletaDtos;
import com.api.Projeto_3.dtos.RoleDtos;
import com.api.Projeto_3.dtos.enumDtos.EnumDtos;
import com.api.Projeto_3.dtos.enumDtos.EnumGenero;
import com.api.Projeto_3.model.enums.EnumSague;
import com.api.Projeto_3.service.AtletaService;


@Controller
public class PublicController {
   
    @Autowired
    AtletaService service;


  @GetMapping("/cadastro/atleta/{id}")
public String getCadastroAtleta(@PathVariable("id") Long id, AtletaDtos atletaDtos, Model model) {
    // Adicionando os enums para os selects não quebrarem
    model.addAttribute("listaUfs", EnumDtos.values());
    model.addAttribute("listSague", EnumSague.values());
    model.addAttribute("listEnumGenero", EnumGenero.values());
    
    // Busca a role dinamicamente pelo ID que veio da Home
    var role = service.infoRoles(id);
    model.addAttribute("roleId", role);
    
    // Certifique-se de que o objeto do formulário está no model
    model.addAttribute("atletaDtos", atletaDtos);
    
    return "publicPlages/cadastro";
}

    @GetMapping("/home")
    public String getHome() {
         return "publicPlages/home";
    }

    @GetMapping("/login")
    public String getMethodName() {
        return "publicPlages/Login.html";
    }
 
@PostMapping("/atleta/save/{id}") // Adicione o {id} na URL
public String postAtletaInsert(@PathVariable("id") Long id, AtletaDtos atletaDtos) {
    if (atletaDtos.getRoles() == null) {
        atletaDtos.setRoles(new RoleDtos());
    }
    atletaDtos.getRoles().setId(id);
    service.InsertAtleta(atletaDtos);
    return "redirect:/home"; // Mudei para /home porque /cadastro/atleta sem ID dá erro 404
}
    
}
