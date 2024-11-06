package com.alura.literalura.model;

import jakarta.persistence.*;

@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer birthDate;
    private Integer deathDate;

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

    public Integer getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Integer birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Integer deathDate) {
        this.deathDate = deathDate;
    }

    @Override
    public String toString() {
        return String.format("""
        ----- AUTOR -----
        Nombre: %s
        Año de nacimiento: %s
        Año de muerte: %s
        ------------"""
                , name, birthDate, deathDate);
    }
}
