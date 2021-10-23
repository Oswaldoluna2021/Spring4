package com.misiontic.usuariosApiRichard.services;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.misiontic.usuariosApiRichard.Entity.Perfil;
import com.misiontic.usuariosApiRichard.repository.perfilRepository;

@Service
public class perfilServices {

	@Autowired
	private perfilRepository perfilRepo;
	
	public Perfil findById(Long perfilId) {
		Perfil perfil = perfilRepo.findById(perfilId)
				.orElseThrow(() -> new RuntimeException("No existe el perfil"));
				return perfil;	 
	}	
	
	@Transactional
	public void delete(Long perfilId) {
		Perfil perfil = perfilRepo.findById(perfilId)
				.orElseThrow(() -> new RuntimeException("No existe el perfil"));
		perfilRepo.delete(perfil);
	}
	
		public List<Perfil>  findAll(){ 
			List<Perfil> perfiles = perfilRepo.findAll();
		return perfiles;
		}
		
		@Transactional
		public Perfil create(Perfil perfil) {
			Perfil nuevoPerfil = perfilRepo.save(perfil);
			return nuevoPerfil;
		}
		
		@Transactional  
		public Perfil update(Perfil perfil) {
			Perfil ExistePerfil = perfilRepo.findById(perfil.getId()) 
					.orElseThrow(() -> new RuntimeErrorException(null, "No existe el perfil."));
			
			ExistePerfil.setNombre(perfil.getNombre());
			perfilRepo.save(ExistePerfil);
			return ExistePerfil;
		}
		 
}
