package com.api.Projeto_3.dtos;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.api.Projeto_3.model.AtletaModelo;
import com.fasterxml.jackson.annotation.JsonFormat;

public class AtletaDtos {
   private Long id;  
    private byte[] fotoImg;
    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd") // ESSENCIAL para formulários
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dataNascimento;
    private String cpf;
    private String rg;
    private String email;
    private String senha;
    private String telefoneFixo;
    private String telefoneZap;
    private String pesoMigrama;
    private String alturaCetimentro;
    
  
    private AfiliacaoDtos pais_fk;
    private MoradiaDto moradia_fk;

    public AtletaDtos() {
    }


    public AtletaDtos(AtletaModelo atl) {
        this.id = atl.getId();
        this.fotoImg = atl.getFotoImg();
        this.name = atl.getName();
        this.dataNascimento = atl.getDataNascimento();
        this.cpf = atl.getCpf();
        this.rg = atl.getRg();
        this.email = atl.getEmail();
        this.senha = atl.getSenha();
        this.telefoneFixo = atl.getTelefoneFixo();
        this.telefoneZap = atl.getTelefoneZap();
        this.pesoMigrama =  String.valueOf(atl.getPesoMigrama());
        this.alturaCetimentro = String.valueOf(atl.getAlturaCetimentro());
       
        
    if (atl.getPais_fk() != null) {
        this.pais_fk = new AfiliacaoDtos(atl.getPais_fk()); 
    }
    if (atl.getMoradia_fk() != null) {
        this.moradia_fk = new MoradiaDto(atl.getMoradia_fk());
    }
    
    }



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public byte[] getFotoImg() {
        return fotoImg;
    }



    public void setFotoImg(byte[] fotoImg) {
        this.fotoImg = fotoImg;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public Date getDataNascimento() {
        return dataNascimento;
    }



    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }



    public String getCpf() {
        return cpf;
    }



    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    public String getRg() {
        return rg;
    }



   public void setRg(String rg) {
    this.rg = rg; 
}



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getSenha() {
        return senha;
    }



    public void setSenha(String senha) {
        this.senha = senha;
    }



    public String getTelefoneFixo() {
        return telefoneFixo;
    }



    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }



    public String getTelefoneZap() {
        return telefoneZap;
    }



    public void setTelefoneZap(String telefoneZap) {
        this.telefoneZap = telefoneZap;
    }



    public String getPesoMigrama() {
        return pesoMigrama;
    }



    public void setPesoMigrama(String pesoMigrama) {
        this.pesoMigrama = pesoMigrama;
    }



    public String getAlturaCetimentro() {
        return alturaCetimentro;
    }



    public void setAlturaCetimentro(String alturaCetimentro) {
        this.alturaCetimentro = alturaCetimentro;
    }



    public AfiliacaoDtos getPais_fk() {
        return pais_fk;
    }



    public void setPais_fk(AfiliacaoDtos pais_fk) {
        this.pais_fk = pais_fk;
    }



    public MoradiaDto getMoradia_fk() {
        return moradia_fk;
    }



    public void setMoradia_fk(MoradiaDto moradia_fk) {
        this.moradia_fk = moradia_fk;
    }



    

}
