//package `SMK IDN`
//data class DataAnimal(val name: String, val age: Int, val weight: Int)
//
//class Animal(val name: String, val age: Int, val weight: Int){
//    override fun toString(): String {
//        return "Animal(name= $name, age= $age, weight= $weight)"
//        val animal = "Animal(name= $name, age= $age, weight= $weight)"
//    }
//}
//fun main() {
//    val dataAnimal = DataAnimal("Tiger", 4, 57)
//
//    //val animal = DataAnimal("Tiger", 7, 60)
//    // equals
//    val animal2 = DataAnimal("Snake", 2, 5)
//    val animal3 = DataAnimal("Tiger", 4, 57)
//
//    println(dataAnimal.equals(animal2))
//    println(dataAnimal.equals(animal3))
//}
//
//    // copy
//    val animal4 = animal2.copy(name = "ular")
//    println(animal4)
//
//    val nama = dataAnimal.component1()
//    val umur = dataAnimal.component2()
//    val berat = dataAnimal.component3()
//
//    println("nama hewan ku $nama. dia berumur $umur, dan memiliki berat badan $berat")
//
//    print("""
//        harimau bahasa inggrisnya adalah ${dataAnimal.component1()},
//        dan dia berumur ${dataAnimal.component2()} tahun, serta memiliki berat badan ${dataAnimal.component3()} kg
//    """.trimIndent())
//}
//
//fun main(){
//    identitas("saleh", 17, "brebes", 14, "juli", 2004)
//}
//fun identitas (name: String, umur: Int, tinggal: String, tanggal: Int, bulan: String, tahun: Int){
//    println("halo nama saya $name, aku berumur $umur tahun, dan saya tinggal di $tinggal, saya lahir tanggal $tanggal $bulan $tahun")
//}
//
//fun main(){
//    bola("riko simanjuntak",28)
//}
//fun bola(name: String, umur: Int) {
//    println("PemainBola(name=$name, umur= $umur)")
//}
//
//fun main() {
//    val smkIdn = arrayOf<String>("smk idn baording school tahun ajaran")
//    for (i in 0..smkIdn.size-1){
//        print(""+smkIdn [i])
//    }
//
//    val smkIdn2 = arrayOf<String>("2021/2022 bidang rpl android developer")
//    for (i in 0..smkIdn2.size-1){
//        print(""+smkIdn2 [i])
//    }
//}


//class Orang(){
//    var mata = "normal"
//    var mulut = true
//    var telinga = 2
//    var tangan: String? = "kuat"
//    var kaki: Int? = 2
//
//    fun melihat(){  }
//
//    fun bersuara(){ /**---*/ }
//
//    fun mendengar(){ /**---*/ }
//
//    fun menulis(){ /**---*/ }
//
//    fun berjalan(){ /**---*/ }
//}
//
//fun main(){
//    val programmer = Orang()
//    programmer.mata = "rabun"
//    programmer.kaki = 2
//    programmer.menulis()
//    println(programmer)
//}

//class identitas(val nama: String, val umur : Int, val asal: String){
//
//    companion object Test {
//        fun callMe() = println("You are calling me :)")
//    }
//
//    fun name(){
//        println("nama saya adalah $nama")
//    }
//    fun age(){
//        println("umur saya adalah $umur")
//    }
//    fun from(){
//        println("asal saya dari $asal")
//    }
//}

//fun main(){
//    val identitity = identitas("saleh", 17, "brebes")
//    identitity.name()
//    identitas.callMe()
//
//}


//fun main(){
//    val a = false
//
//    if(!a){
//        //akan dijalankan jika a diberi tanda !
//        println("its true")
//    }else{
//        //akan dijalankan jika tidak ada a tanda !
//        println("its false")
//    }
//}


fun main(){
    val a = 9 //statement
    val b = 8 //statement
    var thing = a //statement

    if (a < b)thing = b //expression
    println(thing)
}