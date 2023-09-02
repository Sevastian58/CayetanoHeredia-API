package com.cibertec.cayetanoherediaapi.dao;

import com.cibertec.cayetanoherediaapi.entity.HistorialClinico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HistorialClinicoRepository  extends JpaRepository<HistorialClinico, Integer>{
	@Query(value="call BUSCAR_HISTORIA_PACIENTE(?1)", nativeQuery=true)
	public HistorialClinico buscarPorPaciente(String codPaciente);
}
