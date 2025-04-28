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

import com.example.demo.entidades.Seleccion;
import com.example.demo.services.SeleccionService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/selecciones")
public class SeleccionController {

    @Autowired
    private SeleccionService seleccionService;

    @GetMapping
    public ResponseEntity<List<Seleccion>> getAllSelecciones() {
        List<Seleccion> selecciones = seleccionService.getAllSelecciones();
        return new ResponseEntity<>(selecciones, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Seleccion> getSeleccionById(@PathVariable int id) {
        Seleccion seleccion = seleccionService.getSeleccionById(id);
        return new ResponseEntity<>(seleccion, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Seleccion> addSeleccion(@RequestBody Seleccion seleccion) {
        seleccionService.addSeleccion(seleccion);
        return new ResponseEntity<>(seleccion, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSeleccionById(@PathVariable int id) {
        seleccionService.deleteSeleccionById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

