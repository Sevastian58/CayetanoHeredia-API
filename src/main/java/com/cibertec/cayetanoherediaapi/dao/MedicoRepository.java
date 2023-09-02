package com.cibertec.cayetanoherediaapi.dao;

import com.cibertec.cayetanoherediaapi.entity.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface MedicoRepository extends JpaRepository<Medico, String> {
	@Query(value="{ call UltimoCodigoMedico() }", nativeQuery=true)
	public int ultimpCodigo();
	
	@Query(value="{ call ListarMedicoPorEspecialidad(?1) }", nativeQuery=true)
	public List<Medico> listarMedicoPorEspecialidad(Integer codEspecialidad);
}
