package co.gestor.Inventario.controller;
import co.gestor.Inventario.controller.DTO.RespuestaDTO;
import co.gestor.Inventario.controller.DTO.ProductoDTO;
import co.gestor.Inventario.logica.ProductoLogica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductoController {

    @Autowired
    private ProductoLogica productoLogica;

    public ProductoController(ProductoLogica productoLogica) {
        this.productoLogica = productoLogica;
    }

    @PostMapping("/producto/agregar")
    public RespuestaDTO guardarProducto(@RequestBody ProductoDTO productoDTO) {
            productoLogica.guardarProducto(productoDTO);
            return new RespuestaDTO("Producto guardado");
    }
}
