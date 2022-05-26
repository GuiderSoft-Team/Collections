package day060.stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> myStack=new Stack<>();
        //Stack: push ve pop, peek
        //Last in First Out LIFO
        myStack.push("Kedi");
        myStack.push("Köpek");

        System.out.println("Stack : "+myStack);
        System.out.println("Peek ile : "+myStack.peek());
        System.out.println("Peek ile : "+myStack.peek());
        System.out.println("Peek ile : "+myStack.peek());
        System.out.println("Peek ile : "+myStack.peek());
        System.out.println("Peek ile : "+myStack.peek());
        System.out.println("Peek ile : "+myStack.peek());
        System.out.println("Peek ile : "+myStack.peek());

        String pop = myStack.pop();

        System.out.println("Çekilen eleman (pop) : "+pop);


        System.out.println("Peek ile : "+myStack.peek());
        System.out.println("Peek ile : "+myStack.peek());
        System.out.println("Peek ile : "+myStack.peek());
        System.out.println("Peek ile : "+myStack.peek());
        System.out.println("Peek ile : "+myStack.peek());

        System.out.println("Stack : "+myStack);

        String pop1 = myStack.pop();

        System.out.println("Çekilen eleman (pop1) : "+pop1);

        System.out.println("Stack : "+myStack);


    }
}
