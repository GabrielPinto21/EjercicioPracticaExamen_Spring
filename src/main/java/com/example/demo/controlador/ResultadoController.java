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

import com.example.demo.entidades.Resultado;
import com.example.demo.services.ResultadoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/resultados")
public class ResultadoController {

    @Autowired
    private ResultadoService resultadoService;

    @GetMapping
    public ResponseEntity<List<Resultado>> getAllResultados() {
        List<Resultado> resultados = resultadoService.getAllResultados();
        return new ResponseEntity<>(resultados, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resultado> getResultadoById(@PathVariable int id) {
        Resultado resultado = resultadoService.getResultadoById(id);
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Resultado> addResultado(@RequestBody Resultado resultado) {
        resultadoService.addResultado(resultado);
        return new ResponseEntity<>(resultado, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResultadoById(@PathVariable int id) {
        resultadoService.deleteResultadoById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

