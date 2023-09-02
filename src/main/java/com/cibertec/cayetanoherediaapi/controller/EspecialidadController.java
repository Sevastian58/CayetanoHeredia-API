package com.cibertec.cayetanoherediaapi.controller;

import com.cibertec.cayetanoherediaapi.entity.Especialidad;
import com.cibertec.cayetanoherediaapi.services.EspecialidadServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {

	@Autowired
	private EspecialidadServices serEspecialidad;
	
	
	@GetMapping("/lista")
	@ResponseBody
	public List<Especialidad> listarTodo(){
		return serEspecialidad.listarTodos();
	}
}
