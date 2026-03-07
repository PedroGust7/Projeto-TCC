package com.api.Projeto_3.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "AFLIACAO" )
public class AfiliacaoModelo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "maeNome" ,  length = 50)
    private  String maeNome;

    @Column(name = "maeTelefone" )
    private  String maeTelefone;

    @Column(name = "maeEmail" )
    private  String maeEmail;

    @Column(name = "paiName" )
    private  String paiName;


    @Column(name = "paiTelefone" )
    private  String paiTelefone;


    @Column(name = "paiEmail" )
    private  String paiEmail;

    @OneToOne(mappedBy = "pais_fk")
    private PerfisModelo perfis;

    
    public AfiliacaoModelo() {
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getMaeNome() {
        return maeNome;
    }


    public void setMaeNome(String maeNome) {
        this.maeNome = maeNome;
    }


    public String getMaeTelefone() {
        return maeTelefone;
    }


    public void setMaeTelefone(String maeTelefone) {
        this.maeTelefone = maeTelefone;
    }


    public String getMaeEmail() {
        return maeEmail;
    }


    public void setMaeEmail(String maeEmail) {
        this.maeEmail = maeEmail;
    }


    public String getPaiName() {
        return paiName;
    }


    public void setPaiName(String paiName) {
        this.paiName = paiName;
    }


    public String getPaiTelefone() {
        return paiTelefone;
    }


    public void setPaiTelefone(String paiTelefone) {
        this.paiTelefone = paiTelefone;
    }


    public String getPaiEmail() {
        return paiEmail;
    }


    public void setPaiEmail(String paiEmail) {
        this.paiEmail = paiEmail;
    }


    public PerfisModelo getPerfis() {
        return perfis;
    }


    public void setPerfis(PerfisModelo perfis) {
        this.perfis = perfis;
    }


    
    


    
}
