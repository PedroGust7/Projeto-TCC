package com.api.Projeto_3.dtos;

import java.util.Date;

import com.api.Projeto_3.model.AtletaModelo;

public class AtletaDtos {
   private Long id;  
    private byte[] fotoImg;
    private String name;
    private Date dataNascimento;
    private String cpf;
    private String Rg;
    private String email;
    private String senha;
    private String telefoneFixo;
    private String telefoneZap;
    private Double pesoMigrama;
    private Double alturaCetimentro;
    private AfiliacaoDtos pais;
    private MoradiaDto moradia_fk;

    public AtletaDtos() {
    }


    public AtletaDtos(AtletaModelo atl) {
        this.id = atl.getId();
        this.fotoImg = atl.getFotoImg();
        this.name = atl.getName();
        this.dataNascimento = atl.getDataNascimento();
        this.cpf = atl.getCpf();
        this.Rg = atl.getRg();
        this.email = atl.getEmail();
        this.senha = atl.getSenha();
        this.telefoneFixo = atl.getTelefoneFixo();
        this.telefoneZap = atl.getTelefoneZap();
        this.pesoMigrama = atl.getPesoMigrama();
        this.alturaCetimentro = atl.getAlturaCetimentro();


        if (atl.getPais() != null) {
            this.pais = new AfiliacaoDtos(atl.getPais());
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
        return Rg;
    }


    public void setRg(String rg) {
        Rg = rg;
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


    public Double getPesoMigrama() {
        return pesoMigrama;
    }


    public void setPesoMigrama(Double pesoMigrama) {
        this.pesoMigrama = pesoMigrama;
    }


    public Double getAlturaCetimentro() {
        return alturaCetimentro;
    }


    public void setAlturaCetimentro(Double alturaCetimentro) {
        this.alturaCetimentro = alturaCetimentro;
    }


    public AfiliacaoDtos getPais() {
        return pais;
    }


    public void setPais(AfiliacaoDtos pais) {
        this.pais = pais;
    }


    public MoradiaDto getMoradia_fk() {
        return moradia_fk;
    }


    public void setMoradia_fk(MoradiaDto moradia_fk) {
        this.moradia_fk = moradia_fk;
    }
    
    
    
}
