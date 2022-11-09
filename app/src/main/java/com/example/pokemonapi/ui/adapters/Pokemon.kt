package com.example.pokemonapi.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.pokeapi.databinding.ItemPokemonListBinding.inflate
import com.example.pokemonapi.base.BaseDiffUtilItemCallback
import com.example.pokemonapi.models.PokemonModel

class PokemonAdapter :
    ListAdapter<PokemonModel, PokemonAdapter.PokemonViewHolder>(BaseDiffUtilItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder =
        PokemonViewHolder(
            ItemPokemonListBinding.,inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    class ItemPokemonListBinding {

    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    class PokemonViewHolder(private val binding: ItemPokemonListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: PokemonModel) {
            binding.nameTv.text = model.name
        }

    }
}