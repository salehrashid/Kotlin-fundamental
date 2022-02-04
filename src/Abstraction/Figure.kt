//package Abstraction
//
//abstract class Figure{
//    abstract var color: String?
//    abstract fun getArea(): Float
//}
//
//class Triangle(val base: Float, val height: Float): Figure() {
//    override var color: String? = "warna"
//
//    override fun getArea(): Float {
//        return 0.5f * (base * height)
//    }
//}
//
//fun main(args: Array<String>){
//    val surface = Triangle(9f, 5f)
//    println(surface.getArea())
//}

//open class Animal{
//    open fun sound(){
//    println("berbagai suara hewan")
//    }
//}
//
//class Duck: Animal(){
//    override fun sound(){
//        println("Suara bebek: awokawokawokawok")
//    }
//}
//
//class Cat: Animal() {
//    override fun sound(){
//        println("suara bebek: miau")
//    }
//}
//
//class Dog: Animal(){
//    override fun sound(){
//        println("suara anjing: aug")
//    }
//}
//
//fun main(){
//    val hewan = Animal()
//    val bebek = Duck()
//    val kucing = Cat()
//    val anjing = Dog()
//
//    hewan.sound()
//    bebek.sound()
//    kucing.sound()
//    anjing.sound()
//}

//abstract class Pegawai (private val namaDepan: String, private val namaBelakang: String){
//    fun namaLengkap(): String{
//        return "$namaDepan, $namaBelakang"
//    }
//    fun hitunganGaji(bonus: Double): Double{
//        return bonus + 100000.0
//    }
//}
//
//class Manager(namaDepan: String, namaBelakang: String): Pegawai(namaDepan, namaBelakang)
//class Direktur(namaDepan: String, namaBelakang: String): Pegawai(namaDepan,namaBelakang)
//
//fun main(args: Array <String>){
//    val manager = Manager("ahmad", "yazid")
//    val direktur = Direktur("anjas", "maulana")
//
//    println(manager.namaLengkap())
//    println(manager.hitunganGaji(300000.0))
//
//    println(direktur.namaLengkap())
//    println(direktur.hitunganGaji(300000.0))
//}

abstract class Kampus(val tipeKampus:String){
    var nama : String=""
    abstract fun setNamaKampus(nama:String)

    fun getKampusTipe():String{
        return tipeKampus
    }
}

class Unej : Kampus("Universitas"){
    override fun setNamaKampus(nama: String) {
        this.nama=nama
    }

}

fun main(args: Array<String>) {
    val unej = Unej()
    unej.setNamaKampus("Universitas Jember")

    println("nama kampus adalah ${unej.nama} dan tipe kampus ${unej.getKampusTipe()}")
}