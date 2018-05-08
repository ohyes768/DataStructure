package com.ohyes768.queue;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author: jackson.tang
 * @version: 1.0
 * @Date: Created in 2018/5/8 17:01
 * @Modified:
 */
public class ConcurrentLinkedQueueMain {


    public static void main(String[] args) throws Exception {

        //高性能无阻塞无界队列：ConcurrentLinkedQueue

        ConcurrentLinkedQueue<String> q = new ConcurrentLinkedQueue<String>();
        q.offer("a");
        q.offer("b");
        q.offer("c");
        q.offer("d");
        q.add("e");

        System.out.println("从头部取出元素，并从队列里删除 >> "+q.poll());    //a 从头部取出元素，并从队列里删除
        System.out.println("删除后的长度 >> "+q.size());    //4
        System.out.println("取出头部元素 >> "+q.peek());    //b
        System.out.println("长度 >> "+q.size());    //4
    }
}
