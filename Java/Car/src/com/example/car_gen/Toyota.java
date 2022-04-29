package com.example.car_gen;

public class Toyota extends Car{
    private boolean greatGasMileage;
    public Toyota(String color, int year, int speed, int maxSpeed, boolean isElectric, boolean greatGasMileage){
        super(color,year,speed,maxSpeed,isElectric);
        this.greatGasMileage = greatGasMileage;
    }

    //Getter & Setter
    public boolean getGreatGasMilage(){
        return greatGasMileage;
    }
    public void setGreatGasMileage(boolean greatGasMileage){
        this.greatGasMileage = greatGasMileage;
    }

    @Override
    public String toString() {
        return "Make: Toyota Color: "+super.getColor()+" Year: "+super.getYear()+" Speed: "+super.getSpeed()+" Max Speed: "+"Electric: "+ super.getIsElectric()+"Great Gas Mileage: "+greatGasMileage;
    }
}
