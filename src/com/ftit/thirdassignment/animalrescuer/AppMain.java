package com.ftit.thirdassignment.animalrescuer;

import java.util.Arrays;

public class AppMain {
    public static void main(String[] args) {
        AppMain appMain = new AppMain();

        // Start populating all objects with data
        Duck duck = appMain.buildDuckData();
        Lion lion = appMain.buildLionData();
        Elephant elephant = appMain.buildElephantData();
        Rescuer rescuer = appMain.buildRescuerData();
        Veterinarian veterinarian = appMain.buildVeterinarianData();

        AnimalFood animalFood = appMain.buildAnimalFoodData();
        RecreationActivity recreationActivity = appMain.buildRecreationActivityData();

        // Start printing data for duck
        System.out.println("Duck name is: " + duck.getName());
        System.out.println("Duck age is: " + duck.getAge());
        System.out.println("Duck type is: " + duck.getType());
        System.out.println("Duck's beak size is: " + duck.getBeakSize());
        System.out.println("Duck feather color is: " + duck.getFeatherColor());
        System.out.println("Duck max flight distance is: " + duck.getMaxFlightDistance());
        System.out.println("Duck level of health is: " + duck.getLevelOfHealth());
        System.out.println("Duck level of hunger is: " + duck.getLevelOfHunger());
        System.out.println("Duck mood is: " + duck.getMoodLevel());
        System.out.println("Duck favourite food is: " + duck.getFavouriteFood());
        System.out.println("Duck favourite recreation activity is: " + duck.getFavouriteRecreationActivity());
        System.out.println();

        // Start printing data for lion
        System.out.println("Lion name is: " + lion.getName());
        System.out.println("Lion age is: " + lion.getAge());
        System.out.println("Lion type is: " + lion.getType());
        System.out.println("Lion's mane color is:" + lion.getManeColor());
        System.out.println("Lion level of health is: " + lion.getLevelOfHealth());
        System.out.println("Lion level of hunger is: " + lion.getLevelOfHunger());
        System.out.println("Lion mood is: " + lion.getMoodLevel());
        System.out.println("Lion favourite food is: " + lion.getFavouriteFood());
        System.out.println("Lion favourite recreation activity is: " + lion.getFavouriteRecreationActivity());
        System.out.println();

        // Start printing data for elephant
        System.out.println("Elephant name is: " + elephant.getName());
        System.out.println("Elephant age is: " + elephant.getAge());
        System.out.println("Elephant type is: " + elephant.getType());
        System.out.println("Elephant's nose size is:" + elephant.getNoseSize());
        System.out.println("Elephant's tusk consistency is:" + elephant.getTuskConsistency());
        System.out.println("Elephant level of health is: " + elephant.getLevelOfHealth());
        System.out.println("Elephant level of hunger is: " + elephant.getLevelOfHunger());
        System.out.println("Elephant mood is: " + elephant.getMoodLevel());
        System.out.println("Elephant favourite food is: " + elephant.getFavouriteFood());
        System.out.println("Elephant favourite recreation activity is: " + elephant.getFavouriteRecreationActivity());
        System.out.println();

        // Start printing data for Animal food
        System.out.println("Data about food: name : " + animalFood.getName() + " price: " + animalFood.getPrice() + " quantity: " + animalFood.getQuantity() + " availability: " + animalFood.getStockAvailability());

        // Start printing data for recreation activity
        System.out.println("Data about recreation activity: name: " + recreationActivity.getName());
        System.out.println();

        // Start printing data for rescuer ??????
        System.out.printf("Data about rescuer: name: %s, age: %d, hobbies: %s, sum of money: %f%n, number of adopted animals: %d",
                rescuer.getName(), rescuer.getAge(), Arrays.toString(rescuer.getHobbies()), rescuer.getSumOfMoney(), rescuer.getNoOfAdoptedAnimals());
        // Start printing data for rescuer
        System.out.printf("Data about veterinarian: name: %s, age: %d, hobbies: %s, specialization: %s" , veterinarian.getName(), veterinarian.getAge(), Arrays.toString(veterinarian.getHobbies()), veterinarian.getSpecialization());

    }

    public Duck buildDuckData() {
        Duck duck = new Duck();

        // populate general animal data
        duck.setName("Scorsese");
        duck.setType("Fulvous whistling");
        duck.setAge(1);
        duck.setLevelOfHealth(2);
        duck.setLevelOfHunger(3);
        duck.setMoodLevel(2);
        duck.setFavouriteFood("Cookies");
        duck.setFavouriteRecreationActivity("Whistling");

        // populate Duck specific data
        duck.setBeakSize(7);
        duck.setFeatherColor("Rich cinnamon with broad black bars on the wings and back.");
        duck.setMaxFlightDistance(400);


        return duck;
    }

    public Lion buildLionData() {
        Lion lion = new Lion();

        // populate general animal data
        lion.setName("Loki");
        lion.setType("Asiatic Lion");
        lion.setAge(3);
        lion.setLevelOfHealth(2);
        lion.setLevelOfHunger(3);
        lion.setMoodLevel(2);
        lion.setFavouriteFood("Buffaloes");
        lion.setFavouriteRecreationActivity("Sleeping");

        // populate Lion specific data
        lion.setManeColor("gold");

        return lion;
    }

    public Elephant buildElephantData() {
        Elephant elephant = new Elephant();

        // populate general animal data
        elephant.setName("Heffalump");
        elephant.setType("African savanna");
        elephant.setAge(10);
        elephant.setLevelOfHealth(4);
        elephant.setLevelOfHunger(5);
        elephant.setMoodLevel(6);
        elephant.setFavouriteFood("Roots");
        elephant.setFavouriteRecreationActivity("Mud Baths");

        // populate Elephant specific data
        elephant.setNoseSize(10);
        elephant.setTuskConsistency("Solid");

        return elephant;
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

        // populate general human data
        rescuer.setName("AlexandraM");
        rescuer.setAge(23);
        rescuer.setHobbies(new String[]{"Painting, Jogging"});

        // populate  specific rescuer data
        rescuer.setSumOfMoney(1555.55);
        rescuer.setNoOfAdoptedAnimals(6);

        return rescuer;
    }

    public Veterinarian buildVeterinarianData() {
        Veterinarian veterinarian = new Veterinarian();

        // populate general human data
        veterinarian.setName("Mr. Bunny");
        veterinarian.setAge(45);
        veterinarian.setHobbies(new String[]{"Fishing"});

        // populate  specific veterinarian data
        veterinarian.setSpecialization("Critical care");

        return veterinarian;
    }
}


