import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("Main Function Thread Name= "+Thread.currentThread().name)
    runBlocking {
        /**
         * runBlocking will run on the main Thread()
         */
        println("runBlocking Function Thread Name= "+Thread.currentThread().name)
        launch {
            println("launch Function Thread Name_1 = "+Thread.currentThread().name)
            /**
             * launch coroutine is present under parent runBlocking coroutine,so it will take parent inherited Thread.i.e runBlocking inherited Thread.
             */
            delay(1000)
            println("launch Function Thread Name_2 = "+Thread.currentThread().name)
        }
    }
}