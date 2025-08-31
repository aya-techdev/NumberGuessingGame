import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100)+1;
        System.out.println("HELLO in this number guessing game");
        System.out.println("Please enter your guess: (it has to be between 1 and 100) ");
        int guess = input.nextInt();
        while (guess != number) {
            System.out.println("Sorry, you didn't guessed it right ! ");
            if (guess > number )
                System.out.println("your guess is biger than the number!");
            else if (guess < number)
                System.out.println("your guess is smaller than the number!");

            System.out.println("try again ");
            guess = input.nextInt();
        }
        System.out.println("Congratulations! You guessed it!");
    }
}