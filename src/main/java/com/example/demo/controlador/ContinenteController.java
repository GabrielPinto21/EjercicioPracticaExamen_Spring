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

import com.example.demo.entidades.Continente;
import com.example.demo.services.ContinenteService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/continentes")
public class ContinenteController {

    @Autowired
    private ContinenteService continenteService;

    @GetMapping
    public ResponseEntity<List<Continente>> getAllContinentes() {
        List<Continente> continentes = continenteService.getAllContinentes();
        return new ResponseEntity<>(continentes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Continente> getContinenteById(@PathVariable int id) {
        Continente continente = continenteService.getContinenteById(id);
        return new ResponseEntity<>(continente, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Continente> addContinente(@RequestBody Continente continente) {
        continenteService.addContinente(continente);
        return new ResponseEntity<>(continente, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContinenteById(@PathVariable int id) {
        continenteService.deleteContinenteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

