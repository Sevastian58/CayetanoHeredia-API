package com.cibertec.cayetanoherediaapi.controller;

import com.cibertec.cayetanoherediaapi.entity.Paciente;
import com.cibertec.cayetanoherediaapi.services.PacienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
	@Autowired
	private PacienteServices serPaciente;
	
	@RequestMapping(path="/lista", method = RequestMethod.GET)
	@ResponseBody
	public List<Paciente> index(Model model) {
		return serPaciente.listarTodos();
	}
	
	@PostMapping("/grabar")
	@ResponseBody
	public Paciente registrar(@RequestBody Paciente pac) {
				//int ultimoCodigo= serPaciente.ultimoCodigo() + 1;
				//String nuevoCodigo="PAC"+ ultimoCodigo;
				//pac.setCodigo(nuevoCodigo);
		return	serPaciente.registrar(pac);
	}

	@PutMapping("/actualizar")
	public Paciente actualizar(@RequestBody Paciente pac) {
		Paciente p = new Paciente();
		p = serPaciente.buscarPorID(pac.getCodigo());
		if(p!=null){
			return	serPaciente.actualizar(pac);
		}
		else{
			return null;
		}
	}
	
	//ruta para buscar medicamento por su código
	//retorna JSON
	@GetMapping("/buscar/{id}")
	@ResponseBody//--- para convertir en JSON el objeto retornado 
	public Paciente   buscarPorID(@PathVariable String id) {
		return serPaciente.buscarPorID(id);
	}
	
	@GetMapping("/buscarByName/{name}")
	@ResponseBody//--- para convertir en JSON el objeto retornado 
	public List<Paciente> buscarPorNombre(@PathVariable String name) {
		return serPaciente.buscarPorNombre(name);
	}
}
