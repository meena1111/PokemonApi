package com.example.pokemonapi.data.repositories

class Pokemon {
    fun fetchPokemonName() = doRequest {
        pokemonapi.fetchPokemonName()
    }
}