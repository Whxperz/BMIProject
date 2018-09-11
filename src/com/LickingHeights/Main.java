package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

    // Variables
        int heightFeet;
        int heightInches;
        int inches;
        double feetConversion;
        double feetConversionTotal;
        double inchConversion;
        double inchConversionTotal;
        double metersTotal;
        double metersSquared;
        int weight;
        double firstTotal;
        double secondTotal;
        Scanner keyboard;
        keyboard = new Scanner(System.in);

    //Declare
        inches = 12;
        feetConversion = 0.3048;
        inchConversion = 0.0254;

    //Code

        System.out.println("What is your height? (Only feet)");
        heightFeet = keyboard.nextInt();
        System.out.println("What is your height? (Only inches)");
        heightInches = keyboard.nextInt();
        System.out.println("What is your weight? (In kilograms)");
        weight = keyboard.nextInt();
        feetConversionTotal =(heightFeet*feetConversion);
        inchConversionTotal =(heightInches*inchConversion);
        metersTotal =(feetConversionTotal+inchConversionTotal);
        metersSquared =(metersTotal*metersTotal);
        firstTotal =(weight/metersSquared);
        double roundedTotal = Math.round(firstTotal*10.0)/10.0;
        System.out.println("BMI is " + roundedTotal);




    }
}
