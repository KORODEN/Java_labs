package com.company.hierarchy;

public abstract class AbstractTransport {

    protected String name;
    protected int weight;
    protected int speed;
    protected int price;

    public AbstractTransport(String name, int weight, int speed, int price){
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    //Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Getter and setter for weight
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //Getter and setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //Getter and setter for price
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String StartEngine(){
        return "The engine was started";
    }

    public void ShowInfo(){
        System.out.println("Name = " + getName());
        System.out.println("Weight = " + getWeight() + " in tons");
        System.out.println("Speed = " + getSpeed() + " in km/h");
        System.out.println("Price = " + getPrice() + " in millions of rubles");
    }
}
