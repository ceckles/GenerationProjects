package com.example.car_gen;

public class Lexus extends Car{
    private boolean hasLeatherSeats;

    public Lexus(String color, int year, int speed, int maxSpeed, boolean isElectric, boolean hasLeatherSeats){
        super(color,year,speed,maxSpeed,isElectric);
        this.hasLeatherSeats = hasLeatherSeats;
    }

    @Override
    public String toString() {
        return "Lexus: Color: "+super.getColor()+" Year: "+super.getYear()+" Speed: "+super.getSpeed()+" Max Speed: "+"Electric: "+ super.getIsElectric();
    }
}
