package co.gestor.Inventario.modelo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Producto")
public class Producto {

    @Id

    @Column
    private int id;
    @Column
    private String nombre;


}

