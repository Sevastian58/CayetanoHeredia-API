package com.cibertec.cayetanoherediaapi.controller;

import com.cibertec.cayetanoherediaapi.entity.Especialidad;
import com.cibertec.cayetanoherediaapi.entity.Medico;
import com.cibertec.cayetanoherediaapi.services.EspecialidadServices;
import com.cibertec.cayetanoherediaapi.services.MedicoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@RestController
@RequestMapping("/medico")
public class MedicoController {
	
	@Autowired
	private MedicoServices serMedico;
	@Autowired
	private EspecialidadServices serEspecialidad;

	@GetMapping("/lista")
	@ResponseBody
	public List<Medico> Index() {
		return serMedico.ListarTodo();
	}
	
	@GetMapping("/listaEspecialidad/{especialidad}")
	@ResponseBody
	public List<Medico> listaMedicosEspecialidad(@PathVariable int especialidad) {
		return serMedico.listarMedicoPorEspecialidad(especialidad);
	}


	@PostMapping("/grabar")
	public Medico grabar(@RequestBody Medico med) {
		return serMedico.adicionar(med);
	}

	@PutMapping("/actualizar")
	public Medico actualizar(@RequestBody Medico med)
	{
		return serMedico.adicionar(med);
	}
	
	@GetMapping("/buscar/{id}")
	@ResponseBody
	public Medico buscarPorID(@PathVariable String id) {
		return serMedico.buscarPorID(id);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable String id) {
		serMedico.eliminar(id);
	}
}
