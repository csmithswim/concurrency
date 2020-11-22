package com.csmithswim;

public class DownloadFileTask implements Runnable{
   @Override
    public void run() {
        System.out.println("Downloading a file "+Thread.currentThread().getName());

        for (var i = 0; i < Integer.MAX_VALUE; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            System.out.println("Downloading byte " + i);
        }
       System.out.println("Download complete: " + Thread.currentThread().getName());

       //Suspends a thread by a rough amount of milli seconds
//       try {
//           Thread.sleep(5000);
//       } catch (InterruptedException e) {
//           e.printStackTrace();
//       }

   }

}
