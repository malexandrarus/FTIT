package com.ftit.thirdassignment.animalrescuer;

public class AppMain {
    public static void main(String[] args) {
        AppMain appMain = new AppMain();

        // Start populating all objects with data
        Animal animal = appMain.buildAnimalData();
        AnimalFood animalFood = appMain.buildAnimalFoodData();
        RecreationActivity recreationActivity = appMain.buildRecreationActivityData();
        Rescuer rescuer = appMain.buildRescuerData();
        Veterinarian veterinarian = appMain.buildVeterinarianData();

        // Start printing data
        System.out.println("Animal name is: " + animal.getName());
        System.out.println("Animal age is: " + animal.getAge());
        System.out.println("Animal type is: " + animal.getType());
        System.out.println("Animal level of health is: " + animal.getLevelOfHealth());
        System.out.println("Animal level of hunger is: " + animal.getLevelOfHunger());
        System.out.println("Animal mood is: " + animal.getMoodLevel());
        System.out.println("Animal favourite food is: " + animal.getFavouriteFood());
        System.out.println("Animal favourite recreation activity is: " + animal.getFavouriteRecreationActivity());

        System.out.println("Data about food: name : " + animalFood.getName() + " price: " + animalFood.getPrice() + " quantity: " + animalFood.getQuantity() + " availability: " + animalFood.getStockAvailability());

        System.out.println("Data about recreation activity: name: " + recreationActivity.getName());

        System.out.printf("Data about rescuer: name: %s, sum of money: %f%n", rescuer.getName(), rescuer.getSumOfMoney());

        System.out.printf("Data about veterinarian: name: %s, specialization: %s" , veterinarian.getName(), veterinarian.getSpecialization());


    }

    public Animal buildAnimalData() {
        Animal animal = new Animal();
        animal.setName("Scorsese");
        animal.setType("Corgi");
        animal.setAge(1);
        animal.setLevelOfHealth(2);
        animal.setLevelOfHunger(3);
        animal.setMoodLevel(2);
        animal.setFavouriteFood("Peanut Butter Cookies");
        animal.setFavouriteRecreationActivity("Chew my shoes");

        return animal;
    }

    public AnimalFood buildAnimalFoodData() {
        AnimalFood animalFood = new AnimalFood();
        animalFood.setName("Pedigree Rodeo Dog Treats with Beef ");
        animalFood.setPrice(27.54);
        animalFood.setQuantity(123);
        animalFood.setStockAvailability(20);

        return animalFood;
    }

    public RecreationActivity buildRecreationActivityData() {
        RecreationActivity recreationActivity = new RecreationActivity();
        recreationActivity.setName("Sleep");

        return recreationActivity;
    }

    public Rescuer buildRescuerData() {
        Rescuer rescuer = new Rescuer();
        rescuer.setName("Alexandra");
        rescuer.setSumOfMoney(1555.55);

        return rescuer;
    }

    public Veterinarian buildVeterinarianData() {
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("Mr. George");
        veterinarian.setSpecialization("Emergency and critical care");

        return veterinarian;
    }
}


