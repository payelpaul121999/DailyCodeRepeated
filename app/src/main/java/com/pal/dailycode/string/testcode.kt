package com.pal.dailycode.string

fun main(){
    getCode()
}

fun getCode(){
    val item: Array<Int> = arrayOf(2,4,8)
    item.forEach {
        print("$it")
    }
}
