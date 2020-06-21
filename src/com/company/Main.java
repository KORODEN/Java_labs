package com.company;

import com.company.factory.RUSSubmarineFactory;
import com.company.factory.SubmarineCreator;
import com.company.factory.SubmarineCreatorFactory;
import com.company.factory.USASubmarineFactory;
import com.company.hierarchy.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Two factories which produce RUS submarines and USA submarines
        List<AbstractTransport> transports = new ArrayList<>();

        SubmarineCreatorFactory submarineCreatorFactory = createSubmarineCreatorBySettings("rus");
        SubmarineCreator submarineCreator = submarineCreatorFactory.createSubmarineCreator();

        transports.add(submarineCreator.createSubmarine());

        submarineCreatorFactory = createSubmarineCreatorBySettings("usa");
        submarineCreator = submarineCreatorFactory.createSubmarineCreator();

        transports.add(submarineCreator.createSubmarine());

        for (AbstractTransport transport : transports) {
            transport.ShowInfo();
            System.out.println();
        }
    }

    static SubmarineCreatorFactory createSubmarineCreatorBySettings(String settings){
        if (settings.equalsIgnoreCase("rus")){
            return new RUSSubmarineFactory();
        }else if(settings.equalsIgnoreCase("usa")){
            return new USASubmarineFactory();
        }else {
            throw new RuntimeException(settings + "is unknown producer");
        }
    }
}