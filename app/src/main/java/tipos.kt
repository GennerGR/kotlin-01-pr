fun main () {
    var customers = 10

    customers = 8

    customers = customers + 3
    customers += 7
    customers -= 3
    customers *= 2
    customers /= 3

    println("el numero de clientes al final es $customers")
    println()
    println("el numero es $d y el texto es '$e'")

    ex3 ()
}

const val d: Int = 0

const val e: String = "hello android"

fun ex3 (){
        val a: Int = 1000
        val b: String = "log message"
        val c: Double = 3.14
        val d: Long = 100_000_000_000_000
        val e: Boolean = false
        val f: Char = '\n'

    println(" Variable de tipo numero: $a" +
            " Variable de tipo texto: $b" +
            " Variable de tipo decimal: $c" +
            " Variable de tipo rango: $d" +
            " Variable de tipo boleano: $e" +
            " Variable de tipo caracter: $f")
}