//class hewan2(nama: String, berat: Float, berbulu: Boolean) {
//    val name: String
//    val weight: Float
//    val berbulu: Boolean
//    var umur: Int? = null
//
//    init {
//        this.name = nama
//        this.weight = if (berat <= 0) 0.1f else berat
//        this.berbulu = berbulu
//
//    }
//
//    constructor(nama: String, berat: Float, berbulu: Boolean, umur: Int): this(nama, berat, berbulu){
//        this.umur = if (umur < 0) 0 else umur
//    }
//
//
//    fun info(){
//        println("Nama: $name \nBerat: $weight \nhewan berbulu: $berbulu \nUmur: $umur")
//    }
//
//}
//
//fun main(){
//    val oyen = hewan2("anggora", 0.0f, true, 4)
//
//    val kucing = hewan2("kucing", 2.0f, true)
//    kucing.info()
//}
//
//open class hewan(val nama: String, protected val berat: Float){
//
//   fun info(){
//        println("Nama: $nama \nBerat: $berat")
//    }
//}
//
//class alien(nama: String, berat: Float, val jenis: String, val asal: String): hewan(nama, berat, )
//
//fun main(){
////    val beta = hewan("Sedang", 3.0f)
////    beta.info()
//    val flops = alien("white", 3.9f, "mars", "mars")
//    println("Nama alien: ${flops.nama}")
//    println("berat alien: ${flops.  berat}")
//
//    val panjangNama = beta.nama.length
//    val berat = beta.berat.toDouble()
//    val mamalia = beta.berbulu.not()
////    val umur = beta.umur.plus(1)
//
//    println("$panjangNama, $berat, $mamalia")
//}