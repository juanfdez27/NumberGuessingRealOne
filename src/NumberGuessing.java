import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[]args){
        Scanner keyboard;
        int pickedNumber;
        int guess;
        pickedNumber = (int) (Math.random()*100);
        keyboard = new Scanner(System.in);
        guess = keyboard.nextInt();
        System.out.println(pickedNumber);

        if (guess < pickedNumber){
             System.out.println("Nope, too low. Guess again");
            }
        else if (guess > pickedNumber){
            System.out.println("Nope, too high. Guess again");
        }
        else if (guess == pickedNumber){
            System.out.println("CORRECT!!! You guessed it!");
        }
    }
    }



