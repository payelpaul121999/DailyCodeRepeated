package com.pal.dailycode.string

fun checkAnagramString(strOne:String,strTwo:String) :Boolean{
    var str1 = strOne.toLowerCase()
    var str2 = strTwo.toLowerCase()

    str1.replace(" ","")
    str2.replace(" ","")

    val counts = IntArray(26)

    for (i in 0 until str1.length){
       counts[str1[i] - 'a']++
    }
    for (i in 0 until str2.length){
        counts[str2[i] - 'a']--
    }

  for (index in counts){
      if (index !=0) return false
  }

    return true
}

/*
fun main(){
    val str1 = "sadder"
    val str2 = "dreads"

    if (checkAnagramString(str1, str2)) {
        println("$str1 and $str2 are anagrams.")
    } else {
        println("$str1 and $str2 are not anagrams.")
    }
}*/
