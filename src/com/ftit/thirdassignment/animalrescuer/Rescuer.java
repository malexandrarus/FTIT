package com.ftit.thirdassignment.animalrescuer;

public class Rescuer extends Human {

    private Double sumOfMoney;
    private Integer noOfAdoptedAnimals;

    public void takeCareOfAnimals() {
        System.out.println("Love animals");
    }

    public void playWithAnimals() {
        System.out.println("Play with animals");
    }

    public void rescueAnimals() {
        System.out.println("Animals rescued");
    }

    @Override
    public void eat() {
        System.out.println("Veterinarian eat behaviour");
    }

    @Override
    public void sleep() {
        System.out.println("Veterinarian sleep behaviour");
    }

    @Override
    public void performHobby() {
        System.out.println("Veterinarian preferred activities");
    }

    public Integer getNoOfAdoptedAnimals() {
        return noOfAdoptedAnimals;
    }

    public void setNoOfAdoptedAnimals(Integer noOfAdoptedAnimals) {
        this.noOfAdoptedAnimals = noOfAdoptedAnimals;
    }

    public Double getSumOfMoney() {
        return sumOfMoney;
    }

    public void setSumOfMoney(Double sumOfMoney) {
        this.sumOfMoney = sumOfMoney;
    }
}
