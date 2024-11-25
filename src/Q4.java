//4. Stack: Push and Pop Operations
//Question: Use a Stack to store a sequence of numbers. Push 10, 20, and 30 onto the stack, and then pop and print each element until the stack is empty.

import java.util.Stack;

public class Q4 {

    //fields:
    Integer[] integerArray;                                                             //declare input array, using wrapper class
    Stack<Integer> stack = new Stack<>();                                               //declare new stack


    //constructor:
    public Q4(Integer[] integerArray) {
        this.integerArray = integerArray;
    }


    //methods:
    public void pushAndPop() {
        System.out.println("The pushed elements of the stack are: ");
        for (Integer i : integerArray) {                                                //iterate array to push and print all elements
            System.out.println(stack.push(i));
        }
        System.out.println();
        System.out.println("The popped elements of the stack are: ");
        while (!(stack.isEmpty())) {                                                    //as long as stack is not empty,
            System.out.println(stack.pop());                                            //pop and print element
        }
        System.out.println("\nThe stack is now empty.");
    }
}
