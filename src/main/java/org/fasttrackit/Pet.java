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
}

