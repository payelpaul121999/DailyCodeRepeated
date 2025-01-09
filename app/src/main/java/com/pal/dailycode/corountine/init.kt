package com.pal.dailycode.corountine

class Person(val name: String, val age: Int) {

    // Init block
    init {
        println("Initializing Person: $name")
        require(age > 0) { "Age must be positive" }
    }

    // Another init block (optional)
    init {
        println("Another init block can be added.")
    }

    // Regular function
    fun greet() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

// Usage
fun main() {796838
    val person = Person("Alice", 25)
    person.greet()
}