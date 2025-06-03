package com.sadhak.corejava.multithreading;

public class MethodSynchronization {
    public synchronized void synchronizedMethod() {
        System.out.println("Synchronized method is being executed by " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Synchronized method execution completed by " + Thread.currentThread().getName());
    }

}
