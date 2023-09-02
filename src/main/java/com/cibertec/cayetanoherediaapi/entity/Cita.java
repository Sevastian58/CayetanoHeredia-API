package com.cibertec.cayetanoherediaapi.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="citas")
public class Cita {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codcitas")
	private Integer codigo;
	@Column(name="fechacita")
	private LocalDate fecha;
	@Column(name="horacita")
	private LocalTime hora;
	@Column(name="estadocita")
	private int estado;
	
	@ManyToOne
	@JoinColumn(name="CODPaciente")
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name="CODEspecialidad")
	private Especialidad especialidad;
	
	@ManyToOne
	@JoinColumn(name="numsala")
	private Sala sala;
	
	@ManyToOne
	@JoinColumn(name="CODMedico")
	private Medico medico;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
}
