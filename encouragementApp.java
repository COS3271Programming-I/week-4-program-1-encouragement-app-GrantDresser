// Program Name: encouragementApp.java
// Author: Grant Dresser
// Date: 2/13/2026

import java.util.Scanner;

public class encouragementApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("How are you doing today? ");
        String mood = input.nextLine();

        // Boolean variables
        boolean isHappy = mood.equalsIgnoreCase("happy");
        boolean isGreat = mood.equalsIgnoreCase("great");
        boolean isSad = mood.equalsIgnoreCase("sad");
        boolean isTired = mood.equalsIgnoreCase("tired");
        boolean isStressed = mood.equalsIgnoreCase("stressed");

        System.out.println("\n--- Encouragement Message ---");

        if (isHappy) {
            System.out.println("'Im happy you're happy! Keep going!");
        } 
        else if (isGreat) {
            System.out.println("Glad you're doing great! Keep it up!");
        } 
        else if (isSad) {
            System.out.println("I'm sorry you're feeling sad. Better days are coming.");
        } 
        else if (isTired) {
            System.out.println("Make sure you get some rest. You deserve it!");
        } 
        else if (isStressed) {
            System.out.println("Take a deep breath, give yourself a break, and remember that you got this!");
        } 
        else {
            System.out.println("No matter what, you are doing your best!");
        }

        // Age conditionals
        boolean isTeen = age < 18;
        boolean isYoungAdult = age >= 18 && age <= 30;

        if (isTeen) {
            System.out.println("You've got your full life ahead of you! Follow your passions!");
        } 
        else if (isYoungAdult) {
            System.out.println("This is a great time to build your future and meet new people!");
        } 
        else {
            System.out.println("Your experience and wisdom are valuable!");
        }

        input.close();
    }
}
