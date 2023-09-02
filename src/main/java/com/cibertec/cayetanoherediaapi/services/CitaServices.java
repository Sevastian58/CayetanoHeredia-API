package com.cibertec.cayetanoherediaapi.services;

import com.cibertec.cayetanoherediaapi.dao.CitaRepository;
import com.cibertec.cayetanoherediaapi.entity.Cita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CitaServices {
	@Autowired
	private CitaRepository cr;

	public List<Cita> listAll(){
		return cr.findAll();
	}
	public Cita registrar(Cita c)  {
		return cr.save(c);
	}
	public Cita modificar(Cita c) {

		return cr.save(c);
	}
	public List<Cita> listarCitasCreate(Integer codEspe, String numSala, String codMed, LocalDate fecha){
		return cr.listarPorEspeSalaMedFecha(codEspe, numSala, codMed, fecha);
	}
}
