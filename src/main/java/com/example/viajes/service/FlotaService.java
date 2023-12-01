package com.example.viajes.service;

import java.util.List;
import com.example.viajes.entity.Flota;

public interface FlotaService {
    List<Flota> readAll();

    Flota create(Flota al);

    Flota read(int id);

    void delete(int id);

    Flota update(Flota al);
}
