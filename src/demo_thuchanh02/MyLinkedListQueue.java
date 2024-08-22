package demo_thuchanh02;

public class MyLinkedListQueue {
    public Node head;
    public Node tail;

    public MyLinkedListQueue(){
        head = null;
        tail = null;
    }

    public void enqueue(int key){
        Node temp = new Node(key);
        if(tail==null){
            head = tail = temp;
            return;
        }

        tail.next = temp;
        tail = temp;
    }

    public Node dequeue(){
        if(head==null)
            return null;
        Node temp = head;
        head = head.next;
        return temp;
    }
}
