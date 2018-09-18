import java.util.Scanner;

public class Magic8Ball {

public static void main(String[]args){
    Scanner keyboard;

    int testing;
    String question;
    int number;

    keyboard = new Scanner(System.in);
    System.out.println("Welcome to the Magic 8 Ball, what is your yes or no question?");
    question = keyboard.nextLine();
    System.out.println("Choose a number 1-100.");
    number = keyboard.nextInt();

    if(number >= 1 && number <=10) {
        System.out.println("Yes.");
    }
    else if (number >= 11 && number <=20){
        System.out.println("No.");
    }
    else if (number >= 21 && number <=30 ) {
        System.out.println("I disagree.");
    }
    else if (number >= 31 && number <=40 ) {
        System.out.println("I agree.");
    }
    else if (number >= 41 && number <=50 ) {
        System.out.println("I'm very doubtful.");
    }
    else if (number >= 51 && number <=60 ) {
        System.out.println("Without a doubt!");
    }
    else if (number >= 61 && number <=70 ) {
        System.out.println("Congratulations you win!");
    }
    else if (number >= 71 && number <=80 ) {
        System.out.println("Go away, it's a no.");
    }
    else if (number >= 81 && number <=90 ) {
        System.out.println("Don't count on it.");
    }
    else if (number >= 91 && number <=100 ) {
        System.out.println("Hecks yes.");
    }









}



}
