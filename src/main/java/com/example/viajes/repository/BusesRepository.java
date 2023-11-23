package com.example.viajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.viajes.entity.Buses;

@Repository
public interface BusesRepository extends JpaRepository<Buses, Integer> {
}