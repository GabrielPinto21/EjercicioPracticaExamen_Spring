package com.example.demo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resultado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "resultado_seq")
	@SequenceGenerator(name = "resultado_seq", sequenceName = "resultado_seq", allocationSize = 1)
	private int id;
	
	@OneToOne
	@JoinColumn(name = "partido_id")
	private Partido partido;
	
	@ManyToOne
	@JoinColumn(name = "seleccion_id")
	private Seleccion seleccion;
	
	private int goles;
	private int amarillas;
	private int rojas;
	
}
