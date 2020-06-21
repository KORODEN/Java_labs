package com.company.threads;

import com.company.hierarchy.*;

import java.util.concurrent.ThreadLocalRandom;

public class ProducerThread extends Thread{

    private AbstractTransport createRandomTransport() {

        AbstractTransport transport = null;
        int classesAmount = 6;
        int transportsAmount = 5;
        int min_mod = 0;
        int max_mod = 15;
        for (int i = 0; i < transportsAmount; i++) {
            int random = ThreadLocalRandom.current().nextInt(0, classesAmount);
            int randomMod = ThreadLocalRandom.current().nextInt(min_mod, max_mod);
            switch (random) {
                case (0):
                    transport = new Automobile("Automobile(" + i + ')', randomMod, 200 + randomMod,
                            randomMod, 4, "Sedan");
                    break;
                case (1):
                    transport = new Bike("Bike(" + i + ')', 1, 300 + randomMod,
                            randomMod, 2, "Sport bike");
                    break;
                case (2):
                    transport = new Helicopter("Helicopter(" + i + ')', randomMod, 200 + randomMod,
                            5 + randomMod, 400, 4);
                    break;
                case (3):
                    transport = new Plane("Plane(" + i + ')', 140 + randomMod, 700 + randomMod,
                            100 + randomMod, 5000 + randomMod, randomMod);
                    break;
                case (4):
                    transport = new Ship("Ship(" + i + ')', 240 + randomMod, 10 + randomMod,
                            50 + randomMod, 5000 + randomMod, randomMod);
                    break;
                case (5):
                    transport = new Submarine("Submarine(" + i + ')', 50 + randomMod, 10 + randomMod,
                            90 + randomMod, 1000 + randomMod, true);
                    break;
            }
        }

        return transport;
    }

    private TransportStorage storage;

    public ProducerThread(TransportStorage storage) {
        super("Producer thread");
        this.storage = storage;
    }

    @Override
    public void run() {
        System.out.println("Producer thread was started");

        //endless production goods and put their into storage
        while (true) {
            storage.put(createRandomTransport());
        }
    }
}
