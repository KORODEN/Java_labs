package com.company.threads;

import com.company.hierarchy.AbstractTransport;

import java.util.Stack;

public class TransportStorage {
    private int transportsAmount = 0;
    private int maxTransports;

    private Stack<AbstractTransport> transports = new Stack<>();

    public TransportStorage(int maxTransports) {
        this.maxTransports = maxTransports;
    }

    //Consumer gets product from storage
    public synchronized AbstractTransport get() {
        while (transportsAmount <= 0) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println("Error while waiting for new products (get)");
            }
        }
        transportsAmount--;
        System.out.println("Consumer got one product");
        System.out.println("Goods in storage: " + transportsAmount);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error in sleep get");
        }

        notify();
        return transports.pop();
    }

    //Producer creates product and put it into storage
    public synchronized void put(AbstractTransport newTransport) {
        while (transportsAmount >= maxTransports) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println("Error while waiting for consumption of goods (put)");
            }
        }
        transportsAmount++;
        transports.push(newTransport);
        System.out.println("Producer put one product");
        System.out.println("Goods in storage: " + transportsAmount);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error in sleep put");
        }
        notify();
    }
}
