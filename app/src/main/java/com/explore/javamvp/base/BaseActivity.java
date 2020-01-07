package com.explore.javamvp.base;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public abstract class BaseActivity extends AppCompatActivity {
    protected Context context = null;
    protected static Retrofit retrofit = null;

    protected abstract int getLayoutId();
    protected abstract void bindLayoutActivity();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        setMainSetting();
        bindLayoutActivity();
    }

    private void setMainSetting(){
        context = this;
        if (retrofit == null) {

            retrofit = new Retrofit.Builder().baseUrl("https://pokeapi.co/api/v2/").addConverterFactory(GsonConverterFactory.create()).build();
        }
    }



    protected void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    protected boolean hasValue(String value) {
        value = value == null ? "" : value;
        if (!value.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
