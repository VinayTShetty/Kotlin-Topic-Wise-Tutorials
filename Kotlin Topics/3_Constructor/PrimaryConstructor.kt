Date 19/02/2024
Topics Name =  Constructor
Topics link = 
Topics Additional Information :- 

A class in Kotlin can have a primary constructor and one or more secondary constructors.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-1
 
Notes :- 

The primary constructor is a part of the class header, and it goes after the class name and optional type parameters
 
Additional Information :- 
 
Programe :-
fun main(){
    println("Hello World")
}

class Demo constructor(){}

 
Output :
Hello World
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-2
 
Notes :- Primary constructor can have zero arguments
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-3
 
Notes :- 
If the primary constructor does not have any annotations or visibility modifiers, the constructor keyword can be omitted
 
Additional Information :- 
 
Programe :-
fun main(){
    print("constructor key Omitted")
}
class Demo (userName:String){
}
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-4
 
Notes :- 
The primary constructor cannot contain any code. Initialization code can be placed in initializer blocks prefixed with the init keyword 

Additional Information :- 
 
Programe :-

fun main(){
    val demoInstance=Demo("Vinay T Shetty")
}
class Demo (userName:String){
    init {
        println("DisplayName= ${userName}")
    }
}

 
Output :
DisplayName= Vinay T Shetty
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-5
 
Notes :- 

Primary constructor parameters can be used in the initializer blocks. They can also be used in property initializers declared in the class body
 
Additional Information :- 
 
Programe :-

fun main(){
    val demoInstance=Demo_test("Vinay T Shetty")
    demoInstance.callme()
}
class Demo (userName:String){
    val displayname=userName
    init {
        println("DisplayName= ${displayname}")
    }
    fun displayuserName(){
        println("Display Username=${displayname}")
    }
}
 
Output :
 
DisplayName= Vinay T Shetty
Display Username=Vinay T Shetty
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-6
 
Notes :- 
Primary Constructor Parameters are always local Variable to constructor. Primary Constructor values cannot be used directly inside the method.

Additional Information :- 
 
Programe :-
fun main(){
    val demoInstance=Demo("Vinay T Shetty")
    demoInstance.displayuserName()
}
class Demo (userName:String){
    fun displayuserName(){
        println("Display Username=${displayname}")
    }
}

 
Output :
e: D:\KotlinWorkSpace\KotlinCode\src\main\kotlin\test.kt: (7, 37): Unresolved reference: displayname

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-7
 
Notes :- 
Default Values can be provided to constructor.

Additional Information :- 
 
Programe :-
fun main(){
    val demoInstance=Demo(true)
    demoInstance.dispalyValues()
}
class Demo (authenticagted:Boolean=true){
    init {
        println("Init Block User Authenicagted ${authenticagted}")
    }
    val disAuthenicagted=authenticagted
    fun dispalyValues(){
        print("Authenicated= ${disAuthenicagted}")
    }
}
 
 
Output :
Init Block User Authenicagted true
Authenicated= true
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-8
 
Notes :- 

We can provide both val and var values to the constructor parameter

Additional Information :- 
 
Programe :-
fun main(){
    val demoInstanceVal=DemoVal("Vinay T Shetty")
    val demoInstanceVar=DemoVar("Vinay")
}
class DemoVal (val userName:String){}
class DemoVar(var userName:String){}
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-9
 
Notes :- init Block will be executed based on written order.
 
Additional Information :- 
 
Programe :-
fun main() {
    val demoInst=Demo("Vinay T Shetty")
    demoInst.displayName()
}

class Demo(username: String) {
    val dispUsername = username
    init {
        println("Frist Intialize Block")
    }
    init {
        println("Second Intialize Block")
    }
    fun displayName(){
        println("Name= ${dispUsername}")
    }
}

 
Output :
 
Frist Intialize Block
Second Intialize Block
Name= Vinay T Shetty
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-10
 
Notes :- 
 
init block will be executed for each object creation.

Additional Information :- 
 
Programe :-

fun main() {
    val demoInst=Demo()
}
class Demo() {
    init {
        println("Intialize Block")
    }
}
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-11
 
Notes :- 
 
Additional Information :- 
 
Programe :-
fun main() {
    val demoInst=Demo()
    val demoInst_1=Demo()
    val demoInst_2=Demo()
    val demoInst_3=Demo()
}
class Demo() {
    init {
        println("Intialize Block")
    }
}
 
 
Output :
Intialize Block
Intialize Block
Intialize Block
Intialize Block

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-12
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-13
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-14
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-15
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-16
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-17
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-18
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-19
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-20
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-21
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-22
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-23
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-24
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-25
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-26
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-27
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-28
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-29
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-30
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-31
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-32
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-33
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-34
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-35
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-36
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-37
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-38
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-39
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-40
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-41
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-42
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-43
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-44
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-45
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-46
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-47
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-48
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-49
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-50
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-51
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-52
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-53
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-54
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-55
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-56
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-57
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-58
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-59
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-60
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-61
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-62
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-63
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-64
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-65
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-66
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-67
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-68
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-69
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-70
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-71
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-72
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-73
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-74
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-75
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-76
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-77
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-78
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-79
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-80
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-81
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-82
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-83
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-84
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-85
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-86
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-87
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-88
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-89
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-90
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-91
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-92
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-93
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-94
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-95
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-96
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-97
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-98
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-99
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
Example :-100
 
Notes :- 
 
Additional Information :- 
 
Programe :-
 
 
Output :
 
 
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
