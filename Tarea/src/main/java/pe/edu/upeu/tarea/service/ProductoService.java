package pe.edu.upeu.tarea.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.tarea.entity.Producto;
import pe.edu.upeu.tarea.repository.ProductoRepository;

@Service
public class ProductoService {
	@Autowired
	ProductoRepository prodrep;
	public List<Producto> readall(){
		List<Producto> listprod = new ArrayList<>();
		prodrep.findAll().forEach(listprod::add);
		return listprod;
	}
	public Producto create(Producto prod) {
		return prodrep.save(prod);
	}
	public Producto update(Producto prod) {
		return prodrep.save(prod);
	}
	public Producto read(Long id) {
		return prodrep.findById(id).get();
	}
	public void delete(Long id) {
		prodrep.deleteById(id);
	}

}
