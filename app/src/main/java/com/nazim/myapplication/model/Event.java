package com.nazim.myapplication.model;

import java.util.List;

public class Event {
    private final int id;
    private final String title;
    private final int minSeats;
    private final int maxSeats;
    private final String type;
    private final String localizedType;
    private final String beginsAt;
    private final String endsAt;
    private final Cover cover;
    private final User user;
    private final Place place;
    private final List<Language> languages;
    private final float price;
    private final Currency currency;

    public Event(int id, String title, int minSeats, int maxSeats, String type, String localizedType, String beginsAt,
        String endsAt, Cover cover, User user, Place place, List<Language> languages, float price, Currency currency) {
        this.id = id;
        this.title = title;
        this.minSeats = minSeats;
        this.maxSeats = maxSeats;
        this.type = type;
        this.localizedType = localizedType;
        this.beginsAt = beginsAt;
        this.endsAt = endsAt;
        this.cover = cover;
        this.user = user;
        this.place = place;
        this.languages = languages;
        this.price = price;
        this.currency = currency;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getMinSeats() {
        return minSeats;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public String getType() {
        return type;
    }

    public String getLocalizedType() {
        return localizedType;
    }

    public String getBeginsAt() {
        return beginsAt;
    }

    public String getEndsAt() {
        return endsAt;
    }

    public Cover getCover() {
        return cover;
    }

    public User getUser() {
        return user;
    }

    public Place getPlace() {
        return place;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public float getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }
}
