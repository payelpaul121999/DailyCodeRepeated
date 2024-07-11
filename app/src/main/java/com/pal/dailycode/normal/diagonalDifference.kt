package com.pal.dailycode.normal

import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var primaryDiaGo =0
    var secondaryDiaGo=0
    val n =arr.size
    for (i in 0 until n){
        primaryDiaGo += arr[i][i]
        secondaryDiaGo += arr[i][n-i-1]
    }
    return abs(primaryDiaGo - secondaryDiaGo)
}

fun main() {
    val n = readLine()!!.toInt()
    val matrix = Array(n) { Array(n) { 0 } }

    for (i in 0 until n) {
        val row = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
        matrix[i] = row
    }

    val result = diagonalDifference(matrix)
    println(result)
}
/**
 * 1 2 3
 * 4 5 6
 * 9 8 9
 * The left-to-right diagonal = 15. The right to left diagonal = 17. Their absolute difference is2
 * **/