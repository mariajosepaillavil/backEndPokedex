package com.generation.intentobackendpokedex.services;


import com.generation.intentobackendpokedex.model.TrainerPokemon;
import com.generation.intentobackendpokedex.repository.TrainerPokemonRepository;

import javax.transaction.Transactional;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
@Transactional


public class TrainerPokemonService {

private TrainerPokemonRepository trainerPokemonRepository; //para sobreescribir el código y evitar errores al ingresar consultas en POSTMAN

public TrainerPokemonService(TrainerPokemonRepository trainerPokemonRepository) {
    this.trainerPokemonRepository = trainerPokemonRepository;
}

public void saveTrainerPokemon(TrainerPokemon trainerPokemones){
    this.trainerPokemonRepository.save(trainerPokemones);

     
 }

 public void updateTrainerPokemon (TrainerPokemon trainerPokemones){
     this.trainerPokemonRepository.save(trainerPokemones);

 }

 public List <TrainerPokemon> findAll(){
     return trainerPokemonRepository.findAll();


 }

 public List <TrainerPokemon> trainerPokemonConM (){
     return trainerPokemonRepository.findTrainerPokemonWithM();

 }
 
 public List <TrainerPokemon> trainerPokemonPorId(Integer id){
     return trainerPokemonRepository.findTrainerPokemonById(id);

 }

 public void deleteTrainerPokemon(Integer id) {
     trainerPokemonRepository.deleteById(id);

 }

}




    
    
