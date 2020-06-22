package com.company.builder;

public class OffRoadCarBuilder extends AutomobileBuilder {
    @Override
    void buildName() {
            automobile.setName("Niva");
    }

    @Override
    void buildWeight() {
        automobile.setWeight(3);
    }

    @Override
    void buildSpeed() {
        automobile.setSpeed(180);
    }

    @Override
    void buildPrice() {
        automobile.setPrice(1);
    }

    @Override
    void buildNumberOfWheels() {
        automobile.setNumberOfWheels(4);
    }

    @Override
    void buildBodyType() {
        automobile.setBodyType("off road");
    }
}
