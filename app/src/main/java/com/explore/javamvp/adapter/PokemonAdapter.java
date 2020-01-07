package com.explore.javamvp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.explore.javamvp.R;
import com.explore.javamvp.model.list.Results;

import java.util.ArrayList;
import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.ViewHolder> {
    public PokemonAdapterListener listener;
    private Context context;
    private List<Results> list = new ArrayList<>();

    public PokemonAdapter(Context ctx) {
        context = ctx;
    }

    public interface PokemonAdapterListener {
        void onClick(Results pokemon);
    }

    public void clear() {
        list.clear();
        notifyDataSetChanged();
    }

    public void setListener(PokemonAdapterListener listener) {
        this.listener = listener;
    }

    public void addItem(ArrayList<Results> items) {
        list.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.vh_pokemon, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvPokemon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvPokemon = itemView.findViewById(R.id.tvPokemon);
        }

        public void bind(Results rst) {
            tvPokemon.setText(rst.getName());
            tvPokemon.setOnClickListener(it -> {
                listener.onClick(rst);
            });
        }

    }
}
