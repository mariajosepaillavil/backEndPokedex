package com.generation.intentobackendpokedex.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="pokemones")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer pokemon_id;

    private String nombre_pokemon;
    private String descripcion;
    
    private String num_pokemon;

    public Pokemon() {
    }

    public Pokemon(Integer pokemon_id, String nombre_pokemon, String descripcion, String num_pokemon) {
        this.pokemon_id = pokemon_id;
        this.nombre_pokemon = nombre_pokemon;
        this.descripcion = descripcion;
        this.num_pokemon = num_pokemon;
    }

    public Integer getPokemon_id() {
        return pokemon_id;
    }

    public void setPokemon_id(Integer pokemon_id) {
        this.pokemon_id = pokemon_id;
    }

    public String getNombre_pokemon() {
        return nombre_pokemon;
    }

    public void setNombre_pokemon(String nombre_pokemon) {
        this.nombre_pokemon = nombre_pokemon;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNum_pokemon() {
        return num_pokemon;
    }

    public void setNum_pokemon(String num_pokemon) {
        this.num_pokemon = num_pokemon;
    }

    @Override
    public String toString() {
        return "Pokemon [pokemon_id=" + pokemon_id + ", nombre_pokemon=" + nombre_pokemon + ", descripcion="
                + descripcion + ", num_pokemon=" + num_pokemon + "]";
    }


}
   