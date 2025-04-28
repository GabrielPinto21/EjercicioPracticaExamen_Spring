package com.example.demo.entidades;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estadio {
	
	@Id
	private int id;
	private String nombre;
	private int capacidad;
	
	private List<Partido> partido_id;
	

}
