package com.nazim.myapplication.api;

import com.google.gson.Gson;
import com.nazim.myapplication.repository.MenuRepository;
import dagger.Component;
import javax.inject.Singleton;
import retrofit2.Retrofit;

@Singleton @Component(modules = ApiModule.class) interface ApiComponent {
    Gson provideGson();

    Retrofit provideRetrofit();

    MenuService provideService();

    MenuRepository provideRepository();
}
