package com.example.viajes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.viajes.entity.Viajes;
import com.example.viajes.repository.ViajesRepository;
import com.example.viajes.service.ViajesService;

@Service
public class ViajesServiceImpl implements ViajesService {

    @Autowired
    private ViajesRepository r;

    @Override
    public List<Viajes> readAll() {
        return r.findAll();
    }

    @Override
    public Viajes create(Viajes al) {
        return r.save(al);
    }

    @Override
    public Viajes read(int id) {
        return r.findById(id).get();
    }

    @Override
    public void delete(int id) {
        r.deleteById(id);
    }

    @Override
    public Viajes update(Viajes al) {
        return r.save(al);
    }
}