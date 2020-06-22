package com.company.builder;

public class Automobile {
    protected String name;
    protected int weight;
    protected int speed;
    protected int price;
    protected int numberOfWheels;
    protected String bodyType;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void ShowInfo(){
        System.out.println("Name = " + getName());
        System.out.println("Weight = " + getWeight() + " in tons");
        System.out.println("Speed = " + getSpeed() + " in km/h");
        System.out.println("Price = " + getPrice() + " in millions of rubles");
        System.out.println("Number of wheels = " + getNumberOfWheels() + " pcs");
        System.out.println("Body type = " + getBodyType());
    }
}
