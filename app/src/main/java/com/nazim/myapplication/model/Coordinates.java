package com.nazim.myapplication.model;

class Coordinates {
    private final float latitude;
    private final float longitude;
    private final int zoom;
    private final int radius;

    public Coordinates(float latitude, float longitude, int zoom, int radius) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.zoom = zoom;
        this.radius = radius;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public int getZoom() {
        return zoom;
    }

    public int getRadius() {
        return radius;
    }
}
