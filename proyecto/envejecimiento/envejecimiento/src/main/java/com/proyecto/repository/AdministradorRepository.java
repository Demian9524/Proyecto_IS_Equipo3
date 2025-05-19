package com.proyecto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.proyecto.model.Administrador;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador,Long> {
    Optional<Administrador> findByCorreo(String correo);

    @Query("SELECT COALESCE(MAX(a.idUsuario), 0) FROM Administrador a")
    int findMaxIdUsuario();
}
