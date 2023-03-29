package com.generation.intentobackendpokedex.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="trainerPokemones")
public class TrainerPokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer trainer_pokemon_id;
    private String nombre_trainer_pokemon;
    private String email;
    private String fono_contacto;
    private String direccion;
    
    public TrainerPokemon() {
    }

    public TrainerPokemon(Integer trainer_pokemon_id, String nombre_trainer_pokemon, String email, String fono_contacto,
            String direccion) {
        this.trainer_pokemon_id = trainer_pokemon_id;
        this.nombre_trainer_pokemon = nombre_trainer_pokemon;
        this.email = email;
        this.fono_contacto = fono_contacto;
        this.direccion = direccion;
    }

    public Integer getTrainer_pokemon_id() {
        return trainer_pokemon_id;
    }

    public void setTrainer_pokemon_id(Integer trainer_pokemon_id) {
        this.trainer_pokemon_id = trainer_pokemon_id;
    }

    public String getNombre_trainer_pokemon() {
        return nombre_trainer_pokemon;
    }

    public void setNombre_trainer_pokemon(String nombre_trainer_pokemon) {
        this.nombre_trainer_pokemon = nombre_trainer_pokemon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFono_contacto() {
        return fono_contacto;
    }

    public void setFono_contacto(String fono_contacto) {
        this.fono_contacto = fono_contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "TrainerPokemon [trainer_pokemon_id=" + trainer_pokemon_id + ", nombre_trainer_pokemon="
                + nombre_trainer_pokemon + ", email=" + email + ", fono_contacto=" + fono_contacto + ", direccion="
                + direccion + "]";
    }

}
    