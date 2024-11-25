//6. LinkedList: Efficient Deletion
//Question: Use a LinkedList to store integers and remove the first and last elements efficiently.

import java.util.LinkedList;
import java.util.List;

public class Q6 {

    //fields:
    Integer[] integerArray;
    LinkedList<Integer> intLinkedList = new LinkedList<>();                             //create linkedlist for primary method
    LinkedList<Integer> intLinkedList2 = new LinkedList<>();                            //create linkedlist for secondary method

    //constructor:
    public Q6(Integer[] integerArray) {
        this.integerArray = integerArray;
    }

    //methods:
    //most efficient method: creates linkedlist, then removes first and last elements via special linkedlist methods
    public void deleteFirstAndLast(){
        intLinkedList.addAll(List.of(integerArray));
        System.out.println("Efficient method: ");
        System.out.println("Original LinkedList = " + intLinkedList);
        long efficientStart = System.nanoTime();
        intLinkedList.removeFirst();                                                    //use special removeFirst method
        intLinkedList.removeLast();                                                     //use special removeLast method
        long efficientEnd = System.nanoTime();
        long efficientTotal = efficientEnd - efficientStart;
        System.out.println("Updated LinkedList = " + intLinkedList);
        System.out.printf("Total time = %,d nanoseconds", efficientTotal);
        System.out.println();
        System.out.println();
    }

    //less efficient method: creates linkedlist, then removes first and last elements by index
    public void deleteFirstAndLast2(){
        intLinkedList2.addAll(List.of(integerArray));
        System.out.println("Less efficient method for comparison: ");
        System.out.println("Original LinkedList = " + intLinkedList2);
        long inefficientStart = System.nanoTime();
        intLinkedList2.remove(intLinkedList2.size() - 1);                           //remove last element by index (size minus 1)
        intLinkedList2.remove(0);                                                   //remove first element by index 0
        long inefficientEnd = System.nanoTime();
        long inefficientTotal = inefficientEnd - inefficientStart;
        System.out.println("Updated LinkedList = " + intLinkedList2);
        System.out.printf("Total time = %,d nanoseconds", inefficientTotal);
        System.out.println();
    }
}
