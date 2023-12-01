package com.example.viajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.viajes.entity.Flota;

@Repository
public interface FlotaRepository extends JpaRepository<Flota, Integer> {

}
