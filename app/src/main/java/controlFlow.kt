fun main () {

    var d : Int
    val obj = "2"
    val check = true

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

}





