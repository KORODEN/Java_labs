package com.company;

import com.company.hierarchy.*;
import com.company.threads.ConsumerThread;
import com.company.threads.ProducerThread;
import com.company.threads.TransportStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    static ProducerThread producer;
    static ConsumerThread consumer;
    static TransportStorage storage;

    public static void main(String[] args) {
        storage = new TransportStorage(30);
        producer = new ProducerThread(storage);
        consumer = new ConsumerThread(storage);

        producer.start();
        consumer.start();
    }
}
