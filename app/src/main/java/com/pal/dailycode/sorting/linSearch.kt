package com.pal.dailycode.sorting

fun linSearch(numList:ArrayList<Int>,target:Int):Int{
    var steps = 0
    for (i in numList.indices){
        steps++
        if (numList[i]==target) return i
    }
    println("Linear Search Result: Index $steps")
    return -1
}

fun binSearch(numList:ArrayList<Int>,target:Int):Int{
    var left = numList[0]
    var right = numList.size - 1

    while (left <= right){
        var mid =( left + right ) / 2
        when{
            numList[mid] == target -> return mid
            numList[mid] < target -> left = mid - 1
            else -> right = mid + 1
        }
    }

return -1
}

fun main() {
    val array = arrayListOf<Int>(1, 3, 5, 7, 9, 11, 13)

    val linearResult = linSearch(array, 9)
    println("Linear Search Result: Index $linearResult")

    val binaryResult = binSearch(array, 9)
    println("Binary Search Result: Index $binaryResult")
}