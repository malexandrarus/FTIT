package com.ftit.thirdassignment.animalrescuer;

public class Lion extends Animal {

    private String maneColor;

    public void hunting() {
        System.out.println("Runnnnnnn!!!");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleep behaviour");
    }

    @Override
    public void eat() {
        System.out.println("Lion eat behaviour");
    }

    @Override
    public void play() {
        System.out.println("Lion play behaviour");
    }

    public String getManeColor() {
        return maneColor;
    }

    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }
}
