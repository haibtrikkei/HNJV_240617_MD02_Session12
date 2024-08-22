package demo_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Lop_ArrayDequeue {
    public static void main(String[] args) {
        Deque<Integer> list = new ArrayDeque<>();

        list.addFirst(10);
        list.addFirst(20);
        list.addLast(5);

        while(!list.isEmpty()){
            System.out.println(list.poll());
        }
    }
}
