/**
 * Get a list of numbers and determine the average of all numbers
 * Determine how many positive and negative numbers a user has entered
 * If a user enters 0, print all the results
 */

import java.util.Scanner

fun main() {
    println("Enter numbers repeatedly\nEnter 0 to stop entering numbers: ")
    getAverageNumber()
}

fun getAverageNumber() {
    // Instance of Scanner
    val scanner = Scanner(System.`in`)
    var userInput = scanner.nextInt()

    // Base Variables
    var total = 0
    var counter = 0
    val stopper = 0

    // Positive & Negative
    var positiveNumbers = 0
    var negativeNumbers = 0

    while (userInput != stopper) {
        if (userInput == stopper) break
        else if (userInput < stopper) negativeNumbers++
        else positiveNumbers++

        // Add Int to Total variable
        total += userInput
        // Increment Counter
        counter++
        userInput = scanner.nextInt()
    }
    // Average Calculations
    val average = total / counter
    print("Average\t: $average\nTotal\t: $total\nPositive Numbers\t: $positiveNumbers\nNegative Numbers\t: $negativeNumbers")
}