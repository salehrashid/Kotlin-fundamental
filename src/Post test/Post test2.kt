//package `Post test`
//
//class Cat {
//    // Todo hapus komentar yang salah
//    private var mood: Int = 1      // function
//    private var hungry: Int = 0    // function
//    private var energy: Int = 1    // function
//
//    private fun meow() {
//        println("Miaoo,, Meoww,, Miauww")
//    }    // property
//
//    fun sleep() {
//        energy++
//        hungry++
//        println("State of Cat\nMood: $mood\nHungry: $hungry\nEnergy: $energy")
//    }    // property
//}
//
//fun main() {
//    val gury = Cat()   // function
//    gury.play()
//    gury.sleep()       // object
//    gury.meow()
//}

class teacher(val nama: String, val jam: Int, val mapel: String){
    fun mengajar(){
        println("$nama mengajar di jam $jam pada mata pelajaran $mapel")
    }
}

class teacher2(val nama: String, val jam: Int, val mapel: String){
    fun mengajar2(){
        println("$nama mengajar di jam $jam pada mata pelajaran $mapel")
    }
}

class teacher3(val nama: String, val jam: Int, val mapel: String){
    fun mengajar3(){
        println("$nama mengajar di jam $jam pada mata pelajaran $mapel")
    }
}

class teacher4(val nama: String, val jam: Int, val mapel: String){
    fun mengajar4(){
        println("$nama mengajar di jam $jam pada mata pelajaran $mapel")
    }
}

fun main() {
    val guru = teacher("nugroho", 10, "android")
    guru.mengajar()

    val guru2 = teacher2("ucil", 12, "ct")
    guru2.mengajar2()

    val guru3= teacher3("ahmad", 2, "iOS")
    guru3.mengajar3()

    val guru4 = teacher4("wiranto", 8, "flutter")
    guru4.mengajar4()
}