package com.ftit.thirdassignment.animalrescuer;

public class Veterinarian extends Human {

    private String specialization;

    public void animalConsultation() {
        System.out.println("Veterinarian consultation");
    }

    public void animalSurgicalOperation() {
        System.out.println("Veterinarian surgical operation");
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
