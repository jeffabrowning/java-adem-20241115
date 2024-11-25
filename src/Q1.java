//1. ArrayList: Add and Access Elements
//Question: Create an ArrayList to store names of cities. Add five cities and retrieve the third city in the list.

import java.util.ArrayList;
import java.util.List;

public class Q1 {

    //fields:
    ArrayList<String> cities = new ArrayList<>();


    //constructor:                                                                      //not required because fields are passed directly to methods


    //methods:

    //add elements via individual string inputs--for smaller/known number of elements
    public void addIndividualElements(String string1, String string2, String string3, String string4, String string5) {

        cities.add(string1);                                                            //use simple add method for each element
        cities.add(string2);
        cities.add(string3);
        cities.add(string4);
        cities.add(string5);
    }

    //add elements via array of string inputs--for larger/unknown number of elements
    public void addElementsAsList(String[] input) {

        cities.addAll(List.of(input));                                                  //use addAll method once for array created from strings with List.of method
    }

    //access specified element
    public void accessElement(int position) {

        String element = cities.get(position - 1);                                      //retrieve element from specified index with get method
        System.out.println("Cities = " + cities);                                       //print arraylist contents and retrieve specified element
        System.out.println("Element at position " + position + " is " + element + ".");
    }
}
