import java.util.Scanner;
import java.util.Random;

// Number Guessing game
public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int maxAttempts = 3;
        int score = 0;
        String playAgain;

        do {
            int guessNo = r.nextInt(100) + 1;
            int attempts = 0;
            boolean won = false;

            System.out.println("Guess a number between 1 and 100. You have a maximum of " + maxAttempts + " attempts!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                
                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }

                attempts++;

                if (userGuess == guessNo) {
                    won = true;
                    score++;
                    System.out.println("Congratulations! You guessed the correct number!");
                    break;
                } else if (userGuess < guessNo) {
                    System.out.println("Too low! Try again!");
                } else {
                    System.out.println("Too high! Try again!");
                }

                System.out.println("Attempts remaining: " + (maxAttempts - attempts));
            }

            if (!won) {
                System.out.println("Sorry! You have used all your attempts! The correct number was: " + guessNo);
            }

            System.out.print("Want to play again? (yes/no): ");
            playAgain = sc.next(); // taking string as input

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Your final score: " + score);
        System.out.println("Thank you for playing this game!");

        sc.close();
    }
}
