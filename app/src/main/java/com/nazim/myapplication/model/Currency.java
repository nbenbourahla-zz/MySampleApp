package com.nazim.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Currency {
    private final int id;
    private final String title;
    @SerializedName("iso_3")
    private final String iso3;
    private final String symbol;

    public Currency(int id, String title, String iso3, String symbol) {
        this.id = id;
        this.title = title;
        this.iso3 = iso3;
        this.symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getIso3() {
        return iso3;
    }

    public String getSymbol() {
        return symbol;
    }
}
