package com.company.decorator;

import com.company.hierarchy.AbstractTransport;

public class AlienTransport extends AbstractTransportDecorator {

    public AlienTransport(String name, int weight, int speed, int price, AbstractTransport submarine) {
        super(name, weight, speed, price, submarine);
    }

    public String isInvisible(){
        return " and transport is invisible";
    }

    @Override
    public String StartEngine(){
        return submarine.StartEngine() + isInvisible();
    }
}