# Unexpected Behavior of map() on Empty List in Kotlin

This example demonstrates an uncommon error in Kotlin related to the behavior of the `map()` function when applied to an empty list.  Unlike some languages that might throw an exception, Kotlin's `map()` function gracefully handles empty lists by simply returning an empty list.  This can be unexpected behavior if you're not aware of it.

The `bug.kt` file contains code demonstrating this behavior. The `bugSolution.kt` demonstrates safer ways to avoid potential issues.