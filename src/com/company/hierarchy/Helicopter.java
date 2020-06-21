package com.company.hierarchy;

public class Helicopter extends AirTransport {

    protected int numberOfBlades;

    public Helicopter(String name, int weight, int speed, int price, int maxFlightAltitude, int numberOfBlades) {
        super(name, weight, speed, price, maxFlightAltitude);
        this.numberOfBlades = numberOfBlades;
    }

    //Getter and setter for numberOfBlades
    public int getNumberOfBlades() {
        return numberOfBlades;
    }

    public void setNumberOfBlades(int numberOfBlades) {
        this.numberOfBlades = numberOfBlades;
    }

    @Override
    public void ShowInfo(){
        super.ShowInfo();
        System.out.println("Number of blades = " + getNumberOfBlades() + " pcs");
    }
}
