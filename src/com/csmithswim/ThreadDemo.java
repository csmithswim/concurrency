package com.csmithswim;

public class ThreadDemo {
    public static void show() {
        Thread thread = new THread(new DownloadFileTask());
        thread.start();








        //Printing the main thread, each thread has a name and an ID
        System.out.println(Thread.currentThread().getName());

        //Simulating downloading ten files concurrently
        for (var i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }

    }

}
