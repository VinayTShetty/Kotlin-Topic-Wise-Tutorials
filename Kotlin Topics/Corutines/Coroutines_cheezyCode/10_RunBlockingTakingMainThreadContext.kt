import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main(args: Array<String>) {
    runBlocking {
        println("RunBlocking Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
        GlobalScope.launch {
            println("Thread Name= ${Thread.currentThread().name} Thread Name= ${Thread.currentThread().id}")
        }
    }


    Thread.sleep(1000)
}

/**
 * runBlocking{} will take the Parent Thread Context.
 * In this example It has taken Main Thread.
 *
 *  Note :- Inside the GloabalScope.launc{} It will create a Coroutine on the new Thread
 */