package com.example.demo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seleccion {
	
	@Id
	private int id;
	private String nombre;
	private char grupo;
	
	
	
	private Continente continente_id;

}
