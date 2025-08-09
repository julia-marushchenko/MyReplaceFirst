// Java program to practice replaceFirst() method

package com.strings;

// Main class
public class Main {

    // Main method
    public static void main(String[] args) {

        // Creating string for replacement
        String str = new String("This is string.");

        // Regex for replacement
        String regex = "is";

        // Replacing first 'is' with 'at'
        System.out.println(str.replaceFirst(regex, "at")); // Output: That is string.
    }
}