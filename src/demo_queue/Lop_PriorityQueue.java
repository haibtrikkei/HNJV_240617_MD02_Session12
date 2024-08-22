package demo_queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lop_PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(10);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(8);
        list.add(15);
        list.add(2);
        list.add(20);

//        while (!list.isEmpty()){
//            System.out.println(list.poll());
//        }
        System.out.println("Lấy ra phần tử theo peek(): "+list.peek());
        System.out.println("Lấy thêm lần nữa theo peek(): "+list.peek());
        System.out.println("Lấy phần tử theo remove(): "+list.remove());
        System.out.println("Lấy thêm lần nữa theo remove(): "+list.remove());

    }
}
