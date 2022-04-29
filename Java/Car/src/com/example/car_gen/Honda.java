package com.example.car_gen;

public class Honda extends Car{
    private boolean isTurboCharged;
    public Honda(String color, int year, int speed, int maxSpeed, boolean isElectric, boolean isTurboCharged){
        super(color,year,speed,maxSpeed,isElectric);
        this.isTurboCharged = isTurboCharged;
    }

    //Getter & Setter
    public boolean getIsTurboCharged(){
        return isTurboCharged;
    }
    public void setIsTurboCharged(boolean isTurboCharged){
        this.isTurboCharged = isTurboCharged;
    }

    @Override
    public String toString() {
        return "Make:Honda Color: "+super.getColor()+" Year: "+super.getYear()+" Speed: "+super.getSpeed()+" Max Speed: "+"Electric: "+ super.getIsElectric()+" Turbo:"+ isTurboCharged;
    }
}
