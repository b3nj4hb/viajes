package com.example.viajes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.viajes.entity.Flota;
import com.example.viajes.repository.FlotaRepository;
import com.example.viajes.service.FlotaService;

@Service
public class FlotaServiceImpl implements FlotaService {
    @Autowired
    private FlotaRepository r;

    @Override
    public List<Flota> readAll() {
        return r.findAll();
    }

    @Override
    public Flota create(Flota al) {
        return r.save(al);
    }

    @Override
    public Flota read(int id) {
        return r.findById(id).get();
    }

    @Override
    public void delete(int id) {
        r.deleteById(id);
    }

    @Override
    public Flota update(Flota al) {
        return r.save(al);
    }
}
