import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[]args){
        Scanner keyboard;
        int pickedNmuber;
        int guess;
        pickedNmuber = (int) (Math.random()*100);
        keyboard = new Scanner(System.in);
        guess = keyboard.nextInt();
        System.out.println(pickedNmuber);




        }

    }

