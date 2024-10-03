import java.util.Scanner;
import java.lang.Math;
public class HighOrLow {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        double userGuess; // i have the userGuess variable set as a double because it doesnt really matter whether the user guesses a number thats an int/double, since no matter if the guess is a decimal or not it's still viable to be compared to the computer's guess
        int computerGuess = (int)(Math.random() * 10) + 1; // the computerGuess variable will always be an integer for the sake of simplicity
        boolean correctGuess = false;

        System.out.println("Hello! Let's play a game.");
        do {
            System.out.println("Try to guess my number [1,10]!");
            if (scan.hasNextDouble()) {
                userGuess = scan.nextDouble();
                if (userGuess > computerGuess) {
                    System.out.println("Sorry, you guessed a number that is too large. Try again!");
                    scan.nextLine();
                } else if (userGuess<computerGuess) {
                    System.out.println("Sorry, you guessed a number that is too low. Try again!");
                    scan.nextLine();
                } else {
                    System.out.println("You guessed right! Thanks for playing!");
                    correctGuess = true;
                }
            } else {
                System.out.println("Sorry - you have inputted an invalid response. PLease try again.");
                scan.nextLine();
            }
        } while (!correctGuess);

    }
}