package org.fasttrackit;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Game {


    private Animal pet1;
    private Animal pet2;
    private Food[] foods = new Food[3];
    private List<Animal> pet = new ArrayList<>();


    public void start() {

        initializeFood();
        displayFoods();
        feedingAnimal();

    }

    public void initializeFood() {
        Food food1 = new Food();
        food1.setName("purina ");
        food1.setQuantity(50);

        foods[0] = food1;

        Food food2 = new Food();
        food2.setName("minced meat ");
        food2.setQuantity(40);

        foods[1] = food2;

        Food food3 = new Food();
        food3.setName("biscuits ");
        food3.setQuantity(100);

        foods[2] = food3;


    }

    private void displayFoods() {

        System.out.println("Available food: ");

        for (int i = 0; i < foods.length; i++) {
            int j = 0;
            j++;
            System.out.println(foods[i].getName() + " Quantity is: " + foods[i].getQuantity());

        }

        }

    private void feedingAnimal() {

        System.out.println("Choose the food you want to get: ");
        Scanner scanner = new Scanner(System.in);

        String choosedFood = scanner.next();

     // aici nu stiu cum as putea sa compar mancarea aleasa de utilizator si sa decrementez cantitatea.....pls help

    }


    }




















