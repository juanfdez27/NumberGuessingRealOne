import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[]args){
        Scanner keyboard;
        int pickedNumber;
        int guess;
        System.out.println("Guess the number I am thinking of from 0-100");
        pickedNumber = (int) (Math.random()*100);
        keyboard = new Scanner(System.in);
        guess = keyboard.nextInt();
        System.out.println(pickedNumber);

            do {
                if (guess < pickedNumber) {
                    System.out.println("Nope, too low. Guess again");
                }
                if (guess > pickedNumber) {
                    System.out.println("Nope, too high. Guess again");
                }
            }while (guess != pickedNumber);




        if (guess == pickedNumber){
            System.out.println("CORRECT!!! You guessed it!");
        }
    }
    }



