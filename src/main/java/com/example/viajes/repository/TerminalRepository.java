package com.example.viajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.viajes.entity.Terminal;

@Repository
public interface TerminalRepository extends JpaRepository<Terminal, Integer> {

}
