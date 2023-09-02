package com.cibertec.cayetanoherediaapi.dao;

import com.cibertec.cayetanoherediaapi.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	//select *from tb_tipo_medicamento where cod_lab=?
		@Query("select tm from Categoria tm where tm.proveedor.codigo=?1")
		public List<Categoria> findAllByProveedor(Integer codpro);

}
