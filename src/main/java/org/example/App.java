/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        final double TAX = 0.055;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price of item 1:");
        double item1 = scanner.nextDouble();
        System.out.println("Enter the quantity of item 1:");
        double quantity1 = scanner.nextDouble();

        System.out.println("Enter the price of item 2:");
        double item2 = scanner.nextDouble();
        System.out.println("Enter the quantity of item 2:");
        double quantity2 = scanner.nextDouble();

        System.out.println("Enter the price of item 3:");
        double item3 = scanner.nextDouble();
        System.out.println("Enter the quantity of item 3:");
        double quantity3 = scanner.nextDouble();

        scanner.close();

        double subtotal = (item1 * quantity1) + (item2 * quantity2) + (item3 * quantity3);
        double tax = subtotal * TAX;

        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtotal, tax, subtotal + tax);
    }
}
