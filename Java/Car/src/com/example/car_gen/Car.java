package com.example.car_gen;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String color, int year, int speed, int maxSpeed, boolean isElectric){
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
    }

    //Getter & Setter
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public boolean getIsElectric(){
        return  isElectric;
    }
    public void setIsElectric(boolean isElectric){
        this.isElectric = isElectric;
    }

    //Method
    public void accelerateSpeed(){
        if( speed+5 <= maxSpeed){
            speed += 5;
        }else {
            System.out.println("Car Max Speed Reached");
        }
    }
    public void decelerateSpeed(){
        if(speed-5 >= 0){
            speed -= 5;
        }else{
            System.out.println("Car is not in motion");
        }
    }
    public void convertToElectric(){
        if(!isElectric){
            isElectric = true;
            System.out.println("Car converted to Electric");
        }else {
            System.out.println("Car is already Electric");
        }
    }
}
