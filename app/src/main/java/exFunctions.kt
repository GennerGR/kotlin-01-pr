fun sum(x:Int, y:Int): Int{
    return x + y
}

//FUNCIONES DE ORDEN SUPERIOR Y MAPEO DE LISTAS

fun toSecond(time : String): (Int) -> Int = when (time) {
    "hour" -> {value -> value * 3600}
    "minutes" -> {value -> value * 60}
    "seconds" -> {value -> value }
    else -> {value -> value}
}

fun printAll() {
    var timeInMinutes = listOf( 5 , 6 , 8 , 4)
    var min2sec = toSecond("minutes")
    var totalTimeInSeconds = timeInMinutes.map(min2sec).sum()
    println("El tiempo total de los minutos en segundos es $totalTimeInSeconds")
}

fun createUrl() {

    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map{action -> "$prefix $id $prefix"}// Write your code here
    println(urls)
}

//ex2

fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) {
    action()// Write your code here
    }
}

fun main () {
    printAll()
    createUrl()

    //ex2
    repeatN(5) {
        println("hello")
    }
}

















