package com.cibertec.cayetanoherediaapi.controller;


import com.cibertec.cayetanoherediaapi.entity.Categoria;
import com.cibertec.cayetanoherediaapi.entity.Medicamento;
import com.cibertec.cayetanoherediaapi.services.CategoriaServices;
import com.cibertec.cayetanoherediaapi.services.MedicamentoServices;
import com.cibertec.cayetanoherediaapi.services.ProveedorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/medicamento")
public class MedicamentoController {
	
	@Autowired
	private MedicamentoServices serMedicamento;
	@Autowired
	private CategoriaServices serCategoria;
	@Autowired
	private ProveedorServices serProveedor;
	
	@RequestMapping("/lista")
	public String index(Model model) {
		model.addAttribute("listaMedicamentos", serMedicamento.listarTodos());
		model.addAttribute("listarProveedor", serProveedor.listarTodos());
		return "medicamento";
	}
	@RequestMapping("/grabar")	
	public String grabar(@RequestParam("codigo") String cod,
							@RequestParam("descripcion") String desc,
							@RequestParam("categoria") int cate,
							@RequestParam("stock") int sto,							
							@RequestParam("venta") int ven,
							@RequestParam("cantidad") int cant,
							@RequestParam("estado") String est,
							RedirectAttributes redirect) {
		
		try {
			
			Medicamento med=new Medicamento();
			med.setCodigo(cod);
			med.setDescripcion(desc);			
			med.setStock(sto);
			med.setVenta(ven);
			med.setCantidad(cant);
			med.setEstado(est);
			Categoria ct = new Categoria();
			ct.setCodigo(cate);
			med.setCategoria(ct);			
			if(cod==null) {
				
				serMedicamento.registrar(med);
				redirect.addFlashAttribute("MENSAJE","Medicamento registrado");
			}
			else {
			
				med.setCodigo(cod);
				serMedicamento.actualizar(med);
				redirect.addFlashAttribute("MENSAJE","Medicamento actualizado");					
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/medicamento/lista";
	}
	
		//retorna JSON
		@RequestMapping("/buscar")
		@ResponseBody
		public Medicamento buscarPorID(@RequestParam("codigo") String cod) {
			return serMedicamento.buscarPorID(cod);
		}
		
		
		@RequestMapping("/eliminar")
		public String eliminarPorID(@RequestParam("codigo") String cod,RedirectAttributes redirect) {
			
			serMedicamento.eliminarPorID(cod);
			redirect.addFlashAttribute("MENSAJE","Medicamento eliminado");
			return "redirect:/medicamento/lista";
		}
		//ruta para listar todos los Tipos de Medicamentos según el código de laboratorio
		//retorna JSON
		@RequestMapping("/listaPorProveedor")
		@ResponseBody
		public List<Categoria> listaPorProveedor(@RequestParam("codpro") Integer cod){
			return serCategoria.listaPorProveedor(cod);
		}
		
		

}
