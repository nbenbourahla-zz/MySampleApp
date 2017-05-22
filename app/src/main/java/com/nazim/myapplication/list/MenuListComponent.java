package com.nazim.myapplication.list;

import com.nazim.myapplication.api.ApiModule;
import com.nazim.myapplication.common.AppModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = { ApiModule.class, AppModule.class}) public interface MenuListComponent {
    void inject(MenuListActivity main);
}

