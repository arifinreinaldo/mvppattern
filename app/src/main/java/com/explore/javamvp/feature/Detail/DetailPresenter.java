package com.explore.javamvp.feature.Detail;

import com.explore.javamvp.api.PokemonApi;
import com.explore.javamvp.model.detail.Pokemon;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class DetailPresenter {
    private PokemonApi pokemonApi;
    private DetailView listener;

    public DetailPresenter(DetailView listener, Retrofit retrofit) {
        pokemonApi = retrofit.create(PokemonApi.class);
        this.listener = listener;
    }

    public void showDetail(String url) {
        char id = url.charAt(url.length() - 2);
        Call<Pokemon> rst = pokemonApi.getPokemon(String.valueOf(id));
        rst.enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                listener.showDetail(response.body());
            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {

            }
        });
    }
}
