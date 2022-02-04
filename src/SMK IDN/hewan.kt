package `SMK IDN`

class hewan(val nama: String, val berat: Float, val berbulu: Boolean = true) {
    fun makan(){
        println("$nama sedang makan untuk menambah berat badan")
    }
    fun tidur(){
        println("$nama sedang tidur untuk merawat bulu nya")
    }
    fun lari(){
        println("$nama sedang lari untuk menambahkan stamina")
    }
}

fun main(){
    val kucing = hewan("oyen", 4.5f, true)
    kucing.makan()
}