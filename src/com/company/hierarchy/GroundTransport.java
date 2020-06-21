package com.company.hierarchy;

public class GroundTransport extends AbstractTransport {

    protected int numberOfWheels;

    public GroundTransport(String name, int weight, int speed, int price, int numberOfWheels) {
        super(name, weight, speed, price);
        this.numberOfWheels = numberOfWheels;
    }

    //Getter and setter for NumberOfWheels
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void ShowInfo(){
        super.ShowInfo();
        System.out.println("Number of wheels = " + getNumberOfWheels() + " pcs");
    }
}
