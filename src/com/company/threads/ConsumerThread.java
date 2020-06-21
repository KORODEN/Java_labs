package com.company.threads;

import com.company.hierarchy.AbstractTransport;

import java.util.ArrayList;
import java.util.List;

public class ConsumerThread extends Thread {
    private List<AbstractTransport> transports = new ArrayList<>();

    private TransportStorage storage;

    public ConsumerThread(TransportStorage storage) {
        super("Consumer thread");
        this.storage = storage;
    }

    @Override
    public void run() {
        System.out.println("Consumer thread was started");

        //endless consumption of goods from storage
        while (true) {
            transports.add(storage.get());
        }
    }
}
