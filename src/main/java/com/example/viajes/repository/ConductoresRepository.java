package com.example.viajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.viajes.entity.Conductores;

@Repository
public interface ConductoresRepository extends JpaRepository<Conductores, Integer> {

}
