package co.gestor.Inventario;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EntityScan(basePackages = "co.gestor.Inventario.entity.Producto")
class InventarioApplicationTests {

	@Test
	void contextLoads() {
	}

}
