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

import com.generation.intentobackendpokedex.model.TrainerPokemon;
import com.generation.intentobackendpokedex.services.TrainerPokemonService;

//Se debe especificar que es una clase de tipo controlador
@Controller

//Se debe especificar el origen de las peticiones
//en este caso pueden venir de cualquier lado

@CrossOrigin("*")
@RestController // vuelve a confirmar que es una clase de equipo controlador --> lo requiere JAVA 

public class TrainerPokemonController {

    private TrainerPokemonService trainerPokemonService;

    public TrainerPokemonController(@Autowired TrainerPokemonService trainerPokemonService){
        this.trainerPokemonService= trainerPokemonService;

    }

    //post,get,delete,put

    //post --> ingresar datos a la base

    @PostMapping("/trainerPokemon/save")
    public void guardarTrainerPokemon(@RequestBody TrainerPokemon trainerPokemones){
        trainerPokemonService.saveTrainerPokemon(trainerPokemones);

    }

    //put --> editar datos en la base
    @PutMapping("/trainerPokemon/upddate")
    public void editarTrainerPokemon(@RequestBody TrainerPokemon trainerPokemones){
        trainerPokemonService.updateTrainerPokemon(trainerPokemones);

    }

    //delete --> eliminar datos en la base

    @DeleteMapping("/trainerPokemon/delete/{id}")
    public void eliminarTrainerPokemon(@PathVariable Integer id){
        trainerPokemonService.deleteTrainerPokemon(id);
    }

    //get --> nos sirve para obtener datos desde la base de datos

    @GetMapping("/trainerPokemon/FindAll")

    public List <TrainerPokemon> obtenerTrainerPokemon(){
        return trainerPokemonService.findAll();


    }


    @GetMapping("/trainerPokemon/ConM")
    public List <TrainerPokemon> trainerPokemonConM(){
        return trainerPokemonService.trainerPokemonConM();

    }

    @GetMapping("/trainerPokemon/PorId/{id}")
    public List <TrainerPokemon> trainerPokemonPorPokemon( @PathVariable Integer id){
        return trainerPokemonService.trainerPokemonPorId(id);

    }


}


    

