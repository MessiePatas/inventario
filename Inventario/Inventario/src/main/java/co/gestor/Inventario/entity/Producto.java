package co.gestor.Inventario.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto {
    @Id

    private Long id;

    private String nombre;
    private String descripcion;

    public Producto(String nombre, String descripcion, Long id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
