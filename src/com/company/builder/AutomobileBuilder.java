package com.company.builder;

public abstract class AutomobileBuilder {
    Automobile automobile;

    void createAutomobile(){
        automobile = new Automobile();
    }

    abstract void buildName();
    abstract void buildWeight();
    abstract void buildSpeed();
    abstract void buildPrice();
    abstract void buildNumberOfWheels();
    abstract void buildBodyType();

    Automobile getAutomobile(){
        return automobile;
    }
}
