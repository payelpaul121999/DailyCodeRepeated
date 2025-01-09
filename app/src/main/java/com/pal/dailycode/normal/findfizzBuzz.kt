package com.pal.dailycode.normal
/*
fun findfizzBuzz(n:Int){
    for (i in 1..n){
       when{
           i % 5 ==0 && i % 3==0 -> println("FizzBuzz")
           i % 5 ==0 -> println("Buzz")
           i % 3 ==0 -> println("Fizz")
           else ->println("$i")
       }
    }

}*/
fun checkUniqueName(name: String, nameSet: MutableSet<String>, onUnique: () -> Unit) {
    if (nameSet.add(name)) {
        // If name is unique and successfully added to the set, call the provided function
        onUnique()
    }else{
        println("The name is not unique! ")
    }
}

// Example usage
fun uniqueNameAction() {
    println("The name is unique!")
}
val packageNameSet = hashSetOf("John", "David")
private fun callApiWithUniquePackageName(packageName : String,packageNameSet:HashSet<String>,onUnique: () -> Unit){
    if(packageNameSet.contains(packageName)) {
        println("The name is not unique!")
        return
    }else{
        onUnique()
        packageNameSet.add(packageName)
    }
}

fun main() {
    /*val namesSet = mutableSetOf<String>("John","David")
    val newName = "David"
    checkUniqueName(newName, namesSet){
        uniqueNameAction()
    }*/
    callApiWithUniquePackageName("Payel",packageNameSet){
        uniqueNameAction()
    }
}