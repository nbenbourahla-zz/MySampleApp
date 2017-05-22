package com.nazim.myapplication.model;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;

class Place {
    private final int id;
    private final int userId;
    @Nullable private final String title;
    @Nullable private final String description;
    private final String locality;
    @SerializedName("administrative_area_level_1")
    private final String administrativeAreaLevel1;
    @SerializedName("administrative_area_level_2")
    private final String administrativeAreaLevel2;
    private final String country;
    private final String countryIso;
    private final String postalCode;
    private final Coordinates coordinates;
    private final String timezone;

    public Place(int id, int userId, String title, String description, String locality, String administrativeAreaLevel1,
        String administrativeAreaLevel2, String country, String countryIso, String postalCode, Coordinates coordinates,
        String timezone) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.locality = locality;
        this.administrativeAreaLevel1 = administrativeAreaLevel1;
        this.administrativeAreaLevel2 = administrativeAreaLevel2;
        this.country = country;
        this.countryIso = countryIso;
        this.postalCode = postalCode;
        this.coordinates = coordinates;
        this.timezone = timezone;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    @Nullable
    public String getTitle() {
        return title;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public String getLocality() {
        return locality;
    }

    public String getAdministrativeAreaLevel1() {
        return administrativeAreaLevel1;
    }

    public String getAdministrativeAreaLevel2() {
        return administrativeAreaLevel2;
    }

    public String getCountry() {
        return country;
    }

    public String getCountryIso() {
        return countryIso;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public String getTimezone() {
        return timezone;
    }
}
