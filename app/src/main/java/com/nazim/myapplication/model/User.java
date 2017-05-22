package com.nazim.myapplication.model;

import android.support.annotation.Nullable;

public class User {
    private final int id;
    private final String civility;
    private final String firstname;
    @Nullable private final String descriptionTitle;
    private final String description;
    private final String age;
    private final Rating rating;
    private final Cover avatar;

    public User(int id, String civility, String firstName, String descriptionTitle, String description, String age,
        Rating rating, Cover avatar) {
        this.id = id;
        this.civility = civility;
        this.firstname = firstName;
        this.descriptionTitle = descriptionTitle;
        this.description = description;
        this.age = age;
        this.rating = rating;
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public String getCivility() {
        return civility;
    }

    public String getFirstname() {
        return firstname;
    }

    @Nullable
    public String getDescriptionTitle() {
        return descriptionTitle;
    }

    public String getDescription() {
        return description;
    }

    public String getAge() {
        return age;
    }

    public Rating getRating() {
        return rating;
    }

    public Cover getAvatar() {
        return avatar;
    }
}
