package com.pal.dailycode.harkRank

fun plusMinus(numbers: Array<Int>): Unit {
    val totalCount = numbers.size.toDouble()
    val positiveCount = numbers.count { it > 0 }.toDouble()
    val negativeCount = numbers.count { it < 0 }.toDouble()
    val zeroCount = numbers.count { it == 0 }.toDouble()

    val positiveRatio = positiveCount / totalCount
    val negativeRatio = negativeCount / totalCount
    val zeroRatio = zeroCount / totalCount

    val decimalPlaces = 6 // Set the desired number of decimal places

    println("${positiveRatio.roundTo(decimalPlaces)}")
    println("${negativeRatio.roundTo(decimalPlaces)}")
    println("${zeroRatio.roundTo(decimalPlaces)}")
}

fun Double.roundTo(numFractionDigits: Int): Double {
    return "%.${numFractionDigits}f".format(this).toDouble()
}


fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
