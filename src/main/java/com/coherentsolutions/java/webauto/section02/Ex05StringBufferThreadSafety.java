package com.coherentsolutions.java.webauto.section02;

/**
 * Demonstrates the thread safety of StringBuffer in a multithreaded environment.
 */
public class Ex05StringBufferThreadSafety {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer buffer = new StringBuffer("Initial ");
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                buffer.append("A");
            }
            System.out.println(buffer);
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(buffer.length());
    }
}
