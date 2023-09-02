package com.cibertec.cayetanoherediaapi.services;

import com.cibertec.cayetanoherediaapi.dao.TopicoRepository;
import com.cibertec.cayetanoherediaapi.entity.Topico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoServices {
	@Autowired
	private TopicoRepository tr;
	
	
	public void registrar(Topico p) {
		tr.save(p);
	}
	public void actualizar(Topico p) {
		tr.save(p);
	}
	public void eliminarPorID(Integer cod) {
		tr.deleteById(cod);
	}
	public Topico buscarPorID(Integer cod) {
		return tr.findById(cod).orElse(null);
	}
	public List<Topico> listarTopico(){
		return tr.findAll();
	}
}
