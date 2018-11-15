package br.com.danillorcb.consumoapi

import android.content.Context
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.danillorcb.consumoapi.model.Pokemon
import kotlinx.android.synthetic.main.activity_search.view.*
import java.security.AccessControlContext
import java.util.*

class ListAdapter(
        val pokemons: List<Pokemon>,
        val context: Context,
        val listener: (Pokemon) -> Unit) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context)
                .inflate(R.layout.pokemon_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return pokemons.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pokemon = pokemons[position]
        holder?.let {
            it.bindView(pokemon, listener)
        }
    }

    class ViewHolder (itemView: View):
            RecyclerView.ViewHolder(itemView) {

        fun bindView(pokemon: Pokemon,
                     listener: (Pokemon) -> Unit) = with(itemView) {

            itemView.tvPokemon.text = pokemon.name
            setOnClickListener { listener(pokemon) }
        }
    }
}