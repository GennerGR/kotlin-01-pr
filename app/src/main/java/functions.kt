import kotlin.math.PI


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

//Funciones lamba (funciones flecha)

fun uppercaseString(text: String): String {
    return text.uppercase()
}

fun principalTwo () {
    println(uppercaseString("heLlo"))
}

fun main() {
    println(circleAreaR(2))
    println(circleArea(2))

    principal()

    principalTwo()

    //funcion lambda / flecha
    println("------------------------------")

    //println({text : String, other : Int -> text.uppercase(); other} ("hola", 5))

    var funcionfl = {text : String, other : Int -> text.uppercase() + other}

    print(funcionfl("hola ", 5))
    println("--------------------------------------------")

    passToAnotherFunction()
}

fun passToAnotherFunction () {
    var numeros = listOf(1 , -2 , 3 , -4 , 5 , -6)

    var positivos = numeros.filter{x -> x > 0}
    var negativos = numeros.filter{x -> x < 0}
    println("numeros postivos $positivos numeros negativos $negativos")

}















