//2. LinkedList: Insert and Iterate
//Question: Use a LinkedList to store integers. Add integers 1 to 5 and insert 10 at the second position. Print all elements.

import java.util.LinkedList;
import java.util.List;

public class Q2 {

    //fields:
    Integer[] integerArray;                                                             //declare array input using wrapper class for int
    int integer;                                                                        //declare integer input
    int position;                                                                       //declare position input
    LinkedList<Integer> integers = new LinkedList<>();                                  //declare linkedlist to populate
    int index;                                                                          //variable to calculate target index from given position (in constructor)


    //constructor:
    public Q2(Integer[] integerArray, int integer, int position) {
        this.integerArray = integerArray;
        this.integer = integer;
        this.position = position;
        index = position - 1;
    }


    //methods:
    //main method to call other class methods--shifts all elements beginning at insert index to the right, and then copies new value to insert index
    public void insertAndIterate() {

        createLinkedList();
//        insertToLinkedList1();        //don't use this method; call method #2 in following line
        insertToLinkedList2();
        printLinkedList();
    }

    //method to populate linkedlist
    public void createLinkedList() {

        integers.addAll(List.of(integerArray));                                         //add integers from list to linkedlist
    }

    //method #1 to manually insert integer to linkedlist--inappropriate method developed before understanding how LinkedList performs insertion
    public void insertToLinkedList1() {

        int z = integers.size() - 1;                                                    //set variable for last element of linkedlist before insert
        int i = 0;                                                                      //set an iterator to count left from end of linkedlist
        integers.add(integers.get(z));                                                  //add new element = existing last element
        while ((z - i) >= index) {                                                      //loop to start at index z (last element before added new element) and move left until insert position
            integers.set((z - i), integers.get(z - i - 1));                             //set each element with value of element to left of it (shift to right)
            i++;                                                                        //increment i to move left and repeat loop
        }                                                                               //loop completed when copies value out of insert position (shifts all elements >= insert position to the right)
        integers.set(index, integer);                                                   //sets the insert position with new input value
    }

    //method #2 to insert integer to linkedList--add to specified index
    public void insertToLinkedList2() {
        integers.add(index, integer);                                                   //directly inserts new element at specified index
    }

    //method to print linkedlist
    public void printLinkedList() {

        System.out.print("Original LinkedList = ");                                     //print original list
        for (Integer i : integerArray) {
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println("Integer " + integer + " is inserted at position " + position + ".");        //print operation performed
        System.out.print("Updated LinkedList = ");                                      //print updated linkedlist
        for (Integer i : integers) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
}
