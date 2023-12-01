package com.example.viajes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.viajes.entity.Conductores;
import com.example.viajes.repository.ConductoresRepository;
import com.example.viajes.service.ConductoresService;

@Service
public class ConductoresServiceImpl implements ConductoresService {

    @Autowired
    private ConductoresRepository r;

    @Override
    public List<Conductores> readAll() {
        return r.findAll();
    }

    @Override
    public Conductores create(Conductores al) {
        return r.save(al);
    }

    @Override
    public Conductores read(int id) {
        return r.findById(id).get();
    }

    @Override
    public void delete(int id) {
        r.deleteById(id);
    }

    @Override
    public Conductores update(Conductores al) {
        return r.save(al);
    }
}
