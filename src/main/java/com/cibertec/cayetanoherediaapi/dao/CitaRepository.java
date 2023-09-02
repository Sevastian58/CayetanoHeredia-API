package com.cibertec.cayetanoherediaapi.dao;

import com.cibertec.cayetanoherediaapi.entity.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface CitaRepository extends JpaRepository<Cita, Integer>{
	@Query(value="call listarCitasEspeMedSalaFecha(?1, ?2, ?3, ?4);", nativeQuery=true)
	public List<Cita> listarPorEspeSalaMedFecha(Integer codEspe, String numSala, String codMed, LocalDate fecha);
}
