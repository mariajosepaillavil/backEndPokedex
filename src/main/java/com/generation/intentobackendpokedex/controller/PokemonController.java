package com.generation.intentobackendpokedex.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.generation.intentobackendpokedex.model.Pokemon;
import com.generation.intentobackendpokedex.services.PokemonService;

//Se debe especificar que es una clase de tipo controlador
@Controller

//Se debe especificar el origen de las peticiones
//en este caso pueden venir de cualquier lado

@CrossOrigin("*")
@RestController // vuelve a confirmar que es una clase de equipo controlador --> lo requiere JAVA 

public class PokemonController {

    private PokemonService pokemonService;

    public PokemonController(@Autowired PokemonService pokemonService){
        this.pokemonService= pokemonService;

    }

    //post,get,delete,put

    //post --> ingresar datos a la base

    @PostMapping("/pokemon/save")
    public void guardarPokemon(@RequestBody Pokemon pokemones){
        pokemonService.savePokemon(pokemones);

    }

    //put --> editar datos en la base
    @PutMapping("/pokemon/upddate")
    public void editarPokemon(@RequestBody Pokemon pokemones){
        pokemonService.updatePokemon(pokemones);

    }

    //delete --> eliminar datos en la base

    @DeleteMapping("/pokemon/delete/{id}")
    public void eliminarPokemon(@PathVariable Integer id){
        pokemonService.deletePokemon(id);
    }

    //get --> nos sirve para obtener datos desde la base de datos

    @GetMapping("/pokemon/FindAll")

    public List <Pokemon> obtenerPokemon(){
        return pokemonService.findAll();


    }


    @GetMapping("/pokemon/ConPika")
    public List <Pokemon> pokemonConPika(){
        return pokemonService.pokemonConPika();

    }

    @GetMapping("/pokemon/PorId/{id}")
    public List <Pokemon> pokemonPorId( @PathVariable Integer id){
        return pokemonService.pokemonPorId(id);

    }


}


    

