package com.ohyes768.queue;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author: jackson.tang
 * @version: 1.0
 * @Date: Created in 2018/5/8 17:08
 * @Modified:
 */
public class PriorityBlockingQueueMain {
    public static void main(String[] args) throws Exception{
        PriorityBlockingQueue<Task> q2 = new PriorityBlockingQueue<Task>();
        Task t1 = new Task();
        t1.setId(3);
        t1.setName("id为3");
        Task t2 = new Task();
        t2.setId(4);
        t2.setName("id为4");
        Task t3 = new Task();
        t3.setId(1);
        t3.setName("id为1");
        Task t4 = new Task();
        t4.setId(2);
        t4.setName("id为2");

        //return this.id > task.id ? 1 : 0;
        q2.add(t1); //3
        q2.add(t2); //4
        q2.add(t3);  //1
        q2.add(t4);

        // 1 3 4
        //第一次取值时候是取最小的后面不做排序
        System.out.println("容器：" + q2);  //[1,id为1, 2,id为2, 3,id为3, 4,id为4]
        //拿出一个元素后  又会取一个最小的出来 放在第一个
        System.out.println(q2.take().getId());
        System.out.println("容器：" + q2);    //[2,id为2, 4,id为4, 3,id为3]
        System.out.println(q2.take().getId());
        System.out.println("容器：" + q2);  //[3,id为3, 4,id为4]
    }
}


class Task implements Comparable<Task>{

    private int id ;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Task task) {
        return this.id > task.id ? 1 : (this.id < task.id ? -1 : 0);
    }

    public String toString(){
        return this.id + "," + this.name;
    }

}
