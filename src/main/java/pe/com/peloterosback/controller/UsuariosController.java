package pe.com.peloterosback.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.peloterosback.entity.UsuarioEntity;
import pe.com.peloterosback.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuariosController {
	
	 @Autowired
	 private UsuarioService UsuSer;
	 
	 @GetMapping("/{id}")
	 public Optional<UsuarioEntity>findById(@PathVariable Long id ){
        
		 return UsuSer.findById(id);
	 }
	 
	 @GetMapping
	    public List<UsuarioEntity>findAll(){
	        return UsuSer.findAll();
	    }
	 
	 @GetMapping("/custom")
		public String holaMundo() {
			return "Hola Mundo desde el controlador UsuariosController";
		}

}
