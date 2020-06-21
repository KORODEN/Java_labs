package com.company.hierarchy;

public class AirTransport extends AbstractTransport {

    protected int maxFlightAltitude;

    public AirTransport(String name, int weight, int speed, int price, int maxFlightAltitude) {
        super(name, weight, speed, price);
        this.maxFlightAltitude = maxFlightAltitude;
    }

    //Getter and setter for maxFlightAltitude
    public int getMaxFlightAltitude() {
        return maxFlightAltitude;
    }

    public void setMaxFlightAltitude(int maxFlightAltitude) {
        this.maxFlightAltitude = maxFlightAltitude;
    }

    @Override
    public void ShowInfo(){
        super.ShowInfo();
        System.out.println("Maximum flight altitude = " + getMaxFlightAltitude() + " м");
    }
}
