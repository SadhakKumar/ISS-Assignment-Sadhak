package com.sadhak.corejava.multithreading;

public class Main {

    public static void main(String[] args) {

        // Demonstration of Basic multithreading
        BasicThread basicThread1 = new BasicThread("Thread-1");
        BasicThread basicThread2 = new BasicThread("Thread-2");

        basicThread1.start();
        basicThread2.start();

        // Demonstration of Thread pool executor
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
        threadPoolExecutor.executorService();

        // Demonstration of Volatile variable
        VolatileKeyword volatileKeywordThread1 = new VolatileKeyword();
        volatileKeywordThread1.start();

        // Changing the volatile variable to stop the threads
        volatileKeywordThread1.stopRunning();

        // Demonstration of Thread safe instance
        ThreadSafeInstance threadSafeInstanceThread1 = new ThreadSafeInstance();
        ThreadSafeInstance threadSafeInstanceThread2 = new ThreadSafeInstance();

        // Incrementing instance variable in a thread-safe manner using the synchronized
        // method
        threadSafeInstanceThread1.incrementInstanceVariable();

        // Incrementing local variable in a thread-safe manner
        threadSafeInstanceThread2.incrementLocalVariable();

        // Demonstration of Method synchronization
        MethodSynchronization methodSynchronizationThread1 = new MethodSynchronization();
        MethodSynchronization methodSynchronizationThread2 = new MethodSynchronization();

        Thread thread1 = new Thread(() -> methodSynchronizationThread1.synchronizedMethod(), "Thread-1");
        Thread thread2 = new Thread(() -> methodSynchronizationThread2.synchronizedMethod(), "Thread-2");

        thread1.start();
        thread2.start();

        // Demonstration of Block synchronization
        BlockSynchronization blockSynchronizationThread1 = new BlockSynchronization();
        BlockSynchronization blockSynchronizationThread2 = new BlockSynchronization();

        Thread blockThread1 = new Thread(() -> blockSynchronizationThread1.synchronizedBlock(), "BlockThread-1");
        Thread blockThread2 = new Thread(() -> blockSynchronizationThread2.synchronizedBlock(), "BlockThread-2");

        blockThread1.start();
        blockThread2.start();

    }

}
