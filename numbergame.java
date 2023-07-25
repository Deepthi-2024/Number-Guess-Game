import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int score = 0;
        
        boolean play = true;
        while (play) {
            int targetNumber = random.nextInt(maxRange);
            // System.out.println(targetNumber);
            System.out.println("I have generated a number between " + minRange + " and " + maxRange + ". Guess the number!");
            int attempts = 0;
            boolean guessedCorrectly = false;
            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    score++;
                } else if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                attempts++;
            }
            
            if (!guessedCorrectly) {
                System.out.println("Out of attempts! The number was: " + targetNumber);
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainChoice = scanner.next();
            
            if (!playAgainChoice.equalsIgnoreCase("yes")) {
                 play = false;

            }
        }
        
        System.out.println("Game over. Your score: " + score);
        scanner.close();
    }
}
