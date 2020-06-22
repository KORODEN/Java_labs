package com.company.builder;

public class Director {
    AutomobileBuilder builder;

    public void setBuilder(AutomobileBuilder builder) {
        this.builder = builder;
    }

    Automobile buildAutomobile(){
        builder.createAutomobile();
        builder.buildName();
        builder.buildWeight();
        builder.buildPrice();
        builder.buildSpeed();
        builder.buildNumberOfWheels();
        builder.buildBodyType();

        Automobile automobile = builder.getAutomobile();

        return automobile;
    }
}
