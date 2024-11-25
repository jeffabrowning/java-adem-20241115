//3. Vector: Thread-Safe Operations
//Question: Create a Vector to store employee names. Add three names and demonstrate thread-safe access by iterating over the list in a synchronized block.

import java.util.List;
import java.util.Vector;

public class Q3 {

    //fields:
    String[] names;                                                                     //input array of names
    Vector<String> employeeNames = new Vector<>();                                      //new vector for the names
    final Object lock = new Object();                                                   //lock object


    //constructor:
    public Q3(String[] names) {
        this.names = names;
    }


    //methods:
    //stores names to vector; uses one thread to iterate names in a synchronized block, while another thread tries to modify vector
    public void synchronizedIteration() {

    employeeNames.addAll(List.of(names));                                                               //populate vector with names

        //create first thread to iterate vector inside synchronized block;
        //uses override of run method for runnable object as argument to thread object within same class instead of separate runnable-implemented class
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Thread1 started. Initial vector = " + employeeNames);               //thread1 opening display
                System.out.println("Thread1 sleep 3 seconds to allow Thread2 to get started.");
                try {
                    Thread.sleep(3000);                                                           //thread1 pause to let thread2 catch up
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock) {                                                          //synchronized block to lock vector access for duration of block
                    System.out.println("Thread1 wake and begin iterating vector with 3-second pause between elements. Vector lock acquired.");
                    for (int i = 0; i < employeeNames.size(); i++) {                                    //iterates and prints vector, pausing after each element to allow thread2 to try to access
                        System.out.println("Thread1: index " + i + " = " + employeeNames.get(i));
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("Thread1 completed. Vector lock removed. Final vector = " + employeeNames);           //display vector at end, showing thread2 has not completed yet
                }
            }
        });

        //second thread attempts to add an element to vector while thread1 is still iterating it and vector is locked
        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Thread2 started. Initial vector = " + employeeNames);               //thread2 opening display
                System.out.println("Thread2 sleep 5 seconds to allow Thread1 to start iterating.");     //pause to let thread1 beginning synchronized block
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock) {
                    employeeNames.add(1, "Judas");                                             //attempts to element while thread1 sync block in progress; waits until sync block is complete
                    System.out.println("Thread2 wake and insert element at index 1. ");
                    System.out.println("Thread2 completed. Final vector = " + employeeNames);               //display vector at end, showing thread2 successful
                }
            }
        });

        thread1.start();                                                                                //start each thread simultaneously, which calls their run methods specified above
        thread2.start();
    }
}
