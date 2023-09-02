package com.cibertec.cayetanoherediaapi.services;

import com.cibertec.cayetanoherediaapi.dao.MedicoRepository;
import com.cibertec.cayetanoherediaapi.entity.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MedicoServices {
	@Autowired
	private MedicoRepository mr;
	
	
	public Medico adicionar(Medico m) {
		return mr.save(m);
	}
	
	public Medico modificar(Medico m)  {
		return  mr.save(m);
	}
	
	public void eliminar(String cod) {
		 mr.deleteById(cod);
	}
	
	public Medico buscarPorID(String cod) {
		return mr.findById(cod).orElse(null);
	}
	
	public List<Medico> ListarTodo(){
		return mr.findAll();
	}
	
	public int ultimoCodigo() {
		return mr.ultimpCodigo();
	}
	
	public List<Medico> listarMedicoPorEspecialidad(int espe){
		return mr.listarMedicoPorEspecialidad(espe);
	}
}
