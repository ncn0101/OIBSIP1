package com.numberguessing;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {

	public static void main(String[] args) {
 		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();
		        
		        int maxAttempts = 10;
		        int rounds = 3;
		        int score = 0;

		        System.out.println("Welcome to the Guess the Number Game!");
		        System.out.println("You have " + rounds + " rounds to play.");

		        for (int round = 1; round <= rounds; round++) {
		            int targetNumber = random.nextInt(100) + 1;
		            int attempts = 0;
		            boolean isGuessed = false;
		            
		            System.out.println("\nRound " + round + " starts!");
		            System.out.println("I'm thinking of a number between 1 and 100. Try to guess it!");

		            while (attempts < maxAttempts && !isGuessed) {
		                System.out.print("Enter your guess: ");
		                int userGuess = scanner.nextInt();
		                attempts++;

		                if (userGuess == targetNumber) {
		                    System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
		                    score += (maxAttempts - attempts + 1); // More points for fewer attempts
		                    isGuessed = true;
		                } else if (userGuess < targetNumber) {
		                    System.out.println("The number is higher than your guess.");
		                } else {
		                    System.out.println("The number is lower than your guess.");
		                }
		            }

		            if (!isGuessed) {
		                System.out.println("Sorry! You've exhausted all attempts. The number was: " + targetNumber);
		            }
		        }

		        System.out.println("\nGame Over! Your final score is: " + score);
		        scanner.close();
	}

}
