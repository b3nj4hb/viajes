package com.example.viajes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.viajes.entity.Rutas;
import com.example.viajes.repository.RutasRepository;
import com.example.viajes.service.RutasService;

@Service
public class RutasServiceImpl implements RutasService {
    @Autowired
    private RutasRepository r;

    @Override
    public List<Rutas> readAll() {
        return r.findAll();
    }

    @Override
    public Rutas create(Rutas al) {
        return r.save(al);
    }

    @Override
    public Rutas read(int id) {
        return r.findById(id).get();
    }

    @Override
    public void delete(int id) {
        r.deleteById(id);
    }

    @Override
    public Rutas update(Rutas al) {
        return r.save(al);
    }
}
