package co.gestor.Inventario.controller;

import co.gestor.Inventario.entity.Producto;
import co.gestor.Inventario.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @PostMapping("/guardar")
    public String guardarProducto(@RequestBody Producto producto) {
        return productoService.saveProduct(producto);
    }
}
