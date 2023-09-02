package com.cibertec.cayetanoherediaapi.services;

import com.cibertec.cayetanoherediaapi.dao.SalaRepository;
import com.cibertec.cayetanoherediaapi.entity.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaServices {

	@Autowired
	private SalaRepository repo;
	
	public List<Sala> listarTodo(){
		return	repo.findAll();
	}
	
	public List<Sala> listarSalaEspecialidad(int codEspe){
		return repo.listarSalaEspecialidad(codEspe);
	}
}
