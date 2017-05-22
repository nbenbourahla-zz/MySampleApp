package com.nazim.myapplication.model;

import com.google.gson.annotations.SerializedName;

class Language {
    private final int id;
    private final boolean translated;
    private final boolean activated;
    private final String title;
    private final String iSpeak;
    private final String alpha2;
    @SerializedName("alpha3-b")
    private final String alpha3b;
    @SerializedName("alpha3-t")
    private final String alpha3t;
    private final String locale;

    public Language(int id, boolean translated, boolean activated, String title, String iSpeak, String alpha2,
        String alpha3b, String alpha3t, String locale) {
        this.id = id;
        this.translated = translated;
        this.activated = activated;
        this.title = title;
        this.iSpeak = iSpeak;
        this.alpha2 = alpha2;
        this.alpha3b = alpha3b;
        this.alpha3t = alpha3t;
        this.locale = locale;
    }

    public int getId() {
        return id;
    }

    public boolean isTranslated() {
        return translated;
    }

    public boolean isActivated() {
        return activated;
    }

    public String getTitle() {
        return title;
    }

    public String getiSpeak() {
        return iSpeak;
    }

    public String getAlpha2() {
        return alpha2;
    }

    public String getAlpha3b() {
        return alpha3b;
    }

    public String getAlpha3t() {
        return alpha3t;
    }

    public String getLocale() {
        return locale;
    }
}
