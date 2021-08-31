/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Terry
 */
package org.example;
import java.util.Scanner;
public class App
{

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int i;
        double p, q;
        final double tax = 5.5;
        Bill bill1 = new Bill();

        for(i=0; i<3; i++)
        {
            System.out.printf("Enter the price of item %d: ", i+1);
            p = input.nextDouble();
            System.out.printf("Enter the quantity of item %d: ", i+1);
            q = input.nextDouble();
            bill1.updateTotal(p*q);
        }
        System.out.printf("Subtotal: $%.2f%n", bill1.showTotal());
        System.out.printf("Tax: $%.2f%n", bill1.showTax(tax));
        bill1.applyTax(tax);
        System.out.printf("Total: $%.2f", bill1.showTotal());
    }
}
