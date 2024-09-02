/**
  This will show the estimation of the time taken in the code.
  From the Code It can be observed that,It s running in sequential(i.e one after the other)
 */
 import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    val time= measureTimeMillis {
        /*
          Code is executed sequentially one after the other.
         */
        val msgone=getmessgeOne()
        val msgtwo=getmessgeTwo()
        println(""+msgone+" "+msgtwo)
    }
    println("Time :"+time)
    println("Main Program Ends : ${Thread.currentThread().name}")
}

suspend fun getmessgeOne():String{
    delay(1000)
    return "Messsage 1"
}

suspend fun getmessgeTwo():String{
    delay(1000)
    return "Messsage 2"
}

C:\Users\vinayts\.jdks\corretto-1.8.0_312\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\lib\idea_rt.jar=51358:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\charsets.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\access-bridge-64.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\cldrdata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\dnsns.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jaccess.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jfxrt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\localedata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\nashorn.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunec.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunjce_provider.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunmscapi.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunpkcs11.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\zipfs.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jce.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfr.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfxswt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jsse.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\management-agent.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\resources.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\rt.jar;D:\Tutorials\KotlinTutorials\KotlinProject\target\classes;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.5.10\kotlin-stdlib-jdk8-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.5.10\kotlin-stdlib-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.5.10\kotlin-stdlib-common-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.5.10\kotlin-stdlib-jdk7-1.5.10.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-android-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-core-jvm-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-common-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk8-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\annotations-13.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk7-1.6.0.jar MainKt
Main Program Starts : main
Messsage 1 Messsage 2
Time :2031
Main Program Ends : main

Process finished with exit code 0
//---------------------------------------------------------------------------------------------------------------------------
/*
 Achieving parallel/concurrency execution using async / launch function.
 */
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    val time= measureTimeMillis {
        /**
         * Creates a Child coroutine.Within the scope of the runBlocking coroutine.
         * This async funciton return a defered Object.
         * Using launch also we can achieve concurrency/parallel . But launch does nt return anything.
         */
        val msgone:Deferred<String> =async { getmessgeOne()}
        val msgtwo:Deferred<String> =async { getmessgeTwo()}
        /**
         * Get the result from the async function.
         */
        println(""+msgone.await()+" "+msgtwo.await())
    }
    println("Time :"+time)
    println("Main Program Ends : ${Thread.currentThread().name}")
}

suspend fun getmessgeOne():String{
    delay(1000)
    return "Messsage 1"
}

suspend fun getmessgeTwo():String{
    delay(1000)
    return "Messsage 2"
}

/**
 * 
 * 
 * The below example msgone and msgtwo are getting executed even its not used. This can be avoided by using Lazy.See next example.
 */
//---------------------------------------------------------------------------------------------------------------------------
/**
  Lazy starting a coroutine in Kotlin.
  Do not execute the coroutine , if the corresponding coroutine value is not used anywhere in the programe.
 */

import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    /**
     * The value i.e msgone and msgtwo is never used hence the corresponding coroutine won t be executed.
     */
    val msgone: Deferred<String> = async(start = CoroutineStart.LAZY) { getmessgeOne() }
    val msgtwo: Deferred<String> = async(start = CoroutineStart.LAZY) { getmessgeTwo() }
    println("Main Program Ends : ${Thread.currentThread().name}")
}

suspend fun getmessgeOne(): String {
    delay(1000)
    println("Coroutine Message 1")
    return "Messsage 1"
}

suspend fun getmessgeTwo(): String {
    delay(1000)
    println("Coroutine Message 2")
    return "Messsage 2"
}
/**
    From the output we can see that,
    Process is not getting closed.
    its still running 
 */
C:\Users\vinayts\.jdks\corretto-1.8.0_312\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\lib\idea_rt.jar=51724:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\charsets.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\access-bridge-64.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\cldrdata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\dnsns.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jaccess.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jfxrt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\localedata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\nashorn.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunec.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunjce_provider.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunmscapi.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunpkcs11.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\zipfs.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jce.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfr.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfxswt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jsse.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\management-agent.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\resources.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\rt.jar;D:\Tutorials\KotlinTutorials\KotlinProject\target\classes;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.5.10\kotlin-stdlib-jdk8-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.5.10\kotlin-stdlib-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.5.10\kotlin-stdlib-common-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.5.10\kotlin-stdlib-jdk7-1.5.10.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-android-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-core-jvm-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-common-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk8-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\annotations-13.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk7-1.6.0.jar MainKt
Main Program Starts : main
Main Program Ends : main


//---------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {
    println("Main Program Starts : ${Thread.currentThread().name}")
    val msgone: Deferred<String> = async(start = CoroutineStart.LAZY) { getmessgeOne() }
    val msgtwo: Deferred<String> = async(start = CoroutineStart.LAZY) { getmessgeTwo() }
    /**
     * The coroutine values i.e msgone and msgtwo are used.
     */
     println(""+msgone.await()+" "+msgtwo.await())
    println("Main Program Ends : ${Thread.currentThread().name}")
}

suspend fun getmessgeOne(): String {
    delay(1000)
    println("Coroutine Message 1")
    return "Messsage 1"
}

suspend fun getmessgeTwo(): String {
    delay(1000)
    println("Coroutine Message 2")
    return "Messsage 2"
}

C:\Users\vinayts\.jdks\corretto-1.8.0_312\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\lib\idea_rt.jar=51800:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\charsets.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\access-bridge-64.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\cldrdata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\dnsns.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jaccess.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jfxrt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\localedata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\nashorn.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunec.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunjce_provider.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunmscapi.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunpkcs11.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\zipfs.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jce.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfr.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfxswt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jsse.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\management-agent.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\resources.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\rt.jar;D:\Tutorials\KotlinTutorials\KotlinProject\target\classes;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.5.10\kotlin-stdlib-jdk8-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.5.10\kotlin-stdlib-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.5.10\kotlin-stdlib-common-1.5.10.jar;C:\Users\vinayts\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.5.10\kotlin-stdlib-jdk7-1.5.10.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-android-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlinx-coroutines-core-jvm-1.6.1.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-common-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk8-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-1.6.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\annotations-13.0.jar;D:\Tutorials\KotlinTutorials\KotlinProject\lib\kotlin-stdlib-jdk7-1.6.0.jar MainKt
Main Program Starts : main
Coroutine Message 1
Coroutine Message 2
Messsage 1 Messsage 2
Main Program Ends : main

Process finished with exit code 0
//---------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    println("Main Starts ${Thread.currentThread().name} ${Thread.currentThread().id}")
    val measureTime = measureTimeMillis {
        /**
         * This function will check time take to execute the code in the block
         */
        val msgOne = messageOne()
        val msgaTwo = messageTwo()
        println("${msgOne} ${msgaTwo} ")
    }
    println("Time Taken= ${measureTime}")
    println("Main Ends ${Thread.currentThread().name} ${Thread.currentThread().id}")
}

suspend fun messageOne(): String {
    delay(1000)
    return "Hello"
}

suspend fun messageTwo(): String {
    delay(1000)
    return "World"
}

/**
 *  This is executed seqqentially(i.e one after the other).
 */

/**
 * o/p
Main Starts main 1
Hello World
Time Taken= 2032
Main Ends main 1

Process finished with exit code 0
 */
//---------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    println("MainThread Start= ${Thread.currentThread().id}")
    val measureTime = measureTimeMillis {
        val msgOne = async { messageOne() }
        val msgTwo = async { messageTwo() }
        //    println("${msgOne} ${msgTwo}")
    }
    println("Time Measured= ${measureTime}")
    println("MainThread Finish= ${Thread.currentThread().id}")
}

suspend fun messageOne(): String {
    println("Message One Executed")
    delay(1000)
    return "Hello"
}

suspend fun messageTwo(): String {
    println("Message Two Executed")
    delay(1000)
    return "World"
}


/**
 * O/P
MainThread Start= 1
Time Measured= 16
MainThread Finish= 1
Message One Executed
Message Two Executed
 */

/**
 * Here the System resources are getting wasted ,even if we are not using msgOne,msgTwo reference variables.
 * So neeed to avoid it.
 */
 
 //---------------------------------------------------------------------------------------------------------------------------
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    println("MainThread Start= ${Thread.currentThread().id}")
    val measureTime = measureTimeMillis {
        /**
         * start = CoroutineStart.LAZY
         * This will get executed only if the reference variable is used.
         * if the variable msgOne,msgTwo is not used than the corresponding coroutine will not be executed.
         */
        val msgOne = async(start = CoroutineStart.LAZY) { messageOne() }
        val msgTwo = async(start = CoroutineStart.LAZY) { messageTwo() }
        //    println("${msgOne} ${msgTwo}")
    }
    println("Time Measured= ${measureTime}")
    println("MainThread Finish= ${Thread.currentThread().id}")
}

suspend fun messageOne(): String {
    println("Message One Executed")
    delay(1000)
    return "Hello"
}

suspend fun messageTwo(): String {
    println("Message Two Executed")
    delay(1000)
    return "World"
}


/**
 * O/P
MainThread Start= 1
Time Measured= 16
MainThread Finish= 1
Message One Executed
Message Two Executed
 */

/**
 * Here the System resources are getting wasted ,even if we are not using msgOne,msgTwo reference variables.
 * So neeed to avoid it.
 */
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------
