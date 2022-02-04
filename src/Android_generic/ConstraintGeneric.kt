package Android_generic

interface List<T>{
    operator fun get(index: Int): T
}

class ListNumber<T>: List<T> {
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }
}

fun main() {
    val numbers = ListNumber<Int>()
    val numbers2 = ListNumber<Long>()
    val numbers3 = ListNumber<Short>()
    val numbers4 = ListNumber<Char>()
    val numbers5 = ListNumber<String>()
}