package com.example.viajes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.viajes.entity.Buses;
import com.example.viajes.service.BusesService;

@RestController
@RequestMapping("/api/bus")
public class BusesController {
    @Autowired
    private BusesService s;

    @GetMapping("/")
    public ResponseEntity<String> mensaje() {
        // Mensaje fijo que deseas devolver
        String mensaje = "¡Hola desde mi API!";

        // Imprime el mensaje en la consola (esto es solo para demostración)
        System.out.println("Mensaje: " + mensaje);

        // Retorna una respuesta al cliente
        return new ResponseEntity<>(mensaje, HttpStatus.OK);
    }

    // CREAR
    @PostMapping("/create")
    public ResponseEntity<Buses> save(@RequestBody Buses lib) {
        try {
            Buses l = s.create(lib);
            return new ResponseEntity<>(l, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // LISTAR
    @GetMapping("/all")
    public ResponseEntity<List<Buses>> list() {
        try {
            List<Buses> list = new ArrayList<>();
            list = s.readAll();
            if (list.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // BUSCAR {ID}
    @GetMapping("/read/{id}")
    public ResponseEntity<Buses> search(@PathVariable("id") int id) {
        Buses buses = s.read(id);
        if (buses.getBu_Placa() > 0) {
            return new ResponseEntity<>(buses, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // ELIMINAR
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id) {
        try {
            s.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // ACTUALIZAR {ID}
    @PutMapping("/update/{id}")
    public ResponseEntity<Buses> update(@RequestBody Buses l, @PathVariable("id") int id) {
        try {
            Buses li = s.read(id);
            if (li.getBu_Placa() > 0) {
                li.setBu_CodiFlot(l.getBu_CodiFlot());
                li.setBu_Capacidad(l.getBu_Capacidad());
                li.setBu_FechFabri(l.getBu_FechFabri());
                li.setBu_Tipo(l.getBu_Tipo());

                return new ResponseEntity<>(s.create(li), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
