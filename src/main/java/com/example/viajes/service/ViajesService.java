package com.example.viajes.service;

import java.util.List;
import com.example.viajes.entity.Viajes;

public interface ViajesService {
    List<Viajes> readAll();

    Viajes create(Viajes al);

    Viajes read(int id);

    void delete(int id);

    Viajes update(Viajes al);
}
