import java.util.Scanner;

public class Formatting {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number: ");
        double num = keyboard.nextDouble();

        System.out.printf("Your number is %.2f%n", num);

        System.out.print("Enter word: ");
        String word = keyboard.next();

        System.out.printf("Your word (15 characters wide) is '%-15s'%n", word);
        System.out.printf("Your word (limited to 4 characters) is '%4s'%n", word);
    }
}
