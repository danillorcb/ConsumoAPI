package br.com.danillorcb.consumoapi.api

import br.com.danillorcb.consumoapi.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonAPI {

    @GET("/api/v2/pokemon/{number}")
    fun search(@Path("number") number: String): Call<Pokemon>
}