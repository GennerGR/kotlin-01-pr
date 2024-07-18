class Persona(val name: String, var age: Int)


class PersonaTwo(val name: String, var age: Int) {
    fun saludar () {
        println("hola mi nombre es $name y tengo $age años de edad")
    }
}

class PersonaTree(val name: String, var age: Int) {
    fun delito () {
        println("La persona conocida como $name es acusado de saber que contra un wey de $age de edad")
    }
}



fun main () {

    var persona = Persona("Ariadna", 19)
    println("nombre: ${persona.name}, edad: ${persona.age}")

    var PersonaTwo = PersonaTwo("Genner", 17);
    PersonaTwo.saludar();

    var PersonaTree = PersonaTree("Mario", 63);
    PersonaTree.delito();
}















