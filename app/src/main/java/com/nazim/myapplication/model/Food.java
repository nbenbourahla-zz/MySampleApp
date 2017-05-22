package com.nazim.myapplication.model;

import android.support.annotation.Nullable;

class Food {
    private final int id;
    private final String title;
    @Nullable private final String description;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public Food(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;


    }
}
