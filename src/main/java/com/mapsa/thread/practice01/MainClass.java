package com.mapsa.thread.practice01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MainClass {

    public static void main(String[] args) throws InterruptedException {


        ThreadInAction thread = new ThreadInAction();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(new Random().nextInt(1,2));
        }

        thread.sumOfNumbersWithFixThreadPool(numbers);
        thread.sumOfNumbersWithCatchThreadPool(numbers);
        thread.sumOfNumbersWithScheduledThreadPool(numbers);



    }
}
