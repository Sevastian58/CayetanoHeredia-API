package com.cibertec.cayetanoherediaapi.services;

import com.cibertec.cayetanoherediaapi.dao.HistorialClinicoRepository;
import com.cibertec.cayetanoherediaapi.entity.HistorialClinico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistorialClinicoServices {
	@Autowired
	private HistorialClinicoRepository hr;
	
	public HistorialClinico registrar(HistorialClinico h) {
		return	hr.save(h);
	}
	public HistorialClinico actualizar(HistorialClinico h)
	{
		return hr.save(h);
	}
	public void eliminarPorID(Integer cod) {
		hr.deleteById(cod);
	}
	public HistorialClinico buscarPorID(Integer cod) {
		return hr.findById(cod).orElse(null);
	}
	public List<HistorialClinico> listarHistorialClinico(){
		return hr.findAll();
	}
	public HistorialClinico buscarPorPaciente(String codPaciente) {
		return hr.buscarPorPaciente(codPaciente);
	}

}
