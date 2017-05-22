package com.nazim.myapplication.model;

class Playlist {
    private final int id;
    private final String type;
    private final int order;
    private final String title;
    private final String body;
    private final Cover cover;

    public Playlist(int id, String type, int order, String title, String body, Cover cover) {
        this.id = id;
        this.type = type;
        this.order = order;
        this.title = title;
        this.body = body;
        this.cover = cover;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getOrder() {
        return order;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public Cover getCover() {
        return cover;
    }
}
