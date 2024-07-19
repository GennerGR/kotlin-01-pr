package sintaxis

fun main () {
    fun ex1 () {

        val greenNumbers : List<Int> = listOf(1, 4, 23)
        val redNumbers : List<Int> = listOf(17, 2)

        val totalNumbers = greenNumbers.count() + redNumbers.count()

        println(totalNumbers)

    }
    ex1()

    fun ex2() {
        val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
        val requested = "smtp"
        val isSupported = requested.uppercase() in SUPPORTED
            println("Support for $requested: $isSupported")
    }
    ex2()

    fun ex3() {
        val number2word = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
        val n = 2
        println("$n is spelt as '${number2word[n]}'")
    }
    ex3()
}
 //comentent

    



