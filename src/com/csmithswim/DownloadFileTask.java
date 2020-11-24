package com.csmithswim;

public class DownloadFileTask implements Runnable{
    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file "+Thread.currentThread().getName());

        //Simulating a scenario where each file is 10000 bytes
        for (var i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
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
