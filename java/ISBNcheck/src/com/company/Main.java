package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Read ISBN
        Scanner input = new Scanner(System.in);
        String isbn = input.nextLine();

        // Parse code into numbers
        // Discard dashes in the process
        List<Integer> numbers= new ArrayList<>();
        for (int index = 0; index < isbn.length(); index++) {
            if( isbn.charAt(index) == '-')
                continue;
            else
                numbers.add( Integer.parseInt(String.valueOf(isbn.charAt(index))) );
        }

        List<Integer> totals = new ArrayList<>();
        int index = 0;
        for (int number: numbers) {
            totals.add(number * ( 10-index ));
            index++;
        }

        // Calculate total
        int total = 0;
        for (int number:totals) {
            total += number;
        }

        // If `total mod 11` is 0
        //  then we proved that provided ISBN-10 is valid
        // else
        //  calculate what last digit should have been
        if (total % 11 == 0)
            System.out.println("valid");
        else
            System.out.println( 11 - (total % 11) );

    }
}
