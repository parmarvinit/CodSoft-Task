import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        playGuessingGame();
    }
    
    public static void playGuessingGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerRange = 1;
        int upperRange = 100;
        int attemptsLimit = 10;
        int totalRounds = 0;
        int totalAttempts = 0;
        
        boolean playAgain = true;
        
        System.out.println("Welcome to the Guessing Game!");
        
        while (playAgain) {
            totalRounds++;
            int targetNumber = random.nextInt(upperRange - lowerRange + 1) + lowerRange;
            int currentAttempts = 0;
            boolean roundWon = false;
            
            System.out.println("\nRound " + totalRounds);
            System.out.println("Guess a number between " + lowerRange + " and " + upperRange + ". You have " + attemptsLimit + " attempts.");
            
            while (currentAttempts < attemptsLimit) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                currentAttempts++;
                totalAttempts++;
                
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + targetNumber + " in " + currentAttempts + " attempts.");
                    roundWon = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
            }
            
            if (!roundWon) {
                System.out.println("Sorry, you couldn't guess the number. It was " + targetNumber + ".");
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }
        
        System.out.println("\nGame over! You played " + totalRounds + " rounds and made " + totalAttempts + " total attempts.");
        scanner.close();
    }
}