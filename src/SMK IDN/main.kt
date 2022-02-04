package `SMK IDN`
//fun main(){
//    val a =10
//    if (a != null){
//        print("saleh")
//    }else{
//        println("rashid")
//    }
//}

fun main(){
    val text: String? = null
    val textLength = text?.length ?: "pengganti nilai"
    println(textLength)
    if(text != null){
        println(text.length)
    }else{
        println("pengganti nilai")
    }
}

//fun main(){
//    val text: String? = "null"
//    val textLength = text!!.length ?: "testing"
//    println(textLength)
//    if(text != null){
//        println(text.length)
//    }else{
//        println("pengganti nilai")
//    }

//}

//fun main(){
//    val sum = 1 + 9
//    val sub = 6 - 2
//    val multiplication = 1 * 9
//    val division = 56 / 7
//
//    val math = 10 / (6 - 2) + 4 * 8
//    val math2 = 10 / 6 - 2 + 4 * 8
//
//    val a = sum.toDouble()
//    val b = sub.toDouble()
//    val c = multiplication.toDouble()
//    val d = division.toDouble()
//
//    val mod: Double = a % b
//    val mod2: Double = d % c
//    val mod3: Double = 10.0 % 3.3
//    val mod4: Double = 5.0 % 7
//}
//
//fun main(){
//    var a = 3
//    var b = 4
//    a += b
//    println(a)
//}


//fun main(){
//    val a = 3
//    val b = 4
//    var l= a <= b
//    println(l)
//}

//fun main(){
//    val vocal = 'A'
//    print("\u0041")
//}

//fun main(){
//    val range = 1.rangeTo(9)
//    range.forEachIndexed{index, value ->
//        print("index $index dari &value")
//    }
//}

//fun main(){
//    var dzikir = 3
//    while(dzikir >= 1){
//        println("astaghfirullah")
//        dzikir++
//    }
//}

//fun main (){
//    lambda()
//    lambdaParam("saleh")
//    salam("assalamualaikum")
//    sum(9,9)
//}
//// contoh lambda expression
//val lambda = { println("test") }
////contoh fungsi normal
//fun salam(pesan: String){
//    println("$pesan")
//}
//// contoh lambda dengan parameter
//val lambdaParam = { pesan: String ->
//    println(pesan)
//}
//val sum = {a: Int, b: Int ->
//    val result = a * b
//    println(result)
//}

//fun main(){
//    val nama: (String, String) -> String = { fName: String, lName: String ->
//        val result = "$fName $lName"
//        result
//    }
//}

//fun main(){
//    val lambda = {nama: String ->
//        "hello $nama"
//    }
//    val lambda2: (String) -> String = {
//        "hello $it"
//    }
//    println(lambda("saleh"))
//    println(lambda("rahma"))
//}

//fun main(){
//    val asc = Array(5) {i -> (i * i).toString()}
//    asc.forEach { print(it) }
//}

//fun main(){
//    val angka = result(1, 2, 3, 4, 5)
//    println(angka)
//}
//
//fun result(vararg number: Int): Int{
//    val jumlah = number.sum()
//    println(jumlah)
//    return jumlah
//}
//fun main(){
//    val angka2 = intArrayOf(6, 7, 8, 9)
//    val angka = result(1, 2, 3, 4, 5, *angka2)
//    print(result(angka))
//}
//
//fun result(vararg number: Int): Int{
//    val jumlah = number.sum()
//    return jumlah
//}

//fun main(){
//    val text: String? = null?: "RPL IDN"
//    val angka: Int? = null?: 2021
//
//    println(text)
//    println(angka)
//}

