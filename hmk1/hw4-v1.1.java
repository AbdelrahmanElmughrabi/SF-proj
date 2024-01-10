/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.util.Scanner;

/**
 *
 * @author Macblack
 */
public class JavaApplication24 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two numbers from the console
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Print numbers between the two inputs
        printNumbersBetween(firstNumber, secondNumber);

        // Close the scanner
        scanner.close();
    }

    private static void printNumbersBetween(int start, int end) {
        // Ensure start is less than end
        if (start >= end) {
            
            System.out.println("Invalid input. The first number should be less than the second number.");
            return;
        }
        
        System.out.println("Numbers between " + start + " and " + end + ":");
        for (int i = start + 1; i < end; i++) {
            if(i%2!=0)
            System.out.print(i + " ");
        }
    }
}
