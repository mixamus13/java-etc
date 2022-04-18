package com.mixamus.concarrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConcurrencyThread  implements Runnable{


    @Override
    public void run() {
        go();
    }

    public void go() {
        doMore();
    }

    public void doMore() {
        System.out.println("top o` the stack");
    }
}

class ThreadTester {
    public static void main(String... args) throws InterruptedException {
        Runnable threadJob = new ConcurrencyThread();
        Thread myThread = new Thread(threadJob);
        myThread.start();

        System.out.println("back in main");

        Thread twoThread = new Thread();
        twoThread.start();
        Thread.sleep(10000);

        Thread treeThread = new Thread();
        treeThread.start();
        Collections.synchronizedList(List.of("Mama", "Papa", "Son"));
    }
}

class SyncListMethod {
    public static void main(String... args) {
        List<String> syncCollection = Collections.synchronizedList(Arrays.asList("a", "b", "c"));
        List<String> uppercasedCollection = new ArrayList<>();

        Runnable listOperations = () -> {
            synchronized (syncCollection) {
                syncCollection.forEach((e) -> {
                    uppercasedCollection.add(e.toUpperCase());
                });
            }
        };
        System.out.println("listOperations = " + syncCollection);
    }
}