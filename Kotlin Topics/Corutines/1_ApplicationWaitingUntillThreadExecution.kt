In case of Threads the application will wait untill all the Thread execution is finished.

Programe
********

import kotlin.concurrent.thread

fun main(args: Array<String>) {
   println("Main Program Starts Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
   /**
    * Creates a background Thread , the thread function is a lambda fucntion.
    */
   thread {
      println("Fake Work Started Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
      Thread.sleep(1000) // Sleep the Thread for 1 seconds
      println("Fake Work Ended Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
   }
   println("Main Program Ends Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
}


/**
 The Background Thread and Main Thread are Runnning in Parallel/Concurrently.
 Background Thread is not Blocking the main Thread.

 Note:- Application waited untill the Worker Thread finishes the execution.
 Then the application was ended.( Process finished with exit code 0)

 In case of threads the Application will wait untill all the Thread finishes the job

 As we can see from the output 
 Process finished with exit code 0
*/
*****************************************************************************************************************************************
