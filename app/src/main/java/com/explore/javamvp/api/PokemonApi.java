package com.explore.javamvp.api;

import com.explore.javamvp.model.detail.Pokemon;
import com.explore.javamvp.model.list.PokemonList;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;


public interface PokemonApi {
    @GET("pokemon/{id}")
    Call<Pokemon> getPokemon(@Path("id") String id);

    @GET("pokemon/")
    Call<PokemonList> getListPokemon(@QueryMap Map<String, String> options);
}
