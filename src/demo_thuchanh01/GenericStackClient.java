package demo_thuchanh01;

public class GenericStackClient {
    public void stackOfStrings(){
        MyGenericStack<String> list1 = new MyGenericStack<>();
        list1.push("Two");
        list1.push("One");
        list1.push("Five");
        list1.push("Three");
        list1.push("Four");
        list1.push("Seven");


        while(!list1.isEmpty()){
            System.out.println(list1.pop());
        }
    }

    public void stackOfIntegers(){
        MyGenericStack<Integer> list2 = new MyGenericStack<>();
        list2.push(5);
        list2.push(10);
        list2.push(7);
        list2.push(60);
        list2.push(20);
        list2.push(15);


        while(!list2.isEmpty()){
            System.out.println(list2.pop());
        }
    }

    public static void main(String[] args) {
        GenericStackClient obj = new GenericStackClient();
        obj.stackOfStrings();
        obj.stackOfIntegers();
    }
}
