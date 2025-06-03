package com.sadhak.corejava.multithreading;

public class BlockSynchronization {
    public void synchronizedBlock() {

        // This method contains a synchronized block
        synchronized (this) {
            System.out.println("Synchronized block is being executed by " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Synchronized block execution completed by " + Thread.currentThread().getName());
        }
    }
}
