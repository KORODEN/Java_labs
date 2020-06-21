package com.company.hierarchy;

public class Automobile extends GroundTransport {

    protected String bodyType;
    public Automobile(String name, int weight, int speed, int price, int numberOfWheels, String bodyType) {
        super(name, weight, speed, price, numberOfWheels);
        this.bodyType = bodyType;
    }

    //Getter and setter for bodyType
    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void ShowInfo(){
        super.ShowInfo();
        System.out.println("Body type = " + getBodyType());
    }
}
