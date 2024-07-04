class Persona(val name: String, var age: Int)


class PersonaTwo(val name: String, var age: Int) {
    fun saludar () {
        println("hola mi nombre es $name y tengo $age años de edad")
    }
}


fun main () {

    var persona = Persona("Ariadna", 21)
    println("nombre: ${persona.name}, edad: ${persona.age}")

    var personaTwo = PersonaTwo("Genner", 17)
    personaTwo.saludar()
}






