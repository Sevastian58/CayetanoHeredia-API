package com.cibertec.cayetanoherediaapi.services;

import com.cibertec.cayetanoherediaapi.dao.CategoriaRepository;
import com.cibertec.cayetanoherediaapi.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;




@Service
public class CategoriaServices {
	@Autowired
	private CategoriaRepository n;
	
	public List<Categoria> listarTodos(){
		return n.findAll();
	}
	public List<Categoria> listaPorProveedor(Integer codpro){
		return n.findAllByProveedor(codpro);
	}
}
