package com.example.pokemonapi.data.remote.apiservies

import com.example.pokemonapi.models.PokemonModel
import com.example.pokemonapi.models.PokemonResponse
import retrofit2.http.GET


interface PokeApi {

    @GET("pokemon")
    suspend fun fetchPokemonName(): PokemonResponse<PokemonModel>
}