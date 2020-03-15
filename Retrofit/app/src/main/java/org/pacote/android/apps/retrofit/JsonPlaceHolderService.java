package org.pacote.android.apps.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderService {

    @GET("ticker")
    Call<Cotacoes> getPosts();
}
