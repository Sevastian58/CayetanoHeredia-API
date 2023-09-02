package com.cibertec.cayetanoherediaapi.dao;

import com.cibertec.cayetanoherediaapi.entity.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<Medicamento, String> {

}
