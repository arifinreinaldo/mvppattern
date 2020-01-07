package com.explore.javamvp.feature.Main;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.explore.javamvp.R;
import com.explore.javamvp.base.BaseActivity;
import com.explore.javamvp.model.list.PokemonList;

public class MainActivity extends BaseActivity implements MainView {
    private MainPresenter presenter;
    private int page = 0;
    private final int limit = 10;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        page = 1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this, retrofit);
        presenter.showPokemon(page, limit);
    }

    @Override
    public void showPokemon(PokemonList list) {
        showToast(list.getCount());
    }

    @Override
    public void showError(String message) {
        showToast(message);
    }


}
