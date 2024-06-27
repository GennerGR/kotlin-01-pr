fun main () {
    println(mapita)
    println(list1)
    println(shapes)
    println("elejimos solo un elemento de la lista: ${numbers[0]}")
    println("cantidad de elementos de la lista: ${numbers.count()}")
    println("Los elementos del conjutno son $conjuntos")

    mapaMuteable.put("sandia", 33)

    println("para agregar algun elemento a la lista use 'add.()' y para eliminar algun elemento de la lista use 'remove.()'")
    println("agregando nuevos elementos al map:_ $mapaMuteable")
    println("imprimir solo las claves ${mapaMuteable.keys}")
}

var mapita: Map<String, Int> = mapOf("manzanas" to 400, "peras" to 200)

var list1: List<String> = mutableListOf("object_1", "object_2", "object_3", "object_4", "object_5")

val shapes: MutableList<String> = mutableListOf("object_01", "objeto_01", "object_02", "object_03")

val numbers: List<Int> = mutableListOf(1, 2, 3)

val conjuntos: MutableSet<String> = mutableSetOf("manzana", "manzana", "pera", "naranja")

val mapaMuteable : MutableMap<String, Int> = mutableMapOf("manzanas" to 400, "bsnsnss" to 150, "peras" to 230)














