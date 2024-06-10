package com.example.createandusefunction.Functions
fun main() {
    println(birthdayGreeting("Rover" , 21))
    println(birthdayGreeting("Prianshu" , 22))
}
//fun birthdayGreeting(name: String): String {
//    val nameGreeting = "Happy Birthday, $name!"
//    val ageGreeting = "You are now 5 years old!"
//    return "$nameGreeting\n$ageGreeting"
//}
fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}