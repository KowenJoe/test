package com.nemo.demo1;

import javafx.concurrent.Task;

import java.util.concurrent.*;

public class ThreadPoolTest {


    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executor.execute(new RunnableThread(i));
        }
        executor.shutdown();

        new ThreadPoolExecutor(5,10,60L, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
    }


}
