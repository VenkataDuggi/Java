package Collections;


import java.util.Stack;

public class stack {

    public static void main(String[] args) {

    Stack list = new Stack();
        list.push("A");
        list.push("B");
        list.push("Test");
        list.push("D");
        System.out.println(list);
        System.out.println(list.peek()); // This will show the last one
        System.out.println(list.pop()); // This will remove the last one
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.peek());
        System.out.println(list);



    }

}
