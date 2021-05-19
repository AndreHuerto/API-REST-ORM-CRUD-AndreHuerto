package pe.edu.upeu.tarea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import pe.edu.upeu.tarea.entity.Producto;
import pe.edu.upeu.tarea.service.ProductoService;

@RestController
public class ProductoController {
	@Autowired
	ProductoService proser;
	@GetMapping("/produc")
	public List<Producto> readall(){
		
		return proser.readall();
	}
	@PostMapping("/add")
	public Producto save(@RequestBody Producto prod) {
	    return proser.create(prod);
	}
	@GetMapping("/produc/{id}")
	public Producto read(@PathVariable Long id){
	    return proser.read(id);
	}
	@DeleteMapping("/produc/delete/{id}")
	public String delete(@PathVariable Long id) {
	    proser.delete(id);
	    return "Eliminado";
	}
	
	
	@PutMapping("/produc/update/{id}")
	public Producto update(@PathVariable Long id,@RequestBody Producto prod) {
	    Producto p = proser.read(id);
	    p.setNombre(prod.getNombre());
	    p.setPrecio(prod.getPrecio());
	    p.setStock(prod.getStock());
	    return proser.update(p);
	}
}
