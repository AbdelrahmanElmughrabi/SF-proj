/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw4;

import java.util.Scanner;

/**
 *
 * @author Abdelrahman
 */
public class hw4 {

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
            if(i%2==0)
            System.out.print(i + " ");
        }
    }
}
