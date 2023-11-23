package com.example.viajes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.viajes.entity.Buses;
import com.example.viajes.repository.BusesRepository;
import com.example.viajes.service.BusesService;

@Service
public class BusesServiceImpl implements BusesService {

    @Autowired
    private BusesRepository r;

    @Override
    public List<Buses> readAll() {
        return r.findAll();
    }

    @Override
    public Buses create(Buses al) {
        return r.save(al);
    }

    @Override
    public Buses read(int id) {
        return r.findById(id).get();
    }

    @Override
    public void delete(int id) {
        r.deleteById(id);
    }

    @Override
    public Buses update(Buses al) {
        return r.save(al);
    }

}
