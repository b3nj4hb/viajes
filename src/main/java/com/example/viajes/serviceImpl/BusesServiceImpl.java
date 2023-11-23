package com.example.viajes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.viajes.entity.Buses;
import com.example.viajes.repository.BusesRepository;
import com.example.viajes.service.BusesService;

public class BusesServiceImpl implements BusesService {

    @Autowired
    private BusesRepository r;

    @Override
    public List<Buses> readAll() {
        // TODO Auto-generated method stub
        return r.findAll();
    }

    @Override
    public Buses create(Buses al) {
        // TODO Auto-generated method stub
        return r.save(al);
    }

    @Override
    public Buses read(int id) {
        // TODO Auto-generated method stub
        return r.findById(id).get();
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        r.deleteById(id);
    }

    @Override
    public Buses update(Buses al) {
        // TODO Auto-generated method stub
        return r.save(al);
    }

}
