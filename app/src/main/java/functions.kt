import kotlin.math.PI

fun circleAreaR(radius: Int): Double {
    return PI * radius * radius
}

fun circleArea(radius: Int): Double = PI * radius * radius

fun main() {
    println(circleAreaR(2))
    println(circleArea(2))

    principal()
}

fun intervalInSeconds(hours: Int, minutes: Int, seconds: Int) =
    ((hours * 60) + minutes) * 60 + seconds

fun principal() {
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(0, 1, 25))
    println(intervalInSeconds(2, 0, 0))
    println(intervalInSeconds(0, 10, 0))
    println(intervalInSeconds(1, 0, 1))
}
