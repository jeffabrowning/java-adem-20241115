//Automation training assignment #4: 11/15/24 (10 new questions by Adem)

import java.util.List;

public class Main {

    //use main method to call method(s) from each question's separate class
    public static void main(String[] args) throws InterruptedException {

        //1. ArrayList: Add and Access Elements         (GOOD SOLUTION WITH 2 DIFFERENT APPROACHES)
//            Q1 florida = new Q1();                                                                              //first instance of class--uses add method #1
//            florida.addIndividualElements("Auburndale", "Gainesville", "Orlando", "Tampa", "St. Pete");         //input individual strings
//            florida.accessElement(3);                                                                   //access specified element (position = index + 1)
//            System.out.println();
//
//            Q1 northCarolina = new Q1();                                                                        //second instance of class--uses add method #2
//            String[] input = {"Greenville", "Ashville", "Durham", "Burlington", "Charlotte"};                   //input strings into an array
//            northCarolina.addElementsAsList(input);                                                             //pass array to method
//            northCarolina.accessElement(3);                                                             //access specified element
//            System.out.println();

        //2. LinkedList: Insert and Iterate             (GOOD SOLUTION)
//            Integer[] integerArray = {1,2,3,4,5};                                                               //input integers for LinkedList into wrapper class array
//            int insertInteger = 10;                                                                             //integer to insert to LinkedList
//            int insertPosition = 2;                                                                             //position to insert integer to LinkedList (position = index + 1)
//            Q2 q2 = new Q2(integerArray, insertInteger, insertPosition);                                        //pass arguments to constructor
//            q2.insertAndIterate();                                                                              //call method

        //3. Vector: Thread-Safe Operations
//            String[] employeeNames = {"Matthew", "Mark", "Luke"};                                               //input names for vector
//            Q3 q3 = new Q3(employeeNames);                                                                      //pass argument to constructor
//            q3.synchronizedIteration();                                                                         //call method

        //4. Stack: Push and Pop Operations             (GOOD SOLUTION)
//            Integer[] integerArray = {10, 20, 30};                                                              //input integers (as a wrapper class array) for push to stack
//            Q4 q4 = new Q4(integerArray);                                                                       //pass argument to constructor
//            q4.pushAndPop();                                                                                    //call method

        //5. ArrayList: Performance for Random Access   (GOOD SOLUTION)
//            Q5.evaluateArrayList();                                                                             //perform operations on arraylist and print results
//            System.out.println();
//            Q5.evaluateLinkedList();                                                                            //perform operations on linkedlist and print results

        //6. LinkedList: Efficient Deletion             (GOOD SOLUTION)
//            Integer[] integerArray = {3,6,9,12,15,18,21,24,27,30};                                              //input integers for linkedlist using wrapper class array
//            Q6 q6 = new Q6(integerArray);                                                                       //pass argument to constructor
//            q6.deleteFirstAndLast();                                                                            //primary method
//            q6.deleteFirstAndLast2();                                                                           //less efficient method for comparison

        //7. Vector: Dynamic Resizing                   (GOOD SOLUTION)
//            String[] stringArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//            Q7 q7 = new Q7(stringArray);
//            q7.dynamicallyResizeVector();

        //8. Stack: Check Balance of Parentheses        (GOOD SOLUTION)
//            String parentheses = "(())((((()()))())())(((()())))";                                            //input string of parentheses
//            Q8 q8 = new Q8(parentheses);                                                                      //pass argument to constructor
//            q8.checkBalance();                                                                                //call method

        //9. ArrayList vs LinkedList: Performance for Deletion      (GOOD SOLUTION)
//            Q9.evaluateArrayList();                                                                             //perform operations on arraylist and print results
//            System.out.println();
//            Q9.evaluateLinkedList();                                                                            //perform operations on linkedlist and print results

        //10. CopyOnWriteArrayList: Thread-Safe List
//            String[] groceries = {"artichoke","bacon","cheese","donut","eggs","fish","granola","ham","ice","jelly"};   //input array
//            Q10 q10 = new Q10(groceries);                                                                       //pass argument to constructor
//            q10.threadSafeIteration();                                                                          //call method
    }
}