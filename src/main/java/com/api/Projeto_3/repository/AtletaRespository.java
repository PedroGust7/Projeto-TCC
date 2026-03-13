package com.api.Projeto_3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.Projeto_3.model.AtletaModelo;



@Repository
public interface AtletaRespository extends  JpaRepository<AtletaModelo,Long>  {
 @Query(value = "SELECT * FROM ATLETAS a INNER JOIN perfis_modelo p ON a.perfil_id = p.id WHERE a.id = :atletaId", nativeQuery = true)
AtletaModelo pegarAtletaComPerfil(@Param("atletaId") Long atletaId);
}
