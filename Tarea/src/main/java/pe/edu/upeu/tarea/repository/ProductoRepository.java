package pe.edu.upeu.tarea.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.tarea.entity.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{

}
