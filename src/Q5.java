//5. ArrayList: Performance for Random Access
//Question: Demonstrate the performance benefit of ArrayList by accessing the middle element in a list of 1 million elements.

import java.util.ArrayList;
import java.util.LinkedList;

public class Q5 {

    //fields:                                                                               //unnecessary


    //constructor:                                                                          //unnecessary


    //methods:

    //populate ArrayList with 1 million elements and then retrieve middle element
    public static void evaluateArrayList() {
        //declare empty arraylist
        long declareStart1 = System.nanoTime();
        ArrayList<Integer> intArrayList = new ArrayList<>();
        long declareEnd1 = System.nanoTime();
        long declareTotal1 = declareEnd1 - declareStart1;

        //populate arraylist with numbers 0-999,999 using for loop
        long populateStart1 = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            intArrayList.add(i);
        }
        long populateEnd1 = System.nanoTime();
        long populateTotal1 = populateEnd1 - populateStart1;

        //retrieve index 500,000
        long retrieveStart1 = System.nanoTime();
        int middle1 = intArrayList.get(500000);
        long retrieveEnd1 = System.nanoTime();
        long retrieveTotal1 = retrieveEnd1 - retrieveStart1;
        long grandTotal1 = declareTotal1 + populateTotal1 + retrieveTotal1;

        //display performance data
        System.out.println("ArrayList performance: ");
        System.out.printf("Total time to declare empty arraylist: %,d nanoseconds", declareTotal1);
        System.out.printf("\nTotal time to populate arraylist with integers 0-999,999 using for loop: %,d nanoseconds", populateTotal1);
        System.out.printf("\nTotal time to retrieve element " + middle1 + " at index 500,000 of arraylist: %,d nanoseconds", retrieveTotal1);
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

        //populate arraylist with numbers 0-999,999 using for loop
        long populateStart2 = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            intLinkedList.add(i);
        }
        long populateEnd2 = System.nanoTime();
        long populateTotal2 = populateEnd2 - populateStart2;

        //retrieve index 500,000
        long retrieveStart2 = System.nanoTime();
        int middle2 = intLinkedList.get(500000);
        long retrieveEnd2 = System.nanoTime();
        long retrieveTotal2 = retrieveEnd2 - retrieveStart2;
        long grandTotal2 = declareTotal2 + populateTotal2 + retrieveTotal2;

        //display performance data
        System.out.println("LinkedList performance: ");
        System.out.printf("Total time to declare empty linkedlist: %,d nanoseconds", declareTotal2);
        System.out.printf("\nTotal time to populate linkedlist with integers 0-999,999 using for loop: %,d nanoseconds", populateTotal2);
        System.out.printf("\nTotal time to retrieve element " + middle2 + " at index 500,000 of linkedlist: %,d nanoseconds", retrieveTotal2);
        System.out.printf("\nTotal time for all operations: %,d nanoseconds", grandTotal2);
        System.out.println();
    }
}



