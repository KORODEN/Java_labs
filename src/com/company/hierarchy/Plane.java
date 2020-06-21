package com.company.hierarchy;

public class Plane extends AirTransport{

    protected int numberOfEngines;
    public Plane(String name, int weight, int speed, int price, int maxFlightAltitude, int numberOfEngines) {
        super(name, weight, speed, price, maxFlightAltitude);
        this.numberOfEngines = numberOfEngines;
    }

    //Getter and setter for numberOfEngines
    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    public void ShowInfo(){
        super.ShowInfo();
        System.out.println("Number of engines = " + getNumberOfEngines() + " pcs");
    }
}
