//package `SMK IDN`
//
//open class Teacher(name: String, email: String, val subject: String): Person(name, email){
//    fun specialSubject(){
//        info()
//        println("Is teacher who teaches subject $subject")
//    }
//}
//
//class PublicTeacher(name: String, email: String, subject: String, val school: String): Teacher(name, email, subject){
//    fun school(){
//        specialSubject()
//        println("mengajar di $school ")
//    }
//}
//
//open class Person(val name: String, val email: String){
//    fun info(){
//        println("Name: $name, Email: $email")
//    }
//}
//
//class PrivateTeacher(name: String, email: String, subject: String, val student: Int): Teacher(name,email, subject) {
//    fun capacity(){
//        println("seorang guru harus bisa mengarakan para $student siswa ")
//    }
//}
//
//fun main() {
//    val myTeacher = PrivateTeacher("muhammad farros", "example@gmail.com","android",20)
//    myTeacher.specialSubject()
//
//    val  myHomeRoom = PublicTeacher("muhammad farros", "example@gmail.com", "android", "smk idn")
//    myHomeRoom.school()
//}


open class Club{
    open fun namaClub(){

    }
}

class Madrid: Club() {
    override fun namaClub() {
        //super.namaClub()
        println("Real Madrid")
    }
}


class Juventus: Club() {
    override fun namaClub() {
        //super.namaClub()
        println("Juve")
    }
}

fun main(args: Array<String>) {
    val juve = Juventus()
    juve.namaClub()

    val madrid = Madrid()
    madrid.namaClub()
}
