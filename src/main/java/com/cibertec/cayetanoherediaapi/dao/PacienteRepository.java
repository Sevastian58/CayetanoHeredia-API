package com.cibertec.cayetanoherediaapi.dao;

import com.cibertec.cayetanoherediaapi.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PacienteRepository extends JpaRepository<Paciente, String>{
	@Query(value="{ call UltimoCodigoPaciente() }", nativeQuery=true)
	public int ultimoCodigo();
	
	@Query(value="call BuscarPacienteNombreApellido(?1)", nativeQuery=true)
	public List<Paciente> buscarPorNombre(String nombre);
}
