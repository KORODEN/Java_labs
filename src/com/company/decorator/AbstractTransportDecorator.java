package com.company.decorator;

import com.company.hierarchy.AbstractTransport;

public class AbstractTransportDecorator extends AbstractTransport {

    AbstractTransport submarine;
    public AbstractTransportDecorator(String name, int weight, int speed, int price, AbstractTransport submarine) {
        super(name, weight, speed, price);
        this.submarine = submarine;
    }

    @Override
    public String StartEngine(){
        return submarine.StartEngine();
    }
}