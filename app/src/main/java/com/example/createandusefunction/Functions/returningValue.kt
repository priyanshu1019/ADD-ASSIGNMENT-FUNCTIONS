package com.example.createandusefunction.Functions
fun main() {
    val greeting = birthdayGreet()
    println(greeting)
}
fun birthdayGreet(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}