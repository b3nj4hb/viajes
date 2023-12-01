package com.example.viajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.viajes.entity.Rutas;

@Repository
public interface RutasRepository extends JpaRepository<Rutas, Integer> {

}
