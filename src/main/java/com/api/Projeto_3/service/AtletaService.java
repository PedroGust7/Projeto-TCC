package com.api.Projeto_3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.Projeto_3.dtos.AfiliacaoDtos;
import com.api.Projeto_3.dtos.AtletaDtos;
import com.api.Projeto_3.dtos.MoradiaDto;
import com.api.Projeto_3.dtos.RoleDtos;
import com.api.Projeto_3.model.AfiliacaoModelo;
import com.api.Projeto_3.model.AtletaModelo;
import com.api.Projeto_3.model.MoradiaModel;
import com.api.Projeto_3.model.RolesModel;
import com.api.Projeto_3.repository.AtletaRespository;
import com.api.Projeto_3.repository.RoleRepository;

import jakarta.transaction.Transactional;

@Service
public class AtletaService {
    
    @Autowired
    AtletaRespository respository;

    @Autowired
    RoleRepository roles;

    private static String caminho = "/home/ysaak/FACULDADE/PROJETO_TCC/api/Projeto-TCC/uplods";

    @Transactional
    public AtletaDtos InsertAtleta(AtletaDtos dtos ){
            AtletaModelo atl = new AtletaModelo();
           
        preencherDadosBasicos(atl, dtos);
        salvarPerfil(dtos, atl);
        salvarAfiliado(dtos.getPais_fk(), atl);
        salvarMoradia(dtos.getMoradia_fk(), atl);
        
        // 2. Salva TUDO de uma vez só no banco
        AtletaModelo salvo = respository.save(atl);

        // 3. Agora que tudo está preenchido, retorna o DTO
        return new AtletaDtos(salvo);
    }

    //busca as roles pelo id
    public RoleDtos infoRoles(Long id){
        var rol = roles.findById(id).orElseThrow(()-> new RuntimeException());
        return new RoleDtos(rol);
    }

    //SALVANDO ATLETAS
    private void preencherDadosBasicos( AtletaModelo atl , AtletaDtos dtos){              
            atl.setName(dtos.getName());
            atl.setDataNascimento(dtos.getDataNascimento());
            atl.setCpf(dtos.getCpf());
            atl.setRg(dtos.getRg());
            atl.setEmail(dtos.getEmail());
            atl.setSenha(dtos.getSenha());
            atl.setTelefoneFixo(dtos.getTelefoneFixo());
            atl.setTelefoneZap(dtos.getTelefoneZap());
            atl.setPesoMigrama(dtos.getPesoMigrama());
            atl.setUf(dtos.getUfDtos());
           
            atl.setAlturaCetimentro(dtos.getAlturaCetimentro());
            atl.setSangue(dtos.getSangue());
            atl.setSexo(dtos.getGenero());

            atl = respository.saveAndFlush(atl);
    }

    //salvando Acesso 

      private   void salvarPerfil(AtletaDtos dos,AtletaModelo atl){
        RolesModel roleReal = roles.findById(dos.getRoles().getId()).orElseThrow(() -> new RuntimeException("Role não encontrada"));

       atl.setRole(roleReal);
    }

    //SALVANDOS OS AFILIADOS
    private void salvarAfiliado(AfiliacaoDtos afi , AtletaModelo atl){
          AfiliacaoModelo pais = new AfiliacaoModelo();

            pais.setMaeNome(afi.getMaeNome());
            pais.setMaeTelefone(afi.getMaeTelefone());
            pais.setMaeEmail(afi.getMaeEmail());
            pais.setPaiName(afi.getPaiName());
            pais.setPaiTelefone(afi.getPaiTelefone());
            pais.setPaiEmail(afi.getPaiEmail());


            atl.setPais_fk(pais);

    }
    //Salvados Moradias

    private void salvarMoradia(MoradiaDto en , AtletaModelo atl){
            MoradiaModel mor = new MoradiaModel();

            mor.setCep(en.getCep());
            mor.setAvenida(en.getAvenida());
            mor.setSn(en.getSn());
            mor.setBairro(en.getBairro());
            mor.setCidade(en.getCidade());
            
           atl.setMoradia_fk(mor);

    }

    }

    
 
