import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main(args: Array<String>) {
    GlobalScope.launch {
        println("Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")  // Thread T1
        delay(100)
        runBlocking {
            println("RunBlocking Started Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")  // Thread T1
        }
    }
    Thread.sleep(1000)
}

/**
 * runBlocking{} will take the Parent Thread Context.
 * In this example It has taken worker Thread.
 */