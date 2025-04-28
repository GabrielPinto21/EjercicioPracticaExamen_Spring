package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.Estadio;
import com.example.demo.services.EstadioService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/estadios")
public class EstadioController {

    @Autowired
    private EstadioService estadioService;

    @GetMapping
    public ResponseEntity<List<Estadio>> getAllEstadios() {
        List<Estadio> estadios = estadioService.getAllEstadios();
        return new ResponseEntity<>(estadios, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estadio> getEstadioById(@PathVariable int id) {
        Estadio estadio = estadioService.getEstadioById(id);
        return new ResponseEntity<>(estadio, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Estadio> addEstadio(@RequestBody Estadio estadio) {
        estadioService.addEstadio(estadio);
        return new ResponseEntity<>(estadio, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEstadioById(@PathVariable int id) {
        estadioService.deleteEstadioById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
