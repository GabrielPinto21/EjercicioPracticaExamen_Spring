package com.example.demo.entidades;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
	
	private Estadio estadio_id;
	

}
