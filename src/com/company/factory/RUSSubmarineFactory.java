package com.company.factory;

public class RUSSubmarineFactory implements SubmarineCreatorFactory {

    @Override
    public SubmarineCreator createSubmarineCreator() {
        return new RUSSubmarineCreator();
    }
}
