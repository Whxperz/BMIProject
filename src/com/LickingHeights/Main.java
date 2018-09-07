package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

    // Variables
        String heightFeet;
        String heightInches;
        int inches;
        String weight;
        String total;
        Scanner keyboard;
        keyboard = new Scanner(System.in);

    //Declare
        inches = 12;

    //Code

        System.out.println("What is your height? (Only feet)");
        heightFeet = keyboard.nextLine();
        System.out.println("What is your height? (Only inches)");
        heightInches = keyboard.nextLine();
        System.out.println("What is your weight? (In kilograms");
        weight = keyboard.nextLine();
        System.out.println(heightFeet*inches);
        System.out.println(heightInches+heightFeet);

    }
}
