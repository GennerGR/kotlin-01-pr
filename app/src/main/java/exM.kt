


fun main() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map{action -> ("$prefix/$id/$action")} // Write your code here

    //println(urls)
    fun repeatN(n: Int, action: () -> Unit) {
        // Write your code here
        for(i in 1..n) {
            action()
        }
    }

    fun <T> pera (item: T, item2: T): MutableList<T> {
        var posi: MutableList<T> = mutableListOf()
        posi.add(item)
        posi.add(item2)
        return posi
    }

    println(pera("Item 1", "item 2"))
    println(pera(1, "afeaaw"))

}

fun nosewee(list: List<String>, prefijo:String, n: Int): MutableList<String> {
    var pepe: MutableList<String>  = mutableListOf();

    for (l in list) {
        pepe.add(prefijo + '/' + n + '/' + l)
    }
    println(pepe)
    return pepe


}





