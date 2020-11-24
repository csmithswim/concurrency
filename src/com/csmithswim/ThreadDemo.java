package com.csmithswim;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show() {
    var status = new DownloadStatus();

    /*
    Starting ten download threads and sharing a single status object across the threads.
    Once all the threads are complete it will print the total downloads.
    In order to join all the threads we need to start them all simultaneously
    */
        List<Thread> threads = new ArrayList<>();
        for(var i = 0; i <10; i++){
        var thread = new Thread(new DownloadFileTask(status));
        thread.start();
        threads.add(thread);
    }
        //For loop that iterates over all the threads and joins them
        for( var thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(status.getTotalBytes());
}

    //How to cancel a thread after 1 second
//    Thread thread = new Thread(new DownloadFileTask());
//        thread.start();

    //
//        try {
//        Thread.sleep(1000);
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    }

    //Sends an interrupt request to the thread, it is up to the thread to decide what it is doing.
//        thread.interrupt();
}

//        try {
            //Tells the current thread to wait for the current thread to finish its processes
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        System.out.println("File is ready to be scanned.");

        //Printing the main thread, each thread has a name and an ID
//        System.out.println(Thread.currentThread().getName());

        //Simulating downloading ten files concurrently
//        for (var i = 0; i < 10; i++) {
//            Thread thread = new Thread(new DownloadFileTask());
//            thread.start();
//        }
