package com.modernjava.module.client;

import com.modernjava.module.consumer.Consumer;
import com.modernjava.module.producer.Producer;

import java.util.concurrent.ArrayBlockingQueue;

public class Client {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(5);
        Producer producer = new Producer(arrayBlockingQueue);
        Consumer consumer = new Consumer(arrayBlockingQueue);
    }
}
