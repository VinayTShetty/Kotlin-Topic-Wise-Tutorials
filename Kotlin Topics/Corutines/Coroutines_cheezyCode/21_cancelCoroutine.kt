/**
 *  Coroutine Cancellation

 1) No longer needs result/Too long to perform the task we can cancel it.
 2)To cancel the coroutine ,It should be co-operative.
 3)To cancel the coroutine we need to call the cancel() on the job object.
 4)If the Coroutine is co-operative then it will gets cancelled.If the coroutine is not co-operative it won t get cancelled.
 5)It will continue to operate in the usual manner.


 join () and cancel()
 ********************
 1)If the coroutine is not cancelled ,then join() function will wait till coroutines fininsh all the task.
 2)join() and cancel() function are so used frequently,that s it s so common.,We have a separate function for this.i.e job.cancelAndJoin();
 3)job.cancelAndJoin() ,If the Coroutine is Co-operative then it will cancel() ,If not it will wait  to finish all the task of the coroutine.
 */

//-----------------------------------------------------------------------------------------------------------
/**
 * Case 1 
   Print 1-50 and join() function will wait untill all the coroutines are finished.
 */

 import kotlinx.coroutines.*
fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    val job: Job = launch {
        for (i in 0..50) {
            println(i)
        }
    }
    /**
     * wait untill all the coroutines are finished.
     */
    job.join()
    println("Main Program Ends : ${Thread.currentThread().name}")
}
//------------------------------------------------------------------------------------------------------------------------

/**
Case 2:-
Puroposely Making a delay 
 */
 import kotlinx.coroutines.*
fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    val job: Job = launch {
        for (i in 0..50) {
            /**
             * Purposely making the delay
             */
            Thread.sleep(100)
            println(i)
        }
    }
    /**
     * wait untill all the coroutines are finished.
     */
    job.join()
    println("Main Program Ends : ${Thread.currentThread().name}")
}

//------------------------------------------------------------------------------------------------------------------------
/**
Case 3:- 
 This will not cancel the launch coroutine.
 Becasue , Inside the launch coroutine we are not using any coroutine which is co-operatinve. 
 */
import kotlinx.coroutines.*
fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    val job: Job = launch {
        for (i in 0..50) {
            /**
             * Purposely making the delay
             */
            Thread.sleep(100)
            println(i)
        }
    }
    /**
     * To delay the coroutine from the runBlocking{} scope.
     */
    delay(100)
    /**
     * This will cancel the coroutine immediately.
     * To avoid it , using delay(100) above
     */
    job.cancel()
    /**
     * wait untill all the coroutines are finished.
     */
    job.join()
    println("Main Program Ends : ${Thread.currentThread().name}")
}
//------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*
fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    val job: Job = launch {
        for (i in 0..50) {
            /**
             * Making the coroutine cooperative using functions() form Kotlin.* packages.
             */
            delay(50)
            println(i)
        }
    }
    /**
     * To delay the coroutine from the runBlocking{} scope.
     * If this is not there then,It will be difficult to mimic the cancel() function.
     */
    delay(200)
    /**
     * This will cancel the coroutine immediately.
     * To avoid it , using delay(100) above
     */
    job.cancel()
    /**
     * wait untill all the coroutines are finished.
     */
    job.join()
    println("Main Program Ends : ${Thread.currentThread().name}")
}
//------------------------------------------------------------------------------------------------------------------------

import kotlinx.coroutines.*
fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    val job: Job = launch {
        for (i in 0..50) {
            /**
             * Making the coroutine cooperative using functions() form Kotlin.* packages.
             */
            delay(50)
            println(i)
        }
    }
    /**
     * To delay the coroutine from the runBlocking{} scope.
     * If this is not there then,It will be difficult to mimic the cancel() function.
     */
    delay(200)
    /**
     * This will cancel the coroutine() in the launch scope.
     */
    job.cancelAndJoin()
    println("Main Program Ends : ${Thread.currentThread().name}")
}
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------