package co.gestor.Inventario.service;

import co.gestor.Inventario.entity.ProductoRepository;
import co.gestor.Inventario.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public String saveProduct(Producto producto) {

        productoRepository.save(producto);

        return "Producto guardado exitosamente: " + producto.getNombre();
    }
}
