package com.cibertec.cayetanoherediaapi.services;

import com.cibertec.cayetanoherediaapi.dao.EspecialidadRepository;
import com.cibertec.cayetanoherediaapi.entity.Especialidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadServices {
	@Autowired
	private EspecialidadRepository tr;
	
	public List<Especialidad> listarTodos(){
		return tr.findAll();
	}
	
}
