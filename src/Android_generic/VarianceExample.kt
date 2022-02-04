package Android_generic

abstract class Vehicle(wheel: Int)

class Car(speed: Int): Vehicle(4)

class Motocycle(speed: Int): Vehicle(2)

fun main() {
    val car = Car(200)
    val motocycle = Motocycle(70)
    var vehicle: Vehicle = car
    vehicle = motocycle
}