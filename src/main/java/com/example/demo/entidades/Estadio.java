package com.example.demo.entidades;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estadio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estadio_seq")
	@SequenceGenerator(name = "estadio_seq", sequenceName = "estadio_seq", allocationSize = 1)
	private int id;
	
	private String nombre;
	private int capacidad;
	
	@JsonIgnore
	@OneToMany(mappedBy = "estadio")
	private List<Partido> partidos;
	
}
