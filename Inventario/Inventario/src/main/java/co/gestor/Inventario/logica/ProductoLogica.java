package co.gestor.Inventario.logica;
import co.gestor.Inventario.controller.DTO.ProductoDTO;
import co.gestor.Inventario.persistencia.Producto;
import co.gestor.Inventario.persistencia.ProductoRepository;

import org.springframework.stereotype.Service;

@Service
public class ProductoLogica {

   private ProductoRepository productoRepository;

    public ProductoLogica() {
    }

    public ProductoLogica(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public void guardarProducto(ProductoDTO productoDTO){
        if ("papel".equals(productoDTO.getNombre())){
            throw new IllegalArgumentException("Esto no es una papeleria");
        }
Producto productoBD= new Producto();
        productoBD.setId(productoDTO.getId());
        productoBD.setNombre(productoDTO.getNombre());
        productoRepository.save(productoBD);
    }
}