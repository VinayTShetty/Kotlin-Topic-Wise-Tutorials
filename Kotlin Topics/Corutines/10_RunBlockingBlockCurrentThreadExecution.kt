import kotlinx.coroutines.*
fun main() {
    println("Main thread starts Thread Name= "+Thread.currentThread().name)
    runBlocking {
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
 * runBlocking will block the current Thread execution,untill the coroutine is executed.
   
   runBlocking will create a new Coroutine.
   This coroutine will block the current Thread , In which its operating.

 */