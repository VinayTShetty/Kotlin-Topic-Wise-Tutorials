import kotlinx.coroutines.*
fun main() {
    println("Main thread starts Thread Name= "+Thread.currentThread().name)
    GlobalScope.launch {
        launch {
            println("Inside runBlocking Thread Name= "+Thread.currentThread().name)
            delay(1000) // This is a suspending function that doesn't block the thread
            println("Coroutine is finished")
        }

        println("Coroutine is launched")
    }

    println("Main thread ends")
    println("Main thread starts Thread Name= "+Thread.currentThread().name)
}

/**
 * In this example , the main thread won t wait for other Coroutines to finish.
 */