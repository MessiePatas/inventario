package co.gestor.Inventario.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.gestor.Inventario.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
