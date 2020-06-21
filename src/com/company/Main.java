package com.company;

import com.company.decorator.AlienTransport;
import com.company.hierarchy.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<AbstractTransport> transports = new ArrayList<>();

        AbstractTransport secretTransport = new Submarine("Beauty alien submarine", 30, 5,
                120, 1200, false);
        secretTransport = new AlienTransport("Beauty alien submarine", 30, 5,
                120, secretTransport);
        transports.add(secretTransport);

        for (AbstractTransport transport : transports) {
            transport.ShowInfo();
            System.out.println();
        }

        System.out.println(secretTransport.StartEngine());
    }
}