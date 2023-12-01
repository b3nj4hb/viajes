package com.example.viajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.viajes.entity.Viajes;

@Repository
public interface ViajesRepository extends JpaRepository<Viajes, Integer> {

}
