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
    ex1()

//Tienes un programa que cuenta porciones de pizza hasta que quede una pizza entera con 8 porciones.
//Refactorice este programa de dos maneras:
//loop while and do-while


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
    ex2_1()


    fun ex2_2 () {
        var pizzaSlices = 0


    }
    ex2_2()
}








