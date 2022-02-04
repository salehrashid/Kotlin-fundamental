//fun main(){
//    val text: String? = null
//    val angka: Int? = null
//    text?.length
//        if (text != null){
//            println(text)
//        }else{
//            println("RPL IDN BS")
//        }
//        if (angka != null){
//            println(angka)
//        }else{
//            println(2020)
//        }
//}

//fun main(){
//    val nilaiMtk = 90
//    val nilaiPkn = 80
//    val nilaiIpa = 70
//    val nilaiIps = 60
//
//    predikat (nilaiMtk)
//    predikat (nilaiPkn)
//    predikat (nilaiIpa)
//    predikat (nilaiIps)
//}
//fun predikat (nilai: Int){
//    when (nilai){
//        in 90..100 -> println("predikat A dengan nilai $nilai")
//        in 80..89 -> println("predikat B dengan nilai $nilai")
//        in 70..79 -> println("predikat C dengan nilai $nilai")
//        else -> println("anda gagal dalam ujian IPS silahkan ulangi lagi")
//    }
//}

//elvis operator
//fun main(){
//    val text: String? = null
//    val angka: Int? = null
//    println(text?: "RPL IDN BS")
//    println(angka?: 2020)
//}

//fun main(){
//    val nilai = 90
//    if(nilai > 80){
//        println("sabi banget")
//    }else if (nilai < 70){
//        println("sabi sih")
//    }else if (nilai > 60){
//        println("lumayan sabi")
//    }else{
//        println("gak sabi")
//    }
//}

//fun main(){
//    val nilai = "A"
//    when (nilai){
//        "A" -> println("sabi banget")
//        "B" -> println("sabi sih")
//        "C" -> println("lumayan sabi")
//        "D" -> println("gak sabi")
//    }
//
//    when (nilai) {
//        "A", "B", "C" -> {
//            println("maka lulus")
//        }else -> println("maka gak lulus")
//    }
//
//    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
//    when (nilai){
//        in nilaiLulus -> println("yeeey anda lulus")
//        !in nilaiLulus -> println("anda gak lulus")
//    }
//
//    val nama = ("saleh")
//    when (nama){
//        is String -> println("nama adalah string")
//        !is String -> println("nama bukan string")
//    }
//}

//fun main(){
//    for (angka in 1.rangeTo(10))
//        println(angka)
//}

//menentukan angka genap
fun main(){
    val angka = arrayOf(1,2,3,4,5,6,7,8,9,10)
    for(i in angka){
        if (i % 2==0){
            println(i)
        }
    }
}