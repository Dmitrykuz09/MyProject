import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randNum = random.nextInt(100);
        int guess;
        int tries = 0;
        System.out.println("Guess number: ");


        while (true)
        {
            guess = scanner.nextInt();
        if (guess < randNum)
        {
            System.out.println("The guessNum is low than randNum");
            ++tries;

        }
        else if (guess > randNum)
        {
            System.out.println("The guessNum is more than randNum");
            ++tries;

        }
        else {
            System.out.println("You win!" + "Tries: " + tries);
            break;
        }

        }
    }
}