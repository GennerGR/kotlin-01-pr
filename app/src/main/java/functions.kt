// Importaciones
import kotlin.math.PI

// Var's

var numberList = listOf(1 , -2 , 3 , -4 , 5 , -6)

// Lambda

var sum = {x : Int, y : Int -> x + y}

// Function

fun circleAreaR(radius: Int): Double {
    return PI * radius * radius
}

fun circleArea(radius: Int): Double = PI * radius * radius

fun intervalInSeconds(hours: Int, minutes: Int, seconds: Int) =
    ((hours * 60) + minutes) * 60 + seconds

fun principal() {
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(0, 1, 25))
    println(intervalInSeconds(2, 0, 0))
    println(intervalInSeconds(0, 10, 0))
    println(intervalInSeconds(1, 0, 1))
}

// Funciones lamba (funciones flecha)

fun uppercaseString(text: String): String {
    return text.uppercase()
}

fun principalTwo () {
    println(uppercaseString("heLlo"))
}


// Pass to another function

fun passToAnotherFunction () {

    var positive = numberList.filter{x -> x > 0}
    var negative = numberList.filter{x -> x < 0}
    println("numeros postivos $positive numeros negativos $negative")

}

// Map

val doubled = numberList.map{x -> x * 2}
val tripled = numberList.map{x -> x *3}

fun printMap () {
    println(doubled)
    println(tripled)
}

// Function types
var upperCaseString: (String) -> String = {text -> text.uppercase()}

// MAIN FUNCTION

fun main() {

    println(sum(5, 4))
    println("--------------------------------------------")

    println(circleAreaR(2))
    println(circleArea(2))
    println("--------------------------------------------")

    principal()
    println("--------------------------------------------")

    principalTwo()
    println("--------------------------------------------")

     //println({text : String, other : Int -> text.uppercase(); other} ("hola", 5))

    var funcionfl = {text : String, numero : Int -> text.uppercase() + numero}

    println(funcionfl("text ", 5))
    println("--------------------------------------------")

    passToAnotherFunction()
    println("--------------------------------------------")

    printMap()
    println("--------------------------------------------")


    println(upperCaseString("text"))

}















