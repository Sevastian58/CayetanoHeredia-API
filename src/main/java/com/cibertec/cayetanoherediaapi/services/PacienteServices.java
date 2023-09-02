package com.cibertec.cayetanoherediaapi.services;

import com.cibertec.cayetanoherediaapi.dao.PacienteRepository;
import com.cibertec.cayetanoherediaapi.entity.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServices {
	@Autowired
	private PacienteRepository repo;
	
	public Paciente registrar(Paciente p) {
		return repo.save(p);
	}
	public Paciente actualizar(Paciente p) {return repo.save(p); }
	public void eliminarPorID(String cod) {
		repo.deleteById(cod);
	}
	public Paciente buscarPorID(String cod) {
		return repo.findById(cod).orElse(null);
	}
	public List<Paciente> listarTodos(){
		return repo.findAll();
	}
	public int ultimoCodigo() {
		return repo.ultimoCodigo();
	}
	public List<Paciente> buscarPorNombre(String nombre){
		return repo.buscarPorNombre(nombre);
	}
}
