package com.example.pokemonapi.ui.fragments

import com.example.pokemonapi.base.BaseViewModel
import com.example.pokemonapi.data.repositories.Pokemon
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ListViewModel @Inject constructor(private val repository: Pokemon) :
    BaseViewModel() {

    fun fetchPokemonName() = repository.fetchPokemonName()
}