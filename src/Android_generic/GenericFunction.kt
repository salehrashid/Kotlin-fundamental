package Android_generic

class function(val name: String){
    fun <T> sayHello(params: T){
        println("hello $params, my name is $name")
    }
}

fun main(){
    val function = function("saleh")
    function.sayHello("fulan")

}