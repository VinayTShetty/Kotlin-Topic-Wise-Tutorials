import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

import kotlinx.coroutines.*
fun main() {
    // Launching a coroutine
    val job = GlobalScope.launch {
        delay(5000) // Simulating some asynchronous operation
        println("Coroutine completed")
    }
    println("Main thread continuing...")
    runBlocking {
        /**
         * the job.join() is suspend function so it should be used in suspend call,so we are using runBlocikng{}.
         * This join() is used to suspend the current coroutine,untill the job is completed.
         */
        job.join()
        println("Coroutine joined, main thread exiting")
    }
}
