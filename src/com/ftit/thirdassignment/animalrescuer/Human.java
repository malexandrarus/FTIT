package com.ftit.thirdassignment.animalrescuer;

public class Human {

    private String name;
    private Integer age;
    private String[] hobbies;

    public void eat() {
        System.out.println("General human eat behaviour");
    }

    public void sleep() {
        System.out.println("General human sleep behaviour");
    }

    public void performHobby() {
        System.out.println("General human preferred activities");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }
}
