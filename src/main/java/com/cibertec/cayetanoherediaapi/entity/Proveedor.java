package com.cibertec.cayetanoherediaapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="proveedor")
public class Proveedor{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CODProveedor")
	private Integer codigo;
	@Column(name="Descripcion")
	private String descripcion;
	
	@OneToMany(mappedBy = "proveedor")
	@JsonIgnore
	private List<Categoria> ListaCategoria;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Categoria> getListaCategoria() {
		return ListaCategoria;
	}

	public void setListaCategoria(List<Categoria> listaCategoria) {
		ListaCategoria = listaCategoria;
	}
	
	
	

}



