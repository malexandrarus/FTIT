package com.ftit.thirdassignment.animalrescuer;

public class Duck extends Animal {

    private Integer beakSize;
    private Integer maxFlightDistance;
    private String featherColor;

    public void layEggs() {
        System.out.println("Laying eggs behaviour");
    }

    public void fly() {
        System.out.println("Fly baby duck fly!!!!");
    }

    @Override
    public void sleep() {
        System.out.println("Duck sleep behaviour");
    }

    @Override
    public void eat() {
        System.out.println("Duck eat behaviour");
    }

    @Override
    public void play() {
        System.out.println("Duck play behaviour");
    }

    public Integer getBeakSize() {
        return beakSize;
    }

    public void setBeakSize(Integer beakSize) {
        this.beakSize = beakSize;
    }

    public Integer getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public void setMaxFlightDistance(Integer maxFlightDistance) {
        this.maxFlightDistance = maxFlightDistance;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }
}
