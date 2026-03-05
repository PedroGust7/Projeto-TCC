package com.api.Projeto_3.dtos;

import java.io.Serializable;

import com.api.Projeto_3.model.AfiliacaoModelo;
import com.api.Projeto_3.model.PerfisModelo;

public class AfiliacaoDtos implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private  Long id;
    private  String maeNome;
    private  String maeTelefone;
    private  String maeEmail;
    private  String paiName;
    private  String paiTelefone;
    private  String paiEmail;
    private PerfisModelo perfis;


     public AfiliacaoDtos(AfiliacaoModelo  en){
        this.id = en.getId();
     }
    
     

    public AfiliacaoDtos(Long id, String maeNome, String maeTelefone, String maeEmail, String paiName,
            String paiTelefone, String paiEmail, PerfisModelo perfis) {
        this.id = id;
        this.maeNome = maeNome;
        this.maeTelefone = maeTelefone;
        this.maeEmail = maeEmail;
        this.paiName = paiName;
        this.paiTelefone = paiTelefone;
        this.paiEmail = paiEmail;

    }

     public AfiliacaoDtos(){

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
