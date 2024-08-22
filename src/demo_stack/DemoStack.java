package demo_stack;

import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);


        System.out.println("Số phần tử trong stack: "+stack.size());
        System.out.println("Lấy một phần tử khỏi stack: "+stack.peek());
        System.out.println("peek() thêm lần nữa: "+stack.peek());
        System.out.println("Lấy một phần tử bằng pop(): "+stack.pop());
        System.out.println("Lấy thêm lần nữa bằng pop(): "+stack.pop());

    }
}
