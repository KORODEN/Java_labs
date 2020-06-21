package com.company.factory;

import com.company.hierarchy.AbstractTransport;
import com.company.hierarchy.Submarine;

public class RUSSubmarineCreator implements SubmarineCreator {

    @Override
    public AbstractTransport createSubmarine() {
        return new Submarine("RUS submarine", 40, 25,
                85, 1500, true);
    }
}
