package com.pal.dailycode.normal

fun findfizzBuzz(n:Int){
    for (i in 1..n){
       when{
           i % 5 ==0 && i % 3==0 -> println("FizzBuzz")
           i % 5 ==0 -> println("Buzz")
           i % 3 ==0 -> println("Fizz")
           else ->println("$i")
       }
    }

}
