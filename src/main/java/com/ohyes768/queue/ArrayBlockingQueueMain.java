package com.ohyes768.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author: jackson.tang
 * @version: 1.0
 * @Date: Created in 2018/5/8 17:03
 * @Modified:
 */
public class ArrayBlockingQueueMain {
    public static void main(String[] args) throws Exception {

        System.out.println("--------------- ArrayBlockingQueue --------------");
        //阻塞队列    有长度的队列
        ArrayBlockingQueue<String> array = new ArrayBlockingQueue<String>(5);
        array.put("a");
        array.put("b");
        array.add("c");
        array.add("d");
        array.add("e");
        //array.add("f");
        //返回一个布尔类型   在3秒之内能不能加入  不能返回false
        System.out.println(array.offer("a", 3, TimeUnit.SECONDS));
        System.out.println("所有数据  >>  " + array.toString());
    }
}
