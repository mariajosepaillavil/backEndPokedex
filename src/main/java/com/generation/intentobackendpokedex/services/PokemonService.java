package com.generation.intentobackendpokedex.services;


import com.generation.intentobackendpokedex.model.Pokemon;
import com.generation.intentobackendpokedex.repository.PokemonRepository;

import javax.transaction.Transactional;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
@Transactional


public class PokemonService {

private PokemonRepository pokemonRepository; //para sobreescribir el código y evitar errores al ingresar consultas en POSTMAN

public PokemonService(PokemonRepository pokemonRepository) {
    this.pokemonRepository = pokemonRepository;
}

public void savePokemon(Pokemon pokemones){
    this.pokemonRepository.save(pokemones);

     
 }

 public void updatePokemon (Pokemon pokemones){
     this.pokemonRepository.save(pokemones);

 }

 public List <Pokemon> findAll(){
     return pokemonRepository.findAll();


 }

 public List <Pokemon> pokemonConPika (){
     return pokemonRepository.findPokemonWithPika();

 }
 
 public List <Pokemon> pokemonPorId(Integer id){
     return pokemonRepository.findPokemonById(id);

 }

 public void deletePokemon(Integer id) {
     pokemonRepository.deleteById(id);

 }

}




    
    
