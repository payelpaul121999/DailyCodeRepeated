package com.pal.dailycode.harkRank

import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>):Int{
    var leftDiago=0
    var rightDiago =0
    for (i in arr.indices){
        leftDiago += arr[i][i]
        rightDiago += arr[i][arr.size -1 -i]
    }
    return abs(leftDiago-rightDiago)
}

fun main(){
    val matrix = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(9, 8, 9)
    )
    val result = diagonalDifference(matrix)
    println("Absolute diagonal difference: $result")
}