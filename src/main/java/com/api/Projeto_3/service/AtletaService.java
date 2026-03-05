package com.api.Projeto_3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.Projeto_3.dtos.AtletaDtos;
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
            AfiliacaoModelo pais = new AfiliacaoModelo();
            MoradiaModel mor = new MoradiaModel();

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
        
            //parte dos DTOS AFILIADOS
            pais.setMaeNome(dtos.getPais().getMaeNome());
            pais.setMaeTelefone(dtos.getPais().getMaeTelefone());
            pais.setMaeEmail(dtos.getPais().getMaeEmail());
            pais.setPaiName(dtos.getPais().getPaiName());
            pais.setPaiTelefone(dtos.getPais().getPaiTelefone());
            pais.setPaiEmail(dtos.getPais().getPaiEmail());

            //moradia

            mor.setCep(dtos.getMoradia_fk().getCep());
            mor.setAvenida(dtos.getMoradia_fk().getAvenida());
            mor.setSn(dtos.getMoradia_fk().getSn());
            mor.setBairro(dtos.getMoradia_fk().getBairro());
            mor.setCidade(dtos.getMoradia_fk().getCidade());
            

           en =  respository.save(en);

           return new AtletaDtos(en);
    }
}
