package com.cibertec.cayetanoherediaapi.controller;

import com.cibertec.cayetanoherediaapi.entity.*;
import com.cibertec.cayetanoherediaapi.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/cita")
public class CitaController {
	@Autowired
	private CitaServices serCita;
	
	@Autowired
	private EspecialidadServices serEspecialidad;
	
	@Autowired
	private MedicoServices serMedico;
	
	@Autowired
	private SalaServices serSala;
	
	@Autowired
	private PacienteServices serPaciente;
		
	@GetMapping("/lista")
	public List<Cita> Index() {
		return serCita.listAll();
	}
	
	@GetMapping("/listaCreate")
	@ResponseBody
	public List<Cita> listaCreate(@RequestParam("especialidad") Integer codEspe, 
			@RequestParam("sala") String numSala,
			@RequestParam("medico") String codMed,
			@RequestParam("fecha") String fecha){
		LocalDate fechaDate= LocalDate.parse(fecha);
		return serCita.listarCitasCreate(codEspe, numSala, codMed, fechaDate);
	}
	
	@PostMapping("/grabar")
	public Cita GrabarCita(@RequestBody Cita c) {
		Paciente p = new Paciente();
		p=serPaciente.buscarPorID(c.getPaciente().getCodigo());
		if(p!=null) {
			 return serCita.registrar(c);

		}
		return null;
	}
}
