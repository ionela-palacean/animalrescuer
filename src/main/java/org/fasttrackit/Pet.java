package org.fasttrackit;

public class Pet {
    String petType;
    String name;
    Integer age;
    Integer healtCondition;
    double hungryLevel;
    String favoriteFood;
    String favoriteActivity;
    Integer mood;

    Rescuer rescuer;
    Veterinarian veterinary;


    public double getHungryLevel(double hungryLevel) {

        System.out.println(name + " will eat the favorite food: " + favoriteFood + " and the hungry level will decrease");
        hungryLevel--;
        double newHungryLevel = hungryLevel;


        System.out.println("New hungrylevel is:" + newHungryLevel);

        System.out.println("If " + name + " will eat more food the hunggry level will decrease  to 0");
        for (int  i=0; newHungryLevel>0;i++) {
            if (newHungryLevel > 0) ;
            hungryLevel--;

            newHungryLevel = hungryLevel;

            System.out.println(newHungryLevel);

        }
        return newHungryLevel;
    }


    public double getFavoriteActivity(double mood) {

        System.out.println( name+ " will go in the park with " + rescuer.name + " and the pet will be more happy than now ");
        mood++;
        double newMood=mood;
        System.out.println(" New mood is"+ newMood);

        for (int i=0; newMood<10; i++) {
            if (newMood < 10) ;
            mood++;

            newMood = mood;

            System.out.println(newMood);
        }
        System.out.println("Pet finally satisfied");
        return newMood;


    }


}

