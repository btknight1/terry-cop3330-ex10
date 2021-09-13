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
        String sp, sq;
        double p, q;
        final double TAX = 5.5;
        Bill bill1 = new Bill();

        for(i=0; i<3; i++)
        {
            // Be sure you explicitly convert input to numerical data before doing any calculations.
            System.out.printf("Enter the price of item %d: ", i+1);
            sp = input.nextLine();
            p = Double.parseDouble(sp);

            // Be sure you explicitly convert input to numerical data before doing any calculations.
            System.out.printf("Enter the quantity of item %d: ", i+1);
            sq = input.nextLine();
            q = Double.parseDouble(sq);

            bill1.updateTotal(p*q);
        }
        System.out.printf("Subtotal: $%.2f%n", bill1.showTotal());
        System.out.printf("Tax: $%.2f%n", bill1.showTax(TAX));
        bill1.applyTax(TAX);
        System.out.printf("Total: $%.2f", bill1.showTotal());
    }
}