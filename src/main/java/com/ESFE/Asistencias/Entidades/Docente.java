package com.ESFE.Asistencias.Entidades;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "docente")
public class Docente {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    private Integer Id;
    @NotBlank(message = "Ingrese el nombre del docente")
    private String nombre;
    private String apellido;
    private String escuela;
    private String email;
    private String telefono;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public @NotBlank(message = "Ingrese el nombre del docente") String getNombre() {
        return nombre;
    }

    public void setNombre(@NotBlank(message = "Ingrese el nombre del docente") String nombre) {
        this.nombre = nombre;
    }

    public @NotBlank(message = "Ingrese el apellido del docente") String getApellido() {
        return apellido;
    }

    public void setApellido(@NotBlank(message = "Ingrese el apellido del docente") String apellido) {
        this.apellido = apellido;
    }
    public @NotBlank(message = "Ingrese la escuela donde trabaja el docente") String getEscuela() {
        return escuela;
    }

    public void setEscuela(@NotBlank(message = "Ingrese la escuela donde trabaja el docente") String escuela) {
        this.escuela = escuela;
    }
    public @NotBlank(message = "Ingrese el email deel docente") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Ingrese el email del docente") String email) {
        this.email = email;
    }
    public @NotBlank(message = "Ingrese el telefono del docente") String getTelefono() {
        return telefono;
    }

    public void setTelefono(@NotBlank(message = "Ingrese el telefono del docente") String telefono) {
        this.telefono = telefono;
    }
}
