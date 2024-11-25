//9. ArrayList vs LinkedList: Performance for Deletion
//Question: Compare ArrayList and LinkedList performance by removing 10,000 elements from the start of each list.

import java.util.ArrayList;
import java.util.LinkedList;

public class Q9 {

    //fields:                                                                               //unnecessary


    //constructor:                                                                          //unnecessary


    //methods:

    //populate ArrayList with 100,000 elements and then remove 10,000 elements from start of list
        //repurposed from Q5 replacing retrieval block with deletion block
    public static void evaluateArrayList() {
        //declare empty arraylist
        long declareStart1 = System.nanoTime();
        ArrayList<Integer> intArrayList = new ArrayList<>();
        long declareEnd1 = System.nanoTime();
        long declareTotal1 = declareEnd1 - declareStart1;

        //populate arraylist with numbers 0-99,999 using for loop
        long populateStart1 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            intArrayList.add(i);
        }
        long populateEnd1 = System.nanoTime();
        long populateTotal1 = populateEnd1 - populateStart1;

        //delete 10,000 elements from start of list using remove(0)
        long deleteStart1 = System.nanoTime();
        int j = 0;
        while (j < 10000) {
            intArrayList.remove(0);
            j++;
        }
        long deleteEnd1 = System.nanoTime();
        long deleteTotal1 = deleteEnd1 - deleteStart1;
        long grandTotal1 = declareTotal1 + populateTotal1 + deleteTotal1;

        //display performance data
        System.out.println("ArrayList performance: ");
        System.out.printf("Total time to declare empty arraylist: %,d nanoseconds", declareTotal1);
        System.out.printf("\nTotal time to populate arraylist with integers 0-99,999 using for loop: %,d nanoseconds", populateTotal1);
        System.out.printf("\nTotal time to remove first 10,000 elements: %,d nanoseconds", deleteTotal1);
        System.out.printf("\nTotal time for all operations: %,d nanoseconds", grandTotal1);
        System.out.println();
   }

    //populate LinkedList with 1 million elements and then retrieve middle element
    public static void evaluateLinkedList() {

        //declare empty linkedlist
        long declareStart2 = System.nanoTime();
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        long declareEnd2 = System.nanoTime();
        long declareTotal2 = declareEnd2 - declareStart2;

        //populate arraylist with numbers 0-99,999 using for loop
        long populateStart2 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            intLinkedList.add(i);
        }
        long populateEnd2 = System.nanoTime();
        long populateTotal2 = populateEnd2 - populateStart2;

        //delete 10,000 elements from start of list using removeFirst
        long deleteStart2 = System.nanoTime();
        int j = 0;
        while (j < 10000) {
            intLinkedList.removeFirst();
            j++;
        }
        long deleteEnd2 = System.nanoTime();
        long deleteTotal2 = deleteEnd2 - deleteStart2;
        long grandTotal2 = declareTotal2 + populateTotal2 + deleteTotal2;

        //display performance data
        System.out.println("LinkedList performance: ");
        System.out.printf("Total time to declare empty linkedlist: %,d nanoseconds", declareTotal2);
        System.out.printf("\nTotal time to populate linkedlist with integers 0-99,999 using for loop: %,d nanoseconds", populateTotal2);
        System.out.printf("\nTotal time to remove first 10,000 elements: %,d nanoseconds", deleteTotal2);
        System.out.printf("\nTotal time for all operations: %,d nanoseconds", grandTotal2);
        System.out.println();
    }
}