fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val emptyList = emptyList<Int>()
    // Safer approach 1: Check for emptiness before mapping
    val doubledEmptyList = if (emptyList.isEmpty()) emptyList else emptyList.map { it * 2 }
    println(doubledEmptyList) 

    // Safer approach 2: Use the let function for null safety and conciseness
    val doubledEmptyList2 = emptyList.let { if (it.isEmpty()) it else it.map { it * 2 } }
    println(doubledEmptyList2)
    
    //Safer approach 3:  Use orElse to provide a default value if the list is empty
    val doubledEmptyList3 = emptyList.map { it * 2 }.orElse { emptyList<Int>() }
    println(doubledEmptyList3)
}