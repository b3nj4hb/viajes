package com.example.viajes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.viajes.entity.Terminal;
import com.example.viajes.repository.TerminalRepository;
import com.example.viajes.service.TerminalService;

@Service
public class TerminalServiceImpl implements TerminalService {

    @Autowired
    private TerminalRepository r;

    @Override
    public List<Terminal> readAll() {
        return r.findAll();
    }

    @Override
    public Terminal create(Terminal al) {
        return r.save(al);
    }

    @Override
    public Terminal read(int id) {
        return r.findById(id).get();
    }

    @Override
    public void delete(int id) {
        r.deleteById(id);
    }

    @Override
    public Terminal update(Terminal al) {
        return r.save(al);
    }
}
