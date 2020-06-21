package com.company.factory;

import com.company.hierarchy.AbstractTransport;
import com.company.hierarchy.Submarine;

public class USASubmarineCreator implements SubmarineCreator {

    @Override
    public AbstractTransport createSubmarine() {
        return new Submarine("USA submarine", 70, 10,
                190, 1000, false);
    }
}
