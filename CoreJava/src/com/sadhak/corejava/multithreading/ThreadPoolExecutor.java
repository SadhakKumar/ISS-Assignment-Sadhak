package com.sadhak.corejava.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor extends Thread {

    public void executorService() {
        // Create a thread pool with a fixed number of threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit tasks to the executor service
        for (int i = 0; i < 5; i++) {
            int taskId = i;
            executorService.submit(() -> {
                System.out.println("Executing task " + taskId + " in thread " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("Task interrupted: " + e.getMessage());
                }
            });
        }

        // Shutdown the executor service
        executorService.shutdown();
    }

}
