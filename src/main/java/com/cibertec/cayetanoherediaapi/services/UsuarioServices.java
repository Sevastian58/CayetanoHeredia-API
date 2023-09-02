package com.cibertec.cayetanoherediaapi.services;

import com.cibertec.cayetanoherediaapi.dao.UsuarioRepository;
import com.cibertec.cayetanoherediaapi.entity.Enlace;
import com.cibertec.cayetanoherediaapi.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class UsuarioServices {
	@Autowired
	private UsuarioRepository repo;

	public Usuario validarUsuario(String vLogin) {
		return repo.iniciarSesion(vLogin);
	}
	public List<Enlace> enlacesDelUsuario(int codRol){
		return repo.traerEnlacesDelUsuario(codRol);
	}
	
}





