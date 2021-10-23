 package com.misiontic.usuariosApiRichard.Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.misiontic.usuariosApiRichard.Entity.Perfil;
import com.misiontic.usuariosApiRichard.services.perfilServices;

@RestController
public class perfilController  {
	
	@Autowired
	private perfilServices perfilService;	
	
	@GetMapping(value = "/perfiles/{perfilId}") 
	public ResponseEntity<Perfil> findById(@PathVariable("perfilId") Long perfilId) {
		Perfil perfil = perfilService.findById(perfilId);
		return new ResponseEntity<Perfil>(perfil, HttpStatus.OK);	 
	}
	
	@DeleteMapping(value = "/perfiles/{perfilId}")
	public ResponseEntity<Void> delete(@PathVariable("perfilId")Long perfilId) {
		perfilService.delete(perfilId);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping(value = "/perfiles")
		public ResponseEntity<List<Perfil>>  findAll(){ 
			List<Perfil> perfiles = perfilService.findAll();
		return new ResponseEntity<List<Perfil>>(perfiles,HttpStatus.OK);
	}
	@PostMapping(value = "/perfiles")
	public ResponseEntity<Perfil> create(@RequestBody Perfil perfil) {
		Perfil nuevoPerfil = perfilService.create(perfil);
		return new ResponseEntity<Perfil>(nuevoPerfil,HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/perfiles")  
	public ResponseEntity<Perfil> update(@RequestBody Perfil perfil) {
		Perfil ExistePerfil = perfilService.update(perfil);
		return new ResponseEntity<Perfil>(ExistePerfil,HttpStatus.OK);
	}
	
			
		
}
