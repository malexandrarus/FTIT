package com.ftit.thirdassignment.animalrescuer;

public class Animal {
    private String name;
    private String type;
    private Integer age;
    private Integer levelOfHealth;
    private Integer levelOfHunger;
    private Integer moodLevel;
    private String favouriteFood;
    private String favouriteRecreationActivity;

    public void eat() {
        System.out.println("General animal eat behaviour");
    }

    public void sleep() {
        System.out.println("General animal sleep behaviour");
    }

    public void play() {
        System.out.println("General animal play behaviour");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getLevelOfHealth() {
        return levelOfHealth;
    }

    public void setLevelOfHealth(Integer levelOfHealth) {
        if (validateInput(levelOfHealth)) {
            this.levelOfHealth = levelOfHealth;
        }
    }

    public Integer getLevelOfHunger() {
        return levelOfHunger;
    }

    public void setLevelOfHunger(Integer levelOfHunger) {
        if (validateInput(levelOfHunger)) {
            this.levelOfHunger = levelOfHunger;
        }
    }

    public Integer getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(Integer moodLevel) {
        if (validateInput(moodLevel)) {
            this.moodLevel = moodLevel;
        }
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteRecreationActivity() {
        return favouriteRecreationActivity;
    }

    public void setFavouriteRecreationActivity(String favouriteRecreationActivity) {
        this.favouriteRecreationActivity = favouriteRecreationActivity;
    }

    private boolean validateInput(Integer inputValue) {
        if (inputValue >= 1 && inputValue <= 10) {
            return true;
        } else {
            System.out.println("You have to enter a value from 1 to 10");
            return false;
        }
    }
}

