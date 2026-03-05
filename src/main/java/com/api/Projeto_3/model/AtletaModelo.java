package com.api.Projeto_3.model;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ATLETAS")
public class AtletaModelo extends PerfisModelo {


public AtletaModelo() {
        super();
    }

    public AtletaModelo(Long id, byte[] fotoImg, String name, Date dataNascimento, String cpf, String rg, String email,
            String senha, String telefoneFixo, String telefoneZap, Double pesoMigrama, Double alturaCetimentro,
            AfiliacaoModelo pais, MoradiaModel moradia_fk, Set<RoleModel> roles) {
        
        super(id, fotoImg, name, dataNascimento, cpf, rg, email, senha, telefoneFixo, telefoneZap, 
              pesoMigrama, alturaCetimentro, pais, moradia_fk, roles);
    }


    
}
