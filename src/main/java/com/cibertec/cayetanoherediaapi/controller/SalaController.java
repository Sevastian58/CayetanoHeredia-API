package com.cibertec.cayetanoherediaapi.controller;

import com.cibertec.cayetanoherediaapi.entity.Sala;
import com.cibertec.cayetanoherediaapi.services.SalaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/sala")
public class SalaController {
	
	@Autowired
	private SalaServices serSala;
	
	@RequestMapping("/listaSalaEspecialidad")
	@ResponseBody
	public List<Sala> listaSalasEspecialidad(@RequestParam("especialidad") int espe) {
		return serSala.listarSalaEspecialidad(espe);
	}
}
