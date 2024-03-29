package com.cibertec.cayetanoherediaapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tb_usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_usu")
	private int codigo;
	private String login;
	@Column(name = "password")
	private String clave;
	private String nombre;
	private String apellido;
	
	@ManyToOne
	@JoinColumn(name="idrol")
	private Rol rol;
	/*
	@OneToMany(mappedBy = "usuario")
	private List<Boleta> listaBoletas;
		*/
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public Usuario(int codUsuario) {
		codigo=codUsuario;
	}
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/*
	public List<Boleta> getListaBoletas() {
		return listaBoletas;
	}
	public void setListaBoletas(List<Boleta> listaBoletas) {
		this.listaBoletas = listaBoletas;
	}
	*/
	
	
	
}
