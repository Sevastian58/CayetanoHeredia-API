package com.cibertec.cayetanoherediaapi.controller;

import com.cibertec.cayetanoherediaapi.entity.Sala;
import com.cibertec.cayetanoherediaapi.services.SalaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sala")
public class SalaController {
	
	@Autowired
	private SalaServices serSala;
	
	@GetMapping("/byEspecialidad/{especialidad}")
	public List<Sala> listaSalasEspecialidad(@PathVariable int especialidad) {
		return serSala.listarSalaEspecialidad(especialidad);
	}
}
