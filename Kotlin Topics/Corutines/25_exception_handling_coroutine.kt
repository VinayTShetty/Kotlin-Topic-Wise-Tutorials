import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.*
fun main(args: Array<String>) {
   val job:Job=GlobalScope.launch {
       try {
           println("Try Block "+Thread.currentThread().name)
           delay(1000)
       }catch (ex:Exception){
           println("Catch Block "+Thread.currentThread().name)
       }finally {
           println("Finally Block "+Thread.currentThread().name)
       }
   }
    job.cancel()
    Thread.sleep(2000)
}
/**
 * An Exception will be Raised when ever we are trying to cancel the Coroutine.Which can be handled using try-catch-block.
 * All the suspending function such as delay(),yield() which is co-operative ,will cause the cancellation exception.
 */

 //---------------------------------------------------------------------------------------------------------------------------------------

 /**
 *  Using yield() function.
 */
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.*
fun main(args: Array<String>) {
   val job:Job=GlobalScope.launch {
       try {
           println("Try Block "+Thread.currentThread().name)
           yield()
       }catch (ex:Exception){
           println("Catch Block "+Thread.currentThread().name)
       }finally {
           println("Finally Block "+Thread.currentThread().name)
       }
   }
    job.cancel()
    Thread.sleep(2000)
}

//---------------------------------------------------------------------------------------------------------------------------------------
 /**
 * 1) We cannot execute suspending function from finally() block.Because the Coroutine running the code was already cancelled.
 * 2) If we want to execute the suspending function from finally() block then,wrap the code with  ' withContext(NonCancellable) '
 */

 import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.*
fun main(args: Array<String>) {
   val job:Job=GlobalScope.launch {
       try {
           delay(500)
           println("Try Block "+Thread.currentThread().name)
       }catch (ex:Exception){
           println("Catch Block "+Thread.currentThread().name)
       }finally {
           delay(500)
           println("Finally Block "+Thread.currentThread().name)
       }
   }
    job.cancel()
    Thread.sleep(2000)
}

/**
 * In this example the finally block won t be executed.
 * Bcoz we are creating another exception in finally block.
 * And the Exception handliing code is already executed.
 */

//---------------------------------------------------------------------------------------------------------------------------------------

/**
 Using withContext(NonCancellable)
 */

 import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.*
fun main(args: Array<String>) {
   val job:Job=GlobalScope.launch {
       try {
           delay(500)
           println("Try Block "+Thread.currentThread().name)
       }catch (ex:Exception){
           println("Catch Block "+Thread.currentThread().name)
       }finally {
           withContext(NonCancellable){
               delay(500)
           }
           println("Finally Block "+Thread.currentThread().name)
       }
   }
    job.cancel()
    Thread.sleep(2000)
}

/**
 * In this example the finally block won t be executed.
 * Bcoz we are creating another exception in finally block.
 * And the Exception handliing code is already executed.
 */

//---------------------------------------------------------------------------------------------------------------------------------------

/**
 * 
 * Customize the message in Corutine cancellation.
 */

 import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.*
fun main(args: Array<String>) {
   val job:Job=GlobalScope.launch {
       try {
           delay(500)
           println("Try Block "+Thread.currentThread().name)
       }catch (ex:Exception){
           println("Catch Block Message= "+ex.message+Thread.currentThread().name)
       }finally {
           println("Finally Block "+Thread.currentThread().name)
       }
   }
    job.cancel("Customize Cancel Exception Message")
    Thread.sleep(2000)
}
//---------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------------
