package com.example.demo.entidades;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
public class Partido {
	
	@Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.SEQUENCE, generator = "partido_seq")
	@SequenceGenerator(name = "partido_seq", sequenceName = "partido_seq", allocationSize = 1)
	private int id;
	
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name = "estadio_id")
	private Estadio estadio;
	
	@JsonIgnore
	@OneToMany(mappedBy = "partido")
	private List<Resultado> resultados;
	
}
