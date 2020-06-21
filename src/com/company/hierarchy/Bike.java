package com.company.hierarchy;

public class Bike extends GroundTransport {

    protected String bikeType;
    public Bike(String name, int weight, int speed, int price, int numberOfWheels, String bikeType) {
        super(name, weight, speed, price, numberOfWheels);
        this.bikeType = bikeType;
    }

    //Getter and setter for bikeType
    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    @Override
    public void ShowInfo(){
        super.ShowInfo();
        System.out.println("Bike type = " + getBikeType());
    }
}
