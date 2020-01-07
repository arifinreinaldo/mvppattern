package com.explore.javamvp.feature.Main;

import com.explore.javamvp.model.list.PokemonList;

public interface MainView {
    void showPokemon(PokemonList list);

    void showError(String message);
}
