package com.explore.javamvp.feature.Main;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.explore.javamvp.R;
import com.explore.javamvp.adapter.PokemonAdapter;
import com.explore.javamvp.base.BaseActivity;
import com.explore.javamvp.feature.Detail.DetailActivity;
import com.explore.javamvp.model.list.PokemonList;
import com.explore.javamvp.model.list.Results;

import java.util.ArrayList;

public class MainActivity extends BaseActivity implements MainView {
    private MainPresenter presenter;
    private int page = 0;
    private final int limit = 10;
    private RecyclerView rvList;
    PokemonAdapter pokemonAdapter = null;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void bindLayoutActivity() {
        page = 1;
        presenter = new MainPresenter(this, retrofit);
        pokemonAdapter = new PokemonAdapter(this);
        rvList = findViewById(R.id.rvListPokemon);
        rvList.setLayoutManager(new LinearLayoutManager(this));
        rvList.setAdapter(pokemonAdapter);
        presenter.showPokemon(page, limit);
        pokemonAdapter.setListener(new PokemonAdapter.PokemonAdapterListener() {
            @Override
            public void onClick(Results pokemon) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("ID", pokemon.getUrl());
                startActivity(intent);
            }
        });
    }

    @Override
    public void showPokemon(PokemonList list) {
        ArrayList<Results> results = new ArrayList<>();
        for (Results rst : list.getResults()) {
            results.add(rst);
        }
        pokemonAdapter.addItem(results);
    }

    @Override
    public void showError(String message) {
        showToast(message);
    }


}
