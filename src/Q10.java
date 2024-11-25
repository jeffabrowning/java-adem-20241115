//10. CopyOnWriteArrayList: Thread-Safe List
//Question: Use a CopyOnWriteArrayList for thread-safe iteration while modifying the list in a multithreaded environment.

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q10 {

    //fields:
    String[] groceries;
    CopyOnWriteArrayList<String> safeGroceries = new CopyOnWriteArrayList<>();

    //constructor;
    public Q10(String[] groceries) {
        this.groceries = groceries;
    }

    //methods: test copyOnWriteArray with multiple readers & writers
    public void threadSafeIteration() throws InterruptedException {

        //populate copyonwritearraylist
        safeGroceries.addAll(List.of(groceries));

        //create 3 reader threads
        Thread reader1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Reader1 sees = " + safeGroceries);
            }
        });

        Thread reader2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Reader2 sees = " + safeGroceries);
            }
        });

        Thread reader3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Reader3 sees = " + safeGroceries);
            }
        });

        //create 3 writer threads
        Thread writer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Writer1 sets index 2 = kielbasa");
                safeGroceries.set(2,"kielbasa");
            }
        });

        Thread writer1clone = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Writer1clone sets index 2 = pasta");
                safeGroceries.set(2,"pasta");
            }
        });

        Thread writer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Writer2 adds at index 4 = lime");
                safeGroceries.add(4,"lime");
            }
        });

        Thread writer3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Writer3 removes index 6");
                safeGroceries.remove(6);
            }
        });

        //initial display & start threads
        System.out.println("All threads are started. Initial list = " + safeGroceries);
        reader1.start();
        reader2.start();
        reader3.start();
        writer1.start();
        writer1clone.start();
        writer2.start();
        writer3.start();

        //final display
        reader1.join();
        reader2.join();
        reader3.join();
        writer1clone.join();
        writer2.join();
        writer3.join();
        System.out.println("All threads are complete. Final list = " + safeGroceries);
    }
}
