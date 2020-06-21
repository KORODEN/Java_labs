package com.company.hierarchy;

public class Ship extends WaterTransport {

    protected int maxTransportedWeight;
    public Ship(String name, int weight, int speed, int price, int maxDivingDepth, int maxTransportedWeight) {
        super(name, weight, speed, price, maxDivingDepth);
        this.maxTransportedWeight = maxTransportedWeight;
    }

    //Getter and setter for maxTransportedWeight
    public int getMaxTransportedWeight() {
        return maxTransportedWeight;
    }

    public void setMaxTransportedWeight(int maxTransportedWeight) {
        this.maxTransportedWeight = maxTransportedWeight;
    }

    @Override
    public void ShowInfo(){
        super.ShowInfo();
        System.out.println("Maximum transported weight = " + getMaxTransportedWeight() + " in tons");
    }
}
