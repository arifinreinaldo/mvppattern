package com.explore.javamvp.feature.Main;

import android.util.Log;

import com.explore.javamvp.api.PokemonApi;
import com.explore.javamvp.model.detail.Pokemon;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainPresenter {
    private MainView listener;
    private PokemonApi pokemonApi;

    MainPresenter(MainView listener, Retrofit retrofit) {
        this.listener = listener;
        pokemonApi = retrofit.create(PokemonApi.class);
    }

    public void showPokemon(int page, int limit) {
        Call<Pokemon> call = pokemonApi.getPokemon("1");
        call.enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                listener.showError("SUKSES");
            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {
                Log.d("POKS", t.getMessage());
                listener.showError(t.getMessage());

            }
        });

//        Map<String, String> map = new HashMap<>();
////        map.put("offset", String.valueOf((page - 1) * limit));
////        map.put("limit", String.valueOf(limit));
//        Call<PokemonList> call = pokemonApi.getListPokemon(map);
//        call.enqueue(new Callback<PokemonList>() {
//            @Override
//            public void onResponse(Call<PokemonList> call, Response<PokemonList> response) {
//                if (response != null) {
//                    listener.showPokemon(response.body());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<PokemonList> call, Throwable t) {
//                Log.e("FAIL", t.getMessage());
//            }
//        });
    }
}
