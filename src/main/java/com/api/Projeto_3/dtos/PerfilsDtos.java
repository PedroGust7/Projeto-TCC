package com.api.Projeto_3.dtos;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import com.api.Projeto_3.model.AtletaModelo;
import com.api.Projeto_3.model.MedicoModelo;
import com.api.Projeto_3.model.TreinadorModel;
import com.api.Projeto_3.model.enums.EnumGenero;
import com.api.Projeto_3.model.enums.EnumSague;
import com.api.Projeto_3.model.enums.EnumUf;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class PerfilsDtos {
   private Long id;  

   @NotBlank(message = "O campo de nome não pode vazio !!!")
   @Size(min = 5  , max = 50 , message = "O nome de ser maior que 5 letreas")
    private String name;
    
    @NotNull(message = "A data de nascimento é obrigatória")
    @PastOrPresent(message = "A data não pode estar no futuro")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNascimento;

    @CPF(message = "CPF inválido")
    private String cpf;

   @Size(min = 5  , max = 50 , message = "O nome de ser maior que 5 letreas")
    private String rg;

    @Email(message = "Deve ser um email valido !!")
    private String email;

    @Size(min = 5 , message = "Senha ter mas de  5 cacteres")
    private String senha;
    
    @NotBlank(message = "O campo não pode estar vazio")
    @Pattern(regexp = "^[0-9]+$", message = "O campo deve conter apenas números")
    private String telefoneFixo;
    
    @NotBlank(message = "O campo não pode estar vazio")
    @Pattern(regexp = "^[0-9]+$", message = "O campo deve conter apenas números")
    private String telefoneZap;
    
    @NotBlank(message = "O campo não pode estar vazio")
    @Pattern(regexp = "^[0-9]+$", message = "O campo deve conter apenas números")
    private String pesoMigrama;


    @NotBlank(message = "O campo não pode estar vazio")
    @Pattern(regexp = "^[0-9]+$", message = "O campo deve conter apenas números")
    private String alturaCetimentro;  

    private AfiliacaoDtos pais_fk;  
    private MoradiaDto moradia_fk;
    private EnumUf ufDtos;
    
    @NotNull(message = "Selecione o tipo genero")
    private EnumGenero genero;

    @NotNull(message = "Selecione o tipo sanguíneo")
    private EnumSague sangue;
    private RoleDtos roles;
    public PerfilsDtos() {
    }

    public  PerfilsDtos(AtletaModelo atl) {
            this.id = atl.getId();
            this.name = atl.getName();
            this.dataNascimento = atl.getDataNascimento();
            this.cpf = atl.getCpf();
            this.rg = atl.getRg();
            this.email = atl.getEmail();
            this.senha = atl.getSenha();
            this.telefoneFixo = atl.getTelefoneFixo();
            this.telefoneZap = atl.getTelefoneZap();
            this.pesoMigrama =  atl.getPesoMigrama();
            this.alturaCetimentro = atl.getAlturaCetimentro();
            this.pais_fk = new AfiliacaoDtos(atl.getPais_fk()); 
            this.moradia_fk = new MoradiaDto(atl.getMoradia_fk());
            this.ufDtos = atl.getUf();
            this.genero = atl.getSexo();
            this.sangue = atl.getSangue();
            this.roles = new RoleDtos(atl.getRole());
    }

    public  PerfilsDtos(MedicoModelo med) {
            this.id = med.getId();
            this.name = med.getName();
            this.dataNascimento = med.getDataNascimento();
            this.cpf = med.getCpf();
            this.rg = med.getRg();
            this.email = med.getEmail();
            this.senha = med.getSenha();
            this.telefoneFixo = med.getTelefoneFixo();
            this.telefoneZap = med.getTelefoneZap();
            this.pesoMigrama =  med.getPesoMigrama();
            this.alturaCetimentro = med.getAlturaCetimentro();
            this.pais_fk = new AfiliacaoDtos(med.getPais_fk()); 
            this.moradia_fk = new MoradiaDto(med.getMoradia_fk());
            this.ufDtos = med.getUf();
            this.genero = med.getSexo();
            this.sangue = med.getSangue();
            this.roles = new RoleDtos(med.getRole());
    }


        public  PerfilsDtos(TreinadorModel trei) {
            this.id = trei.getId();
            this.name = trei.getName();
            this.dataNascimento = trei.getDataNascimento();
            this.cpf = trei.getCpf();
            this.rg = trei.getRg();
            this.email = trei.getEmail();
            this.senha = trei.getSenha();
            this.telefoneFixo = trei.getTelefoneFixo();
            this.telefoneZap = trei.getTelefoneZap();
            this.pesoMigrama =  trei.getPesoMigrama();
            this.alturaCetimentro = trei.getAlturaCetimentro();
            this.pais_fk = new AfiliacaoDtos(trei.getPais_fk()); 
            this.moradia_fk = new MoradiaDto(trei.getMoradia_fk());
            this.ufDtos = trei.getUf();
            this.genero = trei.getSexo();
            this.sangue = trei.getSangue();
            this.roles = new RoleDtos(trei.getRole());
    }


    public Long getId() {
        return id;
    }




    public void setId(Long id) {
        this.id = id;
    }






    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public LocalDate getDataNascimento() {
        return dataNascimento;
    }



    public void setDataNascimento(LocalDate dataNascimento) {
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


    public EnumUf getUfDtos() {
        return ufDtos;
    }


    public void setUfDtos(EnumUf ufDtos) {
        this.ufDtos = ufDtos;
    }


    public EnumGenero getGenero() {
        return genero;
    }


    public void setGenero(EnumGenero genero) {
        this.genero = genero;
    }


    public EnumSague getSangue() {
        return sangue;
    }


    public void setSangue(EnumSague sangue) {
        this.sangue = sangue;
    }


    public RoleDtos getRoles() {
        return roles;
    }


    public void setRoles(RoleDtos roles) {
        this.roles = roles;
    }


    @Override
    public String toString() {
        return "AtletaDtos [id=" + id + ", name=" + name + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf
                + ", rg=" + rg + ", email=" + email + ", senha=" + senha + ", telefoneFixo=" + telefoneFixo
                + ", telefoneZap=" + telefoneZap + ", pesoMigrama=" + pesoMigrama + ", alturaCetimentro="
                + alturaCetimentro + ", pais_fk=" + pais_fk + ", moradia_fk=" + moradia_fk + ", ufDtos=" + ufDtos
                + ", genero=" + genero + ", sangue=" + sangue + ", roles=" + roles + "]";
    }


    
    

}
