package com.coherentsolutions.java.webauto.section02;

/**
 * Demonstrates the performance benefits of StringBuilder over StringBuffer.
 */
public class Ex06StringBuilderAndPerformance {
    public static void main(String[] args) {
        // Measure time for StringBuilder
        long startTime = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10_000_000; i++) {
            builder.append("text");
        }
        long endTime = System.nanoTime();
        long durationStringBuilder = endTime - startTime;
        System.out.println("Time taken by StringBuilder: " + durationStringBuilder + " nanoseconds");

        // Measure time for StringBuffer
        startTime = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 10_000_000; i++) {
            buffer.append("text");
        }
        endTime = System.nanoTime();
        long durationStringBuffer = endTime - startTime;
        System.out.println("Time taken by StringBuffer: " + durationStringBuffer + " nanoseconds");

        // Comparing the times
        System.out.println("StringBuilder is faster than StringBuffer by " + (durationStringBuffer - durationStringBuilder) + " nanoseconds.");
    }
}
