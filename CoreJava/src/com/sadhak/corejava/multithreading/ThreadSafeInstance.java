package com.sadhak.corejava.multithreading;

public class ThreadSafeInstance {

    // This is not thread-safe because multiple threads can modify the counter
    // variable leading to race conditions.
    private int counter = 0;

    // Synchronized method to ensure that only one thread can access this method at
    // a time
    public void incrementInstanceVariable() {
        synchronized (this) {
            // Increment the counter variable in a synchronized block
            counter++;
        }
    }

    public void incrementLocalVariable() {
        // Local variable is thread-safe because each thread has its own copy of the
        // local variable
        int localCounter = 0;
        localCounter++;
        System.out.println("Local counter: " + localCounter);
    }

}
