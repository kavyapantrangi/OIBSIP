

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class number {

    private static Integer number;
    private static Integer numberOfGuessesLeft = 5;
    private static Integer maxNumber = 100;
    private static Integer score=100;

    public static void main(String[] args) {
        //Generate a random number
        RandomGenerator r = new RandomGenerator();
        number = r.generateInt(1, maxNumber);

        //Welcome the user
        System.out.println("Welcome to the number guessing game! You have " + numberOfGuessesLeft + " guesses to guess the number from 1 to " + maxNumber +"!");
        //Ask the user
        userinput();
    }

    public static void userinput() {

        if (numberOfGuessesLeft == 0) {
            System.out.println("You Lose! The number was " + number + ". You had " + numberOfGuessesLeft + " guesses left.");
            System.out.println("your score is 0");
            System.exit(0);
        }

       JFrame frame = new JFrame();
    String nom = JOptionPane.showInputDialog(frame,"Enter  a number  between 1 to 100:");
    int user = Integer.parseInt(nom);

        numberOfGuessesLeft--;
      

        if (tooHigh(user) == true) {
            System.out.println("your number is Higher than generated number!");
            System.out.println("You have " + numberOfGuessesLeft + " guesses left!");
              score-=10;
            userinput();
        } else if (tooLow((user)) == true) {
            System.out.println("your number is Lower than generated number");
            System.out.println("You have " + numberOfGuessesLeft + " guesses left!");
              score-=10;
            userinput();
        } else {
            System.out.println("You Won! The number was " + number + ". Your Score is" );
            System.out.println(score);
        }
    }

    public static Boolean tooHigh(Integer choice) {
        if(choice > number) {
            return true;

        } else {
            return false;
        }
    }
    public static Boolean tooLow(Integer choice) {
        if(choice < number) {
            return true;

        } else {
            return false;
        }
    }
}