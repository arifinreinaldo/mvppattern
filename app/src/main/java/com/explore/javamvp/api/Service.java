package com.explore.javamvp.api;

import com.explore.javamvp.model.detail.Pokemon;
import com.explore.javamvp.model.list.PokemonList;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Service {
    private PokemonApi pokemonApi = null;

    public Service() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://pokeapi.co/api/v2/").addConverterFactory(GsonConverterFactory.create()).build();
        pokemonApi = retrofit.create(PokemonApi.class);
    }

    public String getPokemon(String id) {
        Call<Pokemon> call = pokemonApi.getPokemon("1");
        call.enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {

            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {

            }
        });
        return "";
    }

    public String getListPokemon(int page, int limit) {
        Map<String, String> map = new HashMap<>();
        map.put("offset", String.valueOf((page - 1) * limit));
        map.put("limit", String.valueOf(limit));
        Call<PokemonList> call = pokemonApi.getListPokemon(map);
        call.enqueue(new Callback<PokemonList>() {
            @Override
            public void onResponse(Call<PokemonList> call, Response<PokemonList> response) {
                
            }

            @Override
            public void onFailure(Call<PokemonList> call, Throwable t) {

            }
        });
        return "";
    }
}
