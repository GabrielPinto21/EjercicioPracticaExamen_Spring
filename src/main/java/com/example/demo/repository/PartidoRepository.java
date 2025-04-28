package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidades.Partido;

public interface PartidoRepository extends JpaRepository<Partido, Integer>{

}
