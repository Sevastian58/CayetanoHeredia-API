package com.cibertec.cayetanoherediaapi.controller;

import com.cibertec.cayetanoherediaapi.entity.HistorialClinico;
import com.cibertec.cayetanoherediaapi.entity.Paciente;
import com.cibertec.cayetanoherediaapi.services.HistorialClinicoServices;
import com.cibertec.cayetanoherediaapi.services.PacienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@RestController
@RequestMapping("/historiaClinica")
public class HistorialClinicoController {
	@Autowired
	private HistorialClinicoServices hispe;
	@Autowired
	private PacienteServices serpa;
	
	@GetMapping("/lista")
	public List<HistorialClinico> index(Model model) {
		return hispe.listarHistorialClinico();
	}

	@PostMapping("/grabar")
	@ResponseBody
	public HistorialClinico grabar(@RequestBody HistorialClinico historial) {
		
		return hispe.registrar(historial);
	}

	@PutMapping("/modificar")
	@ResponseBody
	public HistorialClinico modificar(@RequestBody HistorialClinico historial) {

		return hispe.actualizar(historial);
	}
	@GetMapping("/buscar/{id}")
	@ResponseBody
	public HistorialClinico buscarPorIdHistorialClinico(@PathVariable("id")Integer cod) {
		return hispe.buscarPorID(cod);
	}
	
	@GetMapping("/buscarPorPaciente/{id}")
	@ResponseBody
	public HistorialClinico buscarPorPaciente(@PathVariable("id") String cod) {
		return hispe.buscarPorPaciente(cod);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarPorID(@PathVariable("codigo")Integer cod) {
		hispe.eliminarPorID(cod);
	}
			                                                                             
	
	
	
	
	
}




