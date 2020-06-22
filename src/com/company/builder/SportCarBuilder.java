package com.company.builder;

public class SportCarBuilder extends AutomobileBuilder {
    @Override
    void buildName() {
        automobile.setName("Vesta");
    }

    @Override
    void buildWeight() {
        automobile.setWeight(2);
    }

    @Override
    void buildSpeed() {
        automobile.setSpeed(350);
    }

    @Override
    void buildPrice() {
        automobile.setPrice(3);
    }

    @Override
    void buildNumberOfWheels() {
        automobile.setNumberOfWheels(4);
    }

    @Override
    void buildBodyType() {
        automobile.setBodyType("muscle car");
    }
}
