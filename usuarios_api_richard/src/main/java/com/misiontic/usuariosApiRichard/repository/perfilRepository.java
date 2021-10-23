package com.misiontic.usuariosApiRichard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misiontic.usuariosApiRichard.Entity.Perfil;

@Repository
public interface perfilRepository extends JpaRepository<Perfil, Long> {

}
