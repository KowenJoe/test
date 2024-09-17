package com.nemo.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
public class Demo1Application {


    public static void main(String[] args) {
        RunnableThread runnableThread = new RunnableThread();
        Thread t1 = new Thread(runnableThread);
        t1.setName("线程1");
        t1.start();
        SpringApplication.run(Demo1Application.class, args);

    }

}

