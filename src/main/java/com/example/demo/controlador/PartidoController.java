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

import com.example.demo.entidades.Partido;
import com.example.demo.services.PartidoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/partidos")
public class PartidoController {

    @Autowired
    private PartidoService partidoService;

    @GetMapping
    public ResponseEntity<List<Partido>> getAllPartidos() {
        List<Partido> partidos = partidoService.getAllPartidos();
        return new ResponseEntity<>(partidos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Partido> getPartidoById(@PathVariable int id) {
        Partido partido = partidoService.getPartidoById(id);
        return new ResponseEntity<>(partido, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Partido> addPartido(@RequestBody Partido partido) {
        partidoService.addPartido(partido);
        return new ResponseEntity<>(partido, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePartidoById(@PathVariable int id) {
        partidoService.deletePartidoById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
