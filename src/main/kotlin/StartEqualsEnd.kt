/**
 * In this challenge, your task is to write a program or function which takes in a String and outputs a truthy or
 * falsey value based on whether the first character and the last character of the input String are equal.
 */

fun startEqualsEnd(input: String): Boolean {

    // edge cases:
    // empty string (false)
    // single-character string (true)

    return if (input == "") {
        false
    } else {
        return input[0] == input[input.length - 1]
    }
}