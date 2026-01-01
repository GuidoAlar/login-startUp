package com.example.loginapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.example.loginapp.entity.EstadoUsuario;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id;

    private String nombre;

    private String apellido;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String telefono;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

    @Enumerated(EnumType.STRING)
    @Column(
        columnDefinition = "estado_usuario",
        insertable = false,
        updatable = false
    )
    private EstadoUsuario estado;




    @Column(name = "moneda_preferida")
    private String monedaPreferida;

    // 🔹 Constructor vacío (OBLIGATORIO para JPA)
    public Usuario() {
    }

    // 🔹 Getters y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public String getTelefono() {
        return telefono;
    }
 
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
 
    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }
 
    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public EstadoUsuario getEstado() {
        return estado;
    }
    
    public void setEstado(EstadoUsuario estado) {
        this.estado = estado;
    }
 
    public String getMonedaPreferida() {
        return monedaPreferida;
    }
 
    public void setMonedaPreferida(String monedaPreferida) {
        this.monedaPreferida = monedaPreferida;
    }
}
