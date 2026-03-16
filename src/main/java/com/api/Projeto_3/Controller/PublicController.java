package com.api.Projeto_3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.api.Projeto_3.dtos.PerfilsDtos;
import com.api.Projeto_3.dtos.RoleDtos;
import com.api.Projeto_3.dtos.enumDtos.EnumDtos;
import com.api.Projeto_3.dtos.enumDtos.EnumGenero;
import com.api.Projeto_3.model.enums.EnumSague;
import com.api.Projeto_3.model.enums.EnumUf;
import com.api.Projeto_3.service.PerfilService;

import jakarta.validation.Valid;




@Controller
public class PublicController {
   
    @Autowired
    PerfilService service;


    @GetMapping("/cadastro/atleta/{id}")
    public String getCadastroAtleta(@PathVariable("id") Long id, PerfilsDtos atletaDtos, Model model) {
        model.addAttribute("listaUfs", EnumDtos.values());
        model.addAttribute("listSague", EnumSague.values());
        model.addAttribute("listEnumGenero", EnumGenero.values());
        
        var role = service.infoRoles(id);
        
        model.addAttribute("roleId", role);
        model.addAttribute("atletaDtos", atletaDtos);
        return "publicPlages/cadastroAtleta";
    }




    @GetMapping("/cadastro/medico/{id}")
    public String getCadastroMedico(@PathVariable("id") Long id, PerfilsDtos medicosDtos, Model model) {
        model.addAttribute("listaUfs", EnumDtos.values());
        model.addAttribute("listSague", EnumSague.values());
        model.addAttribute("listEnumGenero", EnumGenero.values());
        
        var role = service.infoRoles(id);

        model.addAttribute("roleId", role);
        model.addAttribute("medicosDtos", medicosDtos);
        return "publicPlages/cadastroMedico";
    }



    @GetMapping("/cadastro/treinador/{id}")
    public String getCadastroTreinador(@PathVariable("id") Long id, PerfilsDtos treinadorDtos, Model model) {
        model.addAttribute("listaUfs", EnumDtos.values());
        model.addAttribute("listSague", EnumSague.values());
        model.addAttribute("listEnumGenero", EnumGenero.values());
    
        var role = service.infoRoles(id);
    
        model.addAttribute("roleId", role);
        model.addAttribute("treinadorDtos", treinadorDtos);
        return "publicPlages/cadastroTreinador";
    }


 //SALVANDO ATLETA 
@PostMapping("/atleta/save/{id}")
public String postAtletaInsert( @PathVariable("id") Long id, @ModelAttribute("atletaDtos") @Valid PerfilsDtos atletaDtos, BindingResult result,  Model model
) {

    if (result.hasErrors()) { 
        model.addAttribute("listSague", EnumSague.values());
        model.addAttribute("listEnumGenero", EnumGenero.values());
        model.addAttribute("listaUfs", EnumUf.values());
        model.addAttribute("id", id); 
        model.addAttribute("roleNome", service.buscarNomeRoles(id));   
        return "publicPlages/cadastroAtleta"; 
    }
    atletaDtos.getRoles().setId(id);
    service.InsertAtleta(atletaDtos);
    return "redirect:/home"; 
}


//SALVANDO MEDICOS
@PostMapping("/medico/save/{id}")
public String postMedicoInsert(@PathVariable("id")  Long id , PerfilsDtos medicosDtos ) {

    if(medicosDtos.getRoles() == null){
        medicosDtos.setRoles(new RoleDtos());
    }
    

    return "redirect:/home";
}

//SALVANDSO TREIANDOR
@PostMapping("/treinador/save/{id}")
public String postTreinadorInsert(@PathVariable("id")  Long id , PerfilsDtos treinadorDtos ) {
    
    if(treinadorDtos.getRoles() == null){
        treinadorDtos.setRoles(new RoleDtos());
    }
     treinadorDtos.getRoles().setId(id);
     service.insertTreinador(treinadorDtos);

    return "redirect:/home";
}

//NAVEGAÇẼS
    @GetMapping("/home")
    public String getHome() {
         return "publicPlages/home";
    }


    @GetMapping("/login")
    public String getMethodName() {
        return "publicPlages/Login";
    }


}
