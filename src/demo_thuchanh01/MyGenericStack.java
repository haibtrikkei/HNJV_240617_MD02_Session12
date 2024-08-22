package demo_thuchanh01;

import java.util.LinkedList;

public class MyGenericStack<T> {
    public LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList<>();
    }

    public void push(T element){
        stack.addFirst(element);
    }

    public T pop(){
        return stack.pop();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
