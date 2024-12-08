fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println("List after removeIf: $list")

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map.removeIf { it.value > 2 }
    println("Map after removeIf: $map")

    //More robust solution that handles both Lists and Maps
    fun <T> removeIfValueGreaterThan2(collection: MutableCollection<T>){
        if (collection is MutableList<*>){
            (collection as MutableList<Int>).removeIf { it > 2 }
            println("List after removeIf: $collection")
        }else if (collection is MutableMap<*,*>){
            (collection as MutableMap<*, Int>).removeIf { it.value > 2 }
            println("Map after removeIf: $collection")
        }
    }

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    removeIfValueGreaterThan2(list2)

    val map2 = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    removeIfValueGreaterThan2(map2)
} 