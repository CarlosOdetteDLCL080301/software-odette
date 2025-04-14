package com.odette.softwareodette.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity  // Indica que esta clase se mapea a una tabla de BD
public class Item {

    @Id  // Clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto‑incremental
    private Long id;

    private String name;

    // Constructor vacío requerido por JPA
    public Item() {}

    // Constructor para facilitar creación de instancias
    public Item(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters y setters (acceso a campos)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
