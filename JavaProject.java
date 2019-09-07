/*
 Description: Write a program that asks the user input a change between 1 and 99 cents. 
               The program then will display it in amount of quarters, dime, nickels and 
               pennies.
 */
import java.util.Scanner;
import java.util.Random;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int cents;
        //user input
        System.out.println("Enter a change between 1 and 99 cents:");
        //cents = input.nextInt();
        Random r = new Random();
        // ramdonly generate a number
        // ((max - min) + 1) + min
        int cents = r.nextInt((99-1)+1)+1;
        System.out.println("You have change " + cents + " cents. That is:");
        System.out.println((cents / 25) + " quarters");
        cents = cents % 25;
        System.out.println((cents / 10) + " dimes");
        cents = cents % 10;
        System.out.println((cents / 5) + " nickels");
        cents = cents % 5;
        System.out.println(cents + " pennies");
    }
}
