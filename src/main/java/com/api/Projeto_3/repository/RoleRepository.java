package com.api.Projeto_3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.Projeto_3.model.RolesModel;

public interface RoleRepository extends JpaRepository<RolesModel,Long> {

    
}