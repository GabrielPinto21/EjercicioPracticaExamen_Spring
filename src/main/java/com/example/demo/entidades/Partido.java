package com.example.demo.entidades;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Partido {
	
	@Id
	private int id;
	
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name = "estadio_id")
	private Estadio estadio;
	
	@OneToMany(mappedBy = "partido")
	private List<Resultado> resultados;
	
}
