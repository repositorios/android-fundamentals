package org.pacote.android.apps.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.mercadobitcoin.net/api/BTC/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderService service = retrofit.create(JsonPlaceHolderService.class);

        Call<Cotacoes> call = service.getPosts();
        call.enqueue(new Callback<Cotacoes>() {
            @Override
            public void onResponse(Call<Cotacoes> call, Response<Cotacoes> response) {

                Cotacoes posts = response.body();
                int a =2;
            }

            @Override
            public void onFailure(Call<Cotacoes> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
