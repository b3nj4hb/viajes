package com.example.viajes.service;

import java.util.List;
import com.example.viajes.entity.Rutas;

public interface RutasService {
    List<Rutas> readAll();

    Rutas create(Rutas al);

    Rutas read(int id);

    void delete(int id);

    Rutas update(Rutas al);
}
