package com.api.Projeto_3.model;

import java.io.Serializable;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class PerfisModelo implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id; 

    @Lob
    private byte[] fotoImg;
    
    @Column(name = "per_nome" , nullable = false  , length =50)
    private String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name = "per_datNascimento" )
    private Date dataNascimento;

    @Column(name = "per_cpf")
    private String cpf;

    @Column(name = "per_rg")
    private String rg;
    
    @Column(name = "per_emial" )
    private String email;

    @Column(name = "per_senha" )
    private String senha;


    @Column(name = "per_telefoneFixo")
    private String telefoneFixo;

    @Column(name = "per_telefoneZap")
    private String telefoneZap;

    @Column(name = "per_PesoMigrama")
    private Double pesoMigrama;

    @Column(name = "per_altura")
    private Double alturaCetimentro;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fal_fk" , unique = true )
    private AfiliacaoModelo pais;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mord")
    private MoradiaModel moradia_fk; 


    @ManyToMany
    @JoinTable(name = "AcessoPerfil",
        joinColumns = @JoinColumn(name = "perfRole_fk"),
        inverseJoinColumns = @JoinColumn(name = "rolePerf")
    )
    private Set<RoleModel> roles = new HashSet<>();


    


    public PerfisModelo(Long id, byte[] fotoImg, String name, Date dataNascimento, String cpf, String rg, String email,
            String senha, String telefoneFixo, String telefoneZap, Double pesoMigrama, Double alturaCetimentro,
            AfiliacaoModelo pais, MoradiaModel moradia_fk, Set<RoleModel> roles) {
        this.id = id;
        this.fotoImg = fotoImg;
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.senha = senha;
        this.telefoneFixo = telefoneFixo;
        this.telefoneZap = telefoneZap;
        this.pesoMigrama = pesoMigrama;
        this.alturaCetimentro = alturaCetimentro;
        this.pais = pais;
        this.moradia_fk = moradia_fk;
        this.roles = roles;
    }


    public PerfisModelo() {
       
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


    public AfiliacaoModelo getPais() {
        return pais;
    }


    public void setPais(AfiliacaoModelo pais) {
        this.pais = pais;
    }


    public MoradiaModel getMoradia_fk() {
        return moradia_fk;
    }


    public void setMoradia_fk(MoradiaModel moradia_fk) {
        this.moradia_fk = moradia_fk;
    }


    public Set<RoleModel> getRoles() {
        return roles;
    }


    public void setRoles(Set<RoleModel> roles) {
        this.roles = roles;
    }


    @Override
    public String toString() {
        return "PerfisModelo [id=" + id + ", fotoImg=" + Arrays.toString(fotoImg) + ", name=" + name
                + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf + ", Rg=" + rg + ", email=" + email + ", senha="
                + senha + ", telefoneFixo=" + telefoneFixo + ", telefoneZap=" + telefoneZap + ", pesoMigrama="
                + pesoMigrama + ", alturaCetimentro=" + alturaCetimentro + ", pais=" + pais + ", moradia_fk="
                + moradia_fk + ", roles=" + roles + "]";
    }


    
 


    


    

}    


