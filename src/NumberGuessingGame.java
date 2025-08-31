import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true ;

     while(playAgain){
        int number = rand.nextInt(100)+1;
        int attempts = 0;
        int guess = -1 ;
        System.out.println("HELLO in this number guessing game");
        System.out.println("I have chosen a number between 1 and 100. Can you guess it? ");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            // ✅ Input validation
            if (!input.hasNextInt()) {
                System.out.println("⚠️ Invalid input! Please enter an integer number.");
                input.next(); // discard invalid input
                continue;
            }
            guess = input.nextInt();
            attempts++;
            if  (guess == number){
                System.out.println("Congratulations! You guessed it in " + attempts + " tries");
            break; // ✅ exit loop immediately
                }
            else if (guess > number )
                System.out.println("your guess is bigger than the number!");
            else if (guess < number)
                System.out.println("your guess is smaller than the number!");
        }
         // ✅ Play again option
         System.out.print("\nDo you want to play again? (yes/no): ");
         String response = input.next().trim().toLowerCase();
         playAgain = response.equals("yes");
    }
        System.out.println("\n👋 Thanks for playing! Goodbye.");
        input.close();
}}