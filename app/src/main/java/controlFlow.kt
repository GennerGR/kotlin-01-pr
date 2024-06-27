fun main () {

    var d : Int
    val obj = "2"
    val check = true
    val cakes = listOf("carrot", "cheese", "chocolate")

    //if

    if (check) {
        d = 3
    } else {
        d = 2
    }
    println(d)

    //when

    var result = when (obj) {
        "2" -> "dos"
        "hola" -> "saludo"
        else -> "desconocido"
    }
    println(result)

    //example : when

    val objeto = "Hello"

    val res = when (objeto) {
        //Si es igual a "1", establece el resultado en "One"
        "1" -> "One"
        // If obj equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println(res)

    //ranges

    //..operator, for example : 1..5 = 1, 2, 3, 4, 5 and for skip the last number: 1..<5 = 1, 2, 3, 4
    //to declare a range in reverse form : 1 downTo 5  = 5, 4, 3, 2, 1
    //use step and the value increment that need you

    //for

    for (number in 1..5) {
        // number is the iterator and 1..5 is the range
        print(number)
    }

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

    //while

    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten
    }
    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)

}





