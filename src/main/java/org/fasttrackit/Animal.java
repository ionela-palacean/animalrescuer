package org.fasttrackit;



import java.util.Scanner;

public class Animal {
    private static Integer totalCount;

    private String petType;
    private String name;
    private Integer age;
    private Integer healthCondition;
    public Integer hungryLevel;
    private String favoriteFood;
    private String favoriteActivity;
    private Integer mood;

    // public Animal() { totalCount++;}


    Rescuer rescuer;
    Veterinarian veterinary;



    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(Integer healthCondition) {
        this.healthCondition = healthCondition;
    }

    public Integer getHungryLevel() {
        return hungryLevel;
    }

    public void setHungryLevel(Integer hungryLevel) {
        this.hungryLevel = hungryLevel;
    }

    public String getFavoriteFood() {
        return favoriteFood.trim();
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood.trim();
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity.trim();
    }

    public Integer getMood() {
        return mood;
    }

    public void setMood(Integer mood) {
        this.mood = mood;
    }

    public static Integer getTotalCount() {
        return totalCount;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "petType='" + petType + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", healthCondition=" + healthCondition +
                ", hungryLevel=" + hungryLevel +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", favoriteActivity='" + favoriteActivity + '\'' +
                ", mood=" + mood +
                '}';
    }
}


