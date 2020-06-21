package com.company;

import com.company.hierarchy.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        List<AbstractTransport> transports = new ArrayList<>();
        int classesAmount = 6;
        int transportsAmount = 5;
        int min_mod = 0;
        int max_mod = 15;
        for (int i = 0; i < transportsAmount; i++) {
            int random = ThreadLocalRandom.current().nextInt(0, classesAmount);
            int randomMod = ThreadLocalRandom.current().nextInt(min_mod, max_mod);
            switch (random) {
                case (0):
                    Automobile automobile = new Automobile("Automobile(" + i + ')', randomMod, 200 + randomMod,
                            randomMod, 4, "Sedan");
                    transports.add(automobile);
                    break;
                case (1):
                    Bike bike = new Bike("Bike(" + i + ')', 1, 300 + randomMod,
                            randomMod, 2, "Sport bike");
                    transports.add(bike);
                    break;
                case(2):
                    Helicopter helicopter = new Helicopter("Helicopter(" + i + ')', randomMod, 200 + randomMod,
                            5 + randomMod, 400, 4);
                    transports.add(helicopter);
                    break;
                case(3):
                    Plane plane = new Plane("Plane(" + i + ')', 140 + randomMod, 700 + randomMod,
                            100 + randomMod, 5000 + randomMod, randomMod);
                    transports.add(plane);
                    break;
                case(4):
                    Ship ship = new Ship("Ship(" + i + ')', 240 + randomMod, 10 + randomMod,
                            50 + randomMod, 5000 + randomMod, randomMod);
                    transports.add(ship);
                    break;
                case(5):
                    Submarine submarine = new Submarine("Submarine(" + i + ')', 50 + randomMod, 10 + randomMod,
                            90 + randomMod, 1000 + randomMod, true);
                    transports.add(submarine);
                    break;
            }
        }
        for (AbstractTransport transport : transports) {
            transport.ShowInfo();
            System.out.println();
        }
    }
}
