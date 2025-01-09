package com.pal.dailycode.normal

fun HappyNumber(number:Int) : Boolean{
    var hashSet = HashSet<Int>()
    var n = number
    while (true){
        var sum = 0
        while (n != 0){
            sum +=Math.pow((n % 10).toDouble(), 2.0).toInt() // Square the last digit and add to sum
            n /= 10 // Remove the last digit
        }
        if (sum == 1){
            return true
        }

        if (hashSet.contains(sum)){
            return false
        }else{
            hashSet.add(sum)
        }

        n = sum
    }
}

fun main(){
    val hNum= HappyNumber(82)
    println("The HappyNumber 82 is $hNum")
}