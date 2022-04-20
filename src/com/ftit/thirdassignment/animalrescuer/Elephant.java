package com.ftit.thirdassignment.animalrescuer;

public class Elephant extends Animal {

    private Integer noseSize;
    private String tuskConsistency;

    public void sprayWaterFromNose() {
        System.out.println("Stay away when they are doing this!!!!");
    }
    public void migration() {
        System.out.println("Elephant behaviour");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant sleep behaviour");
    }

    @Override
    public void eat() {
        System.out.println("Elephant eat behaviour");
    }

    @Override
    public void play() {
        System.out.println("Elephant play behaviour");
    }

    public Integer getNoseSize() {
        return noseSize;
    }

    public void setNoseSize(Integer noseSize) {
        this.noseSize = noseSize;
    }

    public String getTuskConsistency() {
        return tuskConsistency;
    }

    public void setTuskConsistency(String tuskConsistency) {
        this.tuskConsistency = tuskConsistency;
    }
}
