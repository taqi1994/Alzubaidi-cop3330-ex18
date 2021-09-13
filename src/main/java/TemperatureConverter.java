/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */


import java.util.Scanner;

public class TemperatureConverter
{

    public static void main(String[] args)
        {
            int tempreture;
            int result;

            //set both at 0:
            tempreture = 0;
            result = 0;

        Scanner reader = new Scanner(System.in);

        //User will input his choice:
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");

        char choice = reader.next().charAt(0);


        //if input entered was C:
        if(choice == 'c' || choice == 'C')
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");

            tempreture = reader.nextInt();
            result = (tempreture - 32) * 5 / 9; // Converting formula
            System.out.print("The temperature in Celsius is "+ result+".");
        }

        //if input entered was F:
        else if(choice == 'f' || choice == 'F')
        {
            System.out.print("Please enter the temperature in Celsius: ");

            tempreture = reader.nextInt();
            result = (tempreture * 9 / 5) + 32; //Converting formula
            System.out.print("The temperature in Farenheit is "+ result+".");

        }

        //If input was not either C or F, it will give out "Wrong Input" message:
        else
        {
            System.out.println("Wrong Input!!!");
        }
    }
}