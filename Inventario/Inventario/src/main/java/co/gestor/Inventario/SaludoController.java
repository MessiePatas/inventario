package co.gestor.Inventario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/saludame")
    public String saludar(){
       return "hola Mundo";

    }
}
