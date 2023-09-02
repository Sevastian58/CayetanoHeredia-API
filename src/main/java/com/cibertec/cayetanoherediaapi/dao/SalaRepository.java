package com.cibertec.cayetanoherediaapi.dao;

import com.cibertec.cayetanoherediaapi.entity.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SalaRepository extends JpaRepository<Sala, String>{

	@Query(value="{ call listarSalaEspecialidad(?1) }", nativeQuery=true)
	public List<Sala> listarSalaEspecialidad(int codEspecialidad);
}
