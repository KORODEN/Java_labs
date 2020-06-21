package com.company.factory;

public class USASubmarineFactory implements SubmarineCreatorFactory {

    @Override
    public SubmarineCreator createSubmarineCreator() {
        return new USASubmarineCreator();
    }
}
