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
            /**
             * launch coroutine is present under parent runBlocking coroutine,so it will take parent inherited Thread.i.e runBlocking inherited Thread.
             */
            println("launch Function Thread Name= "+Thread.currentThread().name)
        }
    }
}