package com.coherentsolutions.java.webauto.section02;

/**
 * Demonstrates the lack of thread safety of StringBuilder in a multithreaded environment.
 */
public class Ex05StringBuilderThreadSafety {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder builder = new StringBuilder("Initial ");
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                builder.append("A");
            }
            System.out.println(builder);
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);
        Thread thread4 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println(builder.length());
    }
}
