package com.nazim.myapplication.api;

import com.nazim.myapplication.model.Menu;
import retrofit2.http.GET;
import rx.Observable;

public interface MenuService {

    @GET("events.json")
    Observable<Menu> getMenus();
}
