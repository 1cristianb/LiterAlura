package com.alura.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AutorDTO(
        @JsonAlias("name") String author_name,
        @JsonAlias("birth_year") Integer birth_year,
        @JsonAlias("death_year") Integer death_year) {

}