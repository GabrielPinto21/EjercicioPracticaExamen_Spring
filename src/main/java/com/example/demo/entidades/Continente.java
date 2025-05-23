package com.example.demo.entidades;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Continente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "continente_seq")
	@SequenceGenerator(name = "continente_seq", sequenceName = "continente_seq", allocationSize = 1)
	private int id;
	
	private String nombre;
	
	@JsonIgnore
	@OneToMany(mappedBy = "continente")
	private List<Seleccion> selecciones;
	
}
