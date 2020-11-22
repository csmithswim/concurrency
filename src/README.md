Process - an instance of a program or an application, contains an image of applications code, has some memory and a bunch of other resources.

An OS can operate several processes at the same time. 

A thread - a sequence of instructions, practically speaking a thread is that thing that executes the code.

Web servers can serve several clients at the same time using several threads, i.e. multi threading. 

JVM has what is known as a thread scheduler, the job of this is to decide what threads to run and for how long. 
So if you have more tasks than available threads, the scheduler switches between tasks.  

When we are running multiple processes, i.e. downloading a file, and we want something to run after a file is downloaded it is 
better to join threads.

If a thread is sleeping, and an interrupt request is sent, it throws an exception.




