package com.cibertec.cayetanoherediaapi.controller;

import com.cibertec.cayetanoherediaapi.entity.Enlace;
import com.cibertec.cayetanoherediaapi.entity.Usuario;
import com.cibertec.cayetanoherediaapi.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@SessionAttributes({"datos","enlaces"})
@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioServices servicio;


	@GetMapping ("/validar")
	public String index() {


		return "login";
	}
	
}
