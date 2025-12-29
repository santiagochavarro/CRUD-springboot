package com.registro2.CRUD.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Dice que esta clase es una tabla en la base de datos
public class persona {
    @Id // Define la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // El ID se genera automáticamente 
    private Long id;    
    private String nombre;
    private String apellido;
    private String email;
    
    // Métodos Getters y Setters son leer y cambiar el ID de una persona
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; 
    }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; 
    }
    
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; 
    }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; 
    }
}