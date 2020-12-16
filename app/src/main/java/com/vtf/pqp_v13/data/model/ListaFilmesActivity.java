package com.vtf.pqp_v13.data.model;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.vtf.pqp_v13.Filme;
import com.vtf.pqp_v13.R;
import com.vtf.pqp_v13.data.model.mapper.FilmeMapper;
import com.vtf.pqp_v13.data.model.network.ApiService;
import com.vtf.pqp_v13.data.model.network.response.FilmesResult;
import com.vtf.pqp_v13.ui.ListaFilmesAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//import android.widget.Toolbar;

public class ListaFilmesActivity extends AppCompatActivity {

    private RecyclerView recyclerFilmes;
    private ListaFilmesAdapter filmesAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_filme);

        configuraToolbar();
        configuraAdapter();
        obtemFilmes();


    }
    private void configuraToolbar(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void configuraAdapter(){
        recyclerFilmes = findViewById(R.id.recycler_filmes);

        filmesAdapter = new ListaFilmesAdapter();

        RecyclerView.LayoutManager gridLayoutMagager = new GridLayoutManager(this, 2);
        recyclerFilmes.setLayoutManager(gridLayoutMagager);
        recyclerFilmes.setAdapter(filmesAdapter);
    }

    private void obtemFilmes(){
        ApiService.getInstance()
                .obterFilmesPopulares("8b8314174e657d90d37f97ccd331f874")
                .enqueue(new Callback<FilmesResult>() {
                    @Override
                    public void onResponse(Call<FilmesResult> call, Response<FilmesResult> response) {
                        if (response.isSuccessful()) {
                            final List<Filme> listaFilmes = FilmeMapper
                                    .deResponseParaDominio(response.body().getResultadoFilmes());
                            filmesAdapter.setFilmes(listaFilmes);
                        } else {
                            mostraErro();
                        }
                    }

                    @Override
                    public void onFailure(Call<FilmesResult> call, Throwable t) {


                    }
                });

    }
    private void mostraErro(){
        Toast.makeText(this, "Erro ao obter a lista", Toast.LENGTH_SHORT).show();
    }
}

