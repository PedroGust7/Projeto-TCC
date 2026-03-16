package com.api.Projeto_3.dtos;

import com.api.Projeto_3.model.MoradiaModel;
import com.api.Projeto_3.model.PerfisModelo;

import jakarta.validation.constraints.NotBlank;



public class MoradiaDto {
    private long id; 

    @NotBlank(message = "cep não pode ser zero")
    private String cep;
    
    @NotBlank(message = "avenida não pode ser zero")
    private String avenida;

    @NotBlank(message = "sn não pode ser zero")
    private String sn;

    @NotBlank(message = "Bairro  não pode ser zero")
    private String bairro;

    @NotBlank(message = "Digite o nome da cidade")
    private String cidade;
    private PerfisModelo perfil;


    


  
public MoradiaDto(long id, String cep, String avenida, String sn, String bairro, String cidade) {
        this.id = id;
        this.cep = cep;
        this.avenida = avenida;
        this.sn = sn;
        this.bairro = bairro;
        this.cidade = cidade;
    }


      
public MoradiaDto(MoradiaModel entiy) {
        this.id = entiy.getId();
        this.cep = entiy.getCep();
        this.avenida = entiy.getAvenida();
        this.sn = entiy.getSn();
        this.bairro = entiy.getBairro();
        this.cidade = entiy.getCidade();
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
    public String getSn() {
        return sn;
    }
    public void setSn(String sn) {
        this.sn = sn;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
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



    @Override
    public String toString() {
        return "MoradiaDto [id=" + id + ", cep=" + cep + ", avenida=" + avenida + ", sn=" + sn + ", bairro=" + bairro
                + ", cidade=" + cidade + ", perfil=" + perfil + "]";
    }
  

    


    

}
