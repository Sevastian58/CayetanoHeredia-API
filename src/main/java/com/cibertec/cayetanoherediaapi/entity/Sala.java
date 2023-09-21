package com.cibertec.cayetanoherediaapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="sala")
public class Sala {
	@Id
	@Column(name="numsala")
	private String codigo;
	@Column(name="estadosala")
	private String estado;

	@OneToOne
	@JoinColumn(name="codespecialidad")
	private Especialidad espeSala;
	
	@OneToMany(mappedBy="sala")
	@JsonIgnore
	private List<Cita> listaSalasCita;

	
	public Sala() {
		
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Especialidad getEspeSala() {
		return espeSala;
	}
	public void setEspeSala(Especialidad espeSala) {
		this.espeSala = espeSala;
	}


	public List<Cita> getListaSalasCita() {
		return listaSalasCita;
	}

	public void setListaSalasCita(List<Cita> listaSalasCita) {
		this.listaSalasCita = listaSalasCita;
	}

}
