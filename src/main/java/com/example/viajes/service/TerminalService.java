package com.example.viajes.service;

import java.util.List;
import com.example.viajes.entity.Terminal;

public interface TerminalService {
    List<Terminal> readAll();

    Terminal create(Terminal al);

    Terminal read(int id);

    void delete(int id);

    Terminal update(Terminal al);
}
