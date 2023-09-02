package com.cibertec.cayetanoherediaapi.services;

import com.cibertec.cayetanoherediaapi.dao.ProveedorRepository;
import com.cibertec.cayetanoherediaapi.entity.Proveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ProveedorServices {
	@Autowired
	private ProveedorRepository r;
	
	public List<Proveedor> listarTodos(){
		return r.findAll();
	}
	
	
	
}
