package com.example.car_gen;

public class Main {
    public static void main(String[] args) {
        //Create Instance
        Lexus rx350 = new Lexus("Blue",2020,15,100,false, true);
        Honda civic = new Honda("Red",2004,10,110,false,true);
        Toyota supra = new Toyota("Orange",2000,90,145,false,false);
        //Instance check
        System.out.println("rx350: "+rx350.toString());
        System.out.println("Civic: "+civic.toString());
        System.out.println("Supra: "+supra.toString());

        //Print out car color
        System.out.println("rx350 color: "+rx350.getColor());
        System.out.println("Civic color: "+civic.getColor());
        System.out.println("Supra color: "+supra.getColor());

        //Accelerate Car and output new speed
        supra.accelerateSpeed();
        System.out.println("Supra Speed Accelerated: "+supra.getSpeed());
        supra.accelerateSpeed();
        System.out.println("Supra Speed Accelerated: "+supra.getSpeed());

        //Decelerate Car and output new speed
        civic.decelerateSpeed();
        System.out.println("Civic Speed Decelerated: "+civic.getSpeed());
        civic.decelerateSpeed();
        System.out.println("Civic Speed Decelerated: "+civic.getSpeed());

        //Convert to Electric
        rx350.convertToElectric();
        rx350.convertToElectric();
    }
}
