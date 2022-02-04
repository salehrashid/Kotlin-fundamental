package Android_generic

//INVARIANT
//class InvariantType<T>(val data: T)

//fun main(){
//    val data1: InvariantType<String> = InvariantType("apa")
//    val data2: InvariantType<Any> = data1
//}

//COVARIANT

//class Covariant<out T>(val data: T){
//    fun data (): T{
//        return data
//    }
//}
//
//fun main() {
//    val covariant: Covariant<String> = Covariant("P")
//    val covariant2: Covariant <Any> = covariant
//    println(covariant2)
//}

//CONTRAVARIANT

//class Contravariant<in T>{
//    fun sayHello(name: T){
//        println("hello $name")
//    }
//}
//
//fun main() {
//    val data1: Contravariant<Any> = Contravariant()
//    val data2: Contravariant<String> = data1
//
//    print(data2.sayHello("saleh"))
//
//}