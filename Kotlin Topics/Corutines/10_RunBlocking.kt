import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() { // Execute in MainThread.
    runBlocking { // Creates a Coroutine that blocks the Main Thread.
        println("Thread name ${Thread.currentThread().name}")  // This will execute in Mainthread.
        GlobalScope.launch { // Creates a new Coroutine , on the background Thread. T1 or Some other Thread.
            println("GlobalScope Thread name 1 ${Thread.currentThread().name}") // T1 Thread.
            delay(1000) // Coroutine is suspended T1 is free ,
            println("GlobalScope Thread name 2 ${Thread.currentThread().name}") // Eiether T1 or someother Thread.
        }
        delay(1000) // this is present in the main Thread.So it blocks the Main thread.Untill this coroutine is completed.
        println("Thread name ${Thread.currentThread().name}")  // This will execute in Mainthread.
    }
}



C:\Users\vinayts\.jdks\corretto-1.8.0_312\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\lib\idea_rt.jar=51534:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\charsets.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\access-bridge-64.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\cldrdata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\dnsns.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jaccess.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\jfxrt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\localedata.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\nashorn.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunec.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunjce_provider.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunmscapi.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\sunpkcs11.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\ext\zipfs.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jce.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfr.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jfxswt.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\jsse.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\management-agent.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\resources.jar;C:\Users\vinayts\.jdks\corretto-1.8.0_312\jre\lib\rt.jar;D:\Workspace\kotlincode\build\classes\kotlin\main;C:\Users\vinayts\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-android\1.3.9\df17db5e329363c4e9cc7bf5b661ce3723a3e460\kotlinx-coroutines-android-1.3.9.jar;C:\Users\vinayts\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib\1.7.10\d2abf9e77736acc4450dc4a3f707fa2c10f5099d\kotlin-stdlib-1.7.10.jar;C:\Users\vinayts\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-common\1.7.10\bac80c520d0a9e3f3673bc2658c6ed02ef45a76a\kotlin-stdlib-common-1.7.10.jar;C:\Users\vinayts\.gradle\caches\modules-2\files-2.1\org.jetbrains\annotations\13.0\919f0dfe192fb4e063e7dacadee7f8bb9a2672a9\annotations-13.0.jar;C:\Users\vinayts\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-core-jvm\1.3.9\4be434f5e86c1998a273e7f19a7286440894f0b0\kotlinx-coroutines-core-jvm-1.3.9.jar CheckLogicKt
Thread name main
GlobalScope Thread name 1 DefaultDispatcher-worker-1
Thread name main
GlobalScope Thread name 2 DefaultDispatcher-worker-1

Process finished with exit code 0
