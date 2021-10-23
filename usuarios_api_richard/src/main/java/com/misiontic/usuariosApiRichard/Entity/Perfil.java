package com.misiontic.usuariosApiRichard.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "perfiles")
public class Perfil {
	
	@Id
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column (name = "nombre", nullable = false, length = 100)
	private String nombre;
	
	@Column (name = "apellidos", nullable = false, length = 100)
	private String apellidos;
	
	@Column (name = "Identificacion", nullable = false, length = 10)
	private Long identificacion;
	
	@Column (name = "direccion", nullable = false, length = 100)
	private String direccion;

	@Column (name = "valorCompra", nullable = false, length = 10)
	private Long valorCompra;


}

