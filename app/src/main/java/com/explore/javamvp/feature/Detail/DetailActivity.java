package com.explore.javamvp.feature.Detail;

import android.os.Bundle;
import android.widget.TextView;

import com.explore.javamvp.R;
import com.explore.javamvp.base.BaseActivity;
import com.explore.javamvp.model.detail.Pokemon;

public class DetailActivity extends BaseActivity implements DetailListener {
    private DetailPresenter presenter = null;
    private TextView tvPokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvPokemon = findViewById(R.id.tvPokemon);

        String url = getIntent().getStringExtra("ID");
        presenter = new DetailPresenter(this::showDetail, retrofit);
        if (hasValue(url)) {
            presenter.showDetail(url);
        }
    }

    @Override
    public void showDetail(Pokemon pokemon) {
        if (pokemon != null) {
            tvPokemon.setText(pokemon.getName() == null ? "" : pokemon.getName());
        } else {
            showToast("Missing Details");
            finish();
        }
    }
}
