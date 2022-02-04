package Android_generic

open class Empolyee

class VicePresident: Empolyee()

class Manager: Empolyee()

class Company<T> (val empolyee: T)

fun main() {
    val data1 = Company(VicePresident())
    val data2 = Company(Manager())
    val data3 = Company(Manager())
    val data4 = Company(Manager())
}