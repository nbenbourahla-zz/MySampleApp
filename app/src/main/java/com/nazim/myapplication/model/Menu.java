package com.nazim.myapplication.model;

import java.util.List;

public class Menu {
    private final List<Event> events;
    private final Destination destination;
    private final List<Playlist> playlists;
    private final int total;
    private final int offset;
    private final int size;

    public Menu(List<Event> events, Destination destination, List<Playlist> playlists, int total, int offset,
        int size) {
        this.events = events;
        this.destination = destination;
        this.playlists = playlists;
        this.total = total;
        this.offset = offset;
        this.size = size;
    }

    public List<Event> getEvents() {
        return events;
    }

    public Destination getDestination() {
        return destination;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public int getTotal() {
        return total;
    }

    public int getOffset() {
        return offset;
    }

    public int getSize() {
        return size;
    }
}
