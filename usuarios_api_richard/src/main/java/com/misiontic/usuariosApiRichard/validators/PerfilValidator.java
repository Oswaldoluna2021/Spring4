package com.misiontic.usuariosApiRichard.validators;

import com.misiontic.usuariosApiRichard.Entity.Perfil;

public class PerfilValidator {

	public static void save(Perfil perfil) {
		if(perfil.getNombre() == null || perfil.getNombre().trim().isEmpty()) {
			throw new RuntimeException("El nombre del perfil es obligatorio. ");
		}
		
		if(perfil.getNombre().length()>100) {
			throw new RuntimeException("El nombre del cliente no debe superar los 100 caracteres");
		}
		
		if(perfil.getApellidos().length()>100) {
			throw new RuntimeException("El nombre del cliente no debe superar los 100 caracteres");
		}
		
		if(perfil.getIdentificacion().longValue() >10) {
			throw new RuntimeException("El Documento del cliente no debe superar los 10 caracteres");
		}
		
		if(perfil.getValorCompra().longValue()>10) {
			throw new RuntimeException("El valor de la factura no debe superar los 10 caracteres");
		}
	}
}
