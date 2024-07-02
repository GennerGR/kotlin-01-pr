fun main () {

    fun ex1 () {
        var button = "X"

        println(
            // Write your code here
        )

        val result = when (button) {
            "A" -> "YES"
            "B" -> "NO"
            "X" -> "Menu"
            "Y" ->  "Nothing"
            else -> "There is no such button"
        }
        println(result)
    }
    //ex1()

    println("siguiente ejercicio aqui")
    println("---------------------------------------------------------------------------------------")

//Tienes un programa que cuenta porciones de pizza hasta que quede una pizza entera con 8 porciones.
//Refactorice este programa de dos maneras:
//loop with : while and do-while


    fun ex2_1 () {
        var pizzaSlices = 1
        // Start refactoring here
        while (pizzaSlices < 8) {
            println("There's only $pizzaSlices slice/s of pizza :(")
            pizzaSlices++
        }
        // End refactoring here
        println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
    }
   // ex2_1()

    println("---------------------------------------")

    fun ex2_2 () {

        var pizzaSlices = 10

        do {
            println("There's only $pizzaSlices slice/s of pizza :(")
            pizzaSlices++
        } while (pizzaSlices < 8)

        println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
    }
    //ex2_2()
    println("----------------------------------------------------------------")

    //Escriba un programa que simule el juego de  Fizzbuzz .
    //Su tarea es imprimir números del 1 al 100 de forma incremental
    //Cualquier número divisible por 3 y 5 debe reemplazarse con la palabra "fizzbuzz".

    fun ex3 () {

        for (numero in 1..100) {
            when {
                numero % 3 == 0 -> println("fizz")
                numero % 5 == 0 -> println("buzz")
                else -> println(numero)
            }
        }
    }
    //ex3()

    //You have a list of words. Use for and if to print only the words that start with the letter l.
    println("----------------------------------------------------------------")

    fun ex4() {
        val words : MutableList<String> = mutableListOf("dinosaur", "limousine", "magazine", "language")
        // Write your code here
        for (getWords in words) {
            //println(getWords)

            if (getWords.startsWith("l")) {
                println(getWords)
            }
        }
    }
    ex4()
}
















