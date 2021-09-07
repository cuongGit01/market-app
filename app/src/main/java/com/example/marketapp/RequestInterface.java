package com.example.marketapp;

import com.example.marketapp.models.ServerRequest;
import com.example.marketapp.models.ServerRespone;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("learn-login-register/")
    Call<ServerRespone> operation (@Body ServerRequest request);
}
