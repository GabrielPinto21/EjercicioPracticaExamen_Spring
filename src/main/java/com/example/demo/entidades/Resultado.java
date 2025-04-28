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
public class Resultado {
	
	@Id
	private int id;
	private int goles;
	private int amarillas;
	private int rojas;
	
	
	private Partido partido_id;
	private Seleccion seleccion_id;
	

}
