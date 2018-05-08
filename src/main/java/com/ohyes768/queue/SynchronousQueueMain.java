package com.ohyes768.queue;

import java.util.concurrent.SynchronousQueue;

/**
 * @author: jackson.tang
 * @version: 1.0
 * @Date: Created in 2018/5/8 17:05
 * @Modified:
 */
public class SynchronousQueueMain {
    public static void main(String[] args) {
        final SynchronousQueue<String> q1 = new SynchronousQueue<String>();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    System.out.println(Thread.currentThread().getName()+"取数据  "+ q1.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                q1.add("b");
                System.out.println(Thread.currentThread().getName() +"加入数据  b");
            }
        });
        t2.start();

    }
}
