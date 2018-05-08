package com.ohyes768.queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: jackson.tang
 * @version: 1.0
 * @Date: Created in 2018/5/8 17:04
 * @Modified:
 */
public class LinkedBlockingQueueMain {
    public static void main(String[] args) {
        System.out.println("--------------- LinkedBlockingQueue --------------");
        //阻塞队列   无长度限制队列
        LinkedBlockingQueue<String> q = new LinkedBlockingQueue<String>();
        q.offer("a");
        q.offer("b");
        q.offer("c");
        q.offer("d");
        q.offer("e");
        q.add("f");
        System.out.println("总长度  >>  "+q.size());

        for (Iterator iterator = q.iterator(); iterator.hasNext(); ) {
            String string = (String) iterator.next();
            System.out.print(string+" -- ");
        }
        System.out.println();
        List<String> list = new ArrayList<String>();
        //在 q 的队列中取三个元素放到list 队列里
        System.out.println(q.drainTo(list, 3));
        System.out.println("取出LinkedBlockingQueue数据放到list列表的长度为   >>  "+list.size());
        for (String string : list) {
            System.out.print(string + " -- ");
        }
        System.out.println();

        //线程安全的双端队列
        LinkedBlockingDeque<String> dq = new LinkedBlockingDeque<String>(10);
        dq.addFirst("a");
        dq.addFirst("b");
        dq.addFirst("c");
        dq.addFirst("d");
        dq.addFirst("e");
        dq.addLast("f");
        dq.addLast("g");
        dq.addLast("h");
        dq.addLast("i");
        dq.addLast("j");
        //dq.offerFirst("k");
        System.out.println("查看头元素：" + dq.peekFirst());
        System.out.println("获取尾元素：" + dq.pollLast());
        Object [] objs = dq.toArray();
        for (int i = 0; i < objs.length; i++) {
            System.out.print(objs[i] + " -- ");
        }

    }
}
