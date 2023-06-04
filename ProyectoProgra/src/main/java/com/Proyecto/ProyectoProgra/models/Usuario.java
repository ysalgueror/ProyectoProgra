package com.Proyecto.ProyectoProgra.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Usuarios")
@ToString @EqualsAndHashCode
public class Usuario {

    @Id
    @Getter @Setter @Column(name = "ID")
    private long id;

    @Getter @Setter @Column(name = "NOMBRE")
    private String nombre;

    @Getter @Setter @Column(name = "APELLIDO")
    private String apellido;

    @Getter @Setter @Column(name = "EMAIL")
    private String email;

    @Getter @Setter @Column(name = "TELEFONO")
    private String telefono;

    @Getter @Setter @Column(name = "PASSWORD")
    private String password;





    }
