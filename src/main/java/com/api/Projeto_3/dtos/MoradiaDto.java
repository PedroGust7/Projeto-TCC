package com.api.Projeto_3.dtos;

import com.api.Projeto_3.model.MoradiaModel;
import com.api.Projeto_3.model.PerfisModelo;



public class MoradiaDto {
    private long id; 
    private String cep;
    private String avenida;
    private int sn;
    private String bairro;
    private String cidade;
    private PerfisModelo perfil;


    public MoradiaDto(MoradiaModel en) {
    if (en != null) {
        this.id = en.getId();
        this.cep = en.getCep();
        this.avenida = en.getAvenida();
        this.sn = en.getSn();
        this.bairro = en.getBairro();
        this.cidade = en.getCidade();
    }
}


     public MoradiaDto() {
        
    }



    public long getId() {
        return id;
    }

    


    public void setId(long id) {
        this.id = id;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getAvenida() {
        return avenida;
    }
    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }
    public int getSn() {
        return sn;
    }
    public void setSn(int sn) {
        this.sn = sn;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public PerfisModelo getPerfil() {
        return perfil;
    }
    public void setPerfil(PerfisModelo perfil) {
        this.perfil = perfil;
    }



    
    
}
