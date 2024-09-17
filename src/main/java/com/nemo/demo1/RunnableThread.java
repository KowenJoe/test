package com.nemo.demo1;

public class RunnableThread implements Runnable {
    private int taskId;

    public RunnableThread(){

    }

    public RunnableThread(int id){
        this.taskId = id;
    }

    public void run() {
        System.out.println("用实现Runnable接口实现线程");
        /*for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }*/
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
