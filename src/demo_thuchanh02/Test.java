package demo_thuchanh02;

public class Test {
    public static void main(String[] args) {
        MyLinkedListQueue obj = new MyLinkedListQueue();
        obj.enqueue(10);
        obj.enqueue(5);
        obj.enqueue(7);
        obj.enqueue(2);
        obj.enqueue(20);

        while(obj.head!=null){
            System.out.println(obj.dequeue().key);
        }
    }
}
