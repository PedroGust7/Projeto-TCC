package com.api.Projeto_3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.Projeto_3.dtos.AfiliacaoDtos;
import com.api.Projeto_3.dtos.AtletaDtos;
import com.api.Projeto_3.dtos.MoradiaDto;
import com.api.Projeto_3.model.AfiliacaoModelo;
import com.api.Projeto_3.model.AtletaModelo;
import com.api.Projeto_3.model.MoradiaModel;
import com.api.Projeto_3.repository.AtletaRespository;

import jakarta.transaction.Transactional;

@Service
public class AtletaService {
    
    @Autowired
    AtletaRespository respository;

    @Transactional
    public AtletaDtos InsertAtleta(AtletaDtos dtos){

            AtletaModelo en = new AtletaModelo();
           
            salvarAtleta(en, dtos);
            //parte dos DTOS AFILIADOS
            salvarAfiliado(dtos.getPais_fk(), en);
            //salvado Atleta
            salvarMoradia(dtos.getMoradia_fk(), en);

            respository.save(en);

           return new AtletaDtos(en);
    }

    //SALVANDO ATLETAS

    private void salvarAtleta( AtletaModelo en , AtletaDtos dtos){

         en.setFotoImg(dtos.getFotoImg());
            en.setName(dtos.getName());
            en.setDataNascimento(dtos.getDataNascimento());
            en.setCpf(dtos.getCpf());
            en.setRg(dtos.getRg());
            en.setEmail(dtos.getEmail());
            en.setSenha(dtos.getSenha());
            en.setTelefoneFixo(dtos.getTelefoneFixo());
            en.setTelefoneZap(dtos.getTelefoneZap());
            en.setPesoMigrama(dtos.getPesoMigrama());
            en.setAlturaCetimentro(dtos.getAlturaCetimentro());
    }

    //SALVANDOS OS AFILIADOS
    private void salvarAfiliado(AfiliacaoDtos en , AtletaModelo atl){
          AfiliacaoModelo pais = new AfiliacaoModelo();

            pais.setMaeNome(en.getMaeNome());
            pais.setMaeTelefone(en.getMaeTelefone());
            pais.setMaeEmail(en.getMaeEmail());
            pais.setPaiName(en.getPaiName());
            pais.setPaiTelefone(en.getPaiTelefone());
            pais.setPaiEmail(en.getPaiEmail());


            atl.setPais(pais);

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
