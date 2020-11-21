package com.csmithswim;

public class ThreadDemo {
    public static void show() {
        Thread thread = new THread(new DownloadFileTask());
        thread.start();

        try {
            //Tells the current thread to wait for the current thread to finish its processes
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("File is ready to be scanned.");

        //Printing the main thread, each thread has a name and an ID
        System.out.println(Thread.currentThread().getName());

        //Simulating downloading ten files concurrently
        for (var i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }

    }

}
