package com.sadhak.corejava.multithreading;

public class BasicThread extends Thread {

    public BasicThread(String name) {
        // Call the constructor of the superclass with the thread name
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
