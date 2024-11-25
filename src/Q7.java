//7. Vector: Dynamic Resizing
//Question: Demonstrate that Vector dynamically resizes by adding 12 elements when the initial capacity is set to 10.

import java.util.List;
import java.util.Vector;

public class Q7 {

    //fields:
    String[] stringArray;                                                               //input string array
    Vector<String> stringVector = new Vector<>(10);                         //new empty vector with capacity 10


    //constructor:
    public Q7(String[] stringArray) {
        this.stringArray = stringArray;
    }


    //methods:
    public void dynamicallyResizeVector() {

        //display initial vector information
        System.out.println("Original vector = " + stringVector);                            //print original vector contents (empty)
        System.out.println("Original vector capacity = " + stringVector.capacity());        //print initial capacity with capacity method
        System.out.println();

        //add elements and display updated vector information
        stringVector.addAll(List.of(stringArray));                                          //add 12 strings from array to vector
        System.out.println("Updated vector after adding 12 elements = " + stringVector);    //print updated vector contents (12 strings)
        System.out.println("Updated vector capacity = " + stringVector.capacity());         //print updated capacity (should have doubled)
    }
}
