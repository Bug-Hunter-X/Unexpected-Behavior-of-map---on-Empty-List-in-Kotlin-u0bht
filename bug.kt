fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val emptyList = emptyList<Int>()
    val doubledEmptyList = emptyList.map { it * 2 }
    println(doubledEmptyList) // This will print an empty list, not throw an exception
}