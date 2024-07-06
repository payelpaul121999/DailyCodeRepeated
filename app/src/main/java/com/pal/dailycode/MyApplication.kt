package com.pal.dailycode

import android.app.Application
import com.pal.dailycode.normal.findOddAndEvenFromArray
import com.pal.dailycode.sorting.binarySearch


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

    }
}
fun main(){
    findOddAndEvenFromArray()
}
fun binSearch(){
    val numbers = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val targetValue = 8

    val index = binarySearch(numbers, targetValue)

    if (index != -1) {
        println("Target $targetValue found at index $index")
    } else {
        println("Target $targetValue not found in the array")
    }
}
/*
fun main() {
    val amount = 24
   when(amount){
       in 0..8 ->{
           println("Target $amount  found in number row 1")
       }
       in 9..18->{
           println("Target $amount  found in number row 2")
       }
       else ->{
           println("Target $amount not found in maximun")
       }
   }
    for (i in 1..100){
        if (i % 3==0) println("Target $i is multiple by 3") else println("___$i ")
    }
}*/
