package com.nazim.myapplication.repository;

import com.nazim.myapplication.api.MenuService;
import com.nazim.myapplication.model.Menu;
import rx.Observable;

public class MenuRepository {

    private final MenuService menuService;

    public MenuRepository(MenuService menuService) {
        this.menuService = menuService;
    }

    public Observable<Menu> getMenus() {
        return menuService.getMenus();
    }
}
