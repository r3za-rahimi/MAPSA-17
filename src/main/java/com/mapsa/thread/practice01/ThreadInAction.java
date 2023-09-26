package com.mapsa.thread.practice01;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadInAction {


    public void sumOfNumbersWithFixThreadPool(List<Integer> numbers) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(3);
        AtomicInteger sum = new AtomicInteger();
        System.out.println(numbers.stream().reduce(0, Integer::sum));
        long startTime = System.currentTimeMillis();

       numbers.forEach(i ->   executor.submit(() -> sum.addAndGet(i)));
       executor.shutdown();
//        executor.awaitTermination(100, TimeUnit.NANOSECONDS);
        System.out.println("Fixed : " + sum.get());



    }

    public void sumOfNumbersWithCatchThreadPool(List<Integer> numbers) throws InterruptedException {

        ExecutorService executor = Executors.newCachedThreadPool();
        AtomicInteger sum = new AtomicInteger();
        System.out.println(numbers.stream().reduce(0, Integer::sum));
        long startTime = System.currentTimeMillis();

        numbers.forEach(i ->   executor.submit(() -> sum.addAndGet(i)));
        executor.shutdown();
//        executor.awaitTermination(100, TimeUnit.NANOSECONDS);
        System.out.println("Cached : " + sum.get());



    }


    public void sumOfNumbersWithScheduledThreadPool(List<Integer> numbers) throws InterruptedException {

        ExecutorService executor = Executors.newScheduledThreadPool(100);
        AtomicInteger sum = new AtomicInteger();
        System.out.println(numbers.stream().reduce(0, Integer::sum));
        long startTime = System.currentTimeMillis();

        numbers.forEach(i ->   executor.submit(() -> sum.addAndGet(i)));
        executor.shutdown();
//        executor.awaitTermination(100, TimeUnit.NANOSECONDS);
        System.out.println("Scheduled : " + sum.get());



    }
}
