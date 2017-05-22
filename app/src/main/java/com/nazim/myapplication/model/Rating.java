package com.nazim.myapplication.model;

public class Rating {
    private final float score;
    private final int count;

    public Rating(float score, int count) {
        this.score = score;
        this.count = count;
    }

    public float getScore() {
        return score;
    }

    public int getCount() {
        return count;
    }
}
