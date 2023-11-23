package com.example.viajes.service;

import java.util.List;
import com.example.viajes.entity.Buses;

public interface BusesService {
    List<Buses> readAll();

    Buses create(Buses al);

    Buses read(int id);

    void delete(int id);

    Buses update(Buses al);
}
