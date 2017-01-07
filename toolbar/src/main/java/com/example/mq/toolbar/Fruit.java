package com.example.mq.toolbar;

/**
 * Created by Administrator on 2016/12/22.
 */

public class Fruit {
    private String fruitName;
    private int imageId;

    public Fruit(String fruitName, int imageId) {
        this.fruitName = fruitName;
        this.imageId = imageId;
    }

    public String getName() {
        return fruitName;
    }

    public int getImageId() {
        return imageId;
    }
}
