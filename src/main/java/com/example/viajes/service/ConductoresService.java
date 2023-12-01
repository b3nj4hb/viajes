package com.example.viajes.service;

import java.util.List;
import com.example.viajes.entity.Conductores;

public interface ConductoresService {
    List<Conductores> readAll();

    Conductores create(Conductores al);

    Conductores read(int id);

    void delete(int id);

    Conductores update(Conductores al);
}
