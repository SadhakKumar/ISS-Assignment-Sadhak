package com.sadhak.corejava.multithreading;

public class VolatileKeyword extends Thread {

    // Volatile variable to ensure visibility across threads
    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
            System.out.println("Volatile variable status: " + running);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " has stopped.");
    }

    public void stopRunning() {
        running = false; // This will stop the thread
    }

}
