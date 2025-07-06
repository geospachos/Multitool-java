package functions;
import java.util.Scanner;

public class Game {

    public static void gameMenu(Scanner scanner) 
    {
        while (true) 
        {
            System.out.println("");
            System.out.println("            Guess The Number!");
            System.out.println("");
            System.out.println("                1.Play");
            System.out.println("                2.Tutorial");
            System.out.println("                3.Exit");
            System.out.println("");
            System.out.print("            Your choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) 
            {
                game(scanner);        
            }

            else if (choice.equals("2")) 
            {
                System.out.println("");
                System.out.println("The Game will generate a random number between 1 and 10 on easy and between 1 and 100 on hard.");
                System.out.println("You have 3 tries to guess the number.");
                System.out.println("If you guess the number, you win! If not, you lose.");
                System.out.println("Good luck!");
            } 
            
            else if (choice.equals("3")) 
            {
                break;
            } 
            
            else 
            {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void game(Scanner scanner) {
        while (true) {
            System.out.println("");
            System.out.println("            Guess The Number!");
            System.out.println("");
            System.out.println("                1.Easy");
            System.out.println("                2.Hard");
            System.out.println("                3.Back");
            System.out.println("");
            System.out.print("            Your choice: ");
            String difficulty = scanner.nextLine();

            if (difficulty.equals("1")) {
                playRound(scanner, 10, 3);
            } else if (difficulty.equals("2")) {
                playRound(scanner, 100, 5);
            } else if (difficulty.equals("3")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void playRound(Scanner scanner, int max, int tries) {
        int num = (int) (Math.random() * max + 1);
        boolean guessed = false;
        System.out.println("");
        System.out.println("A number has been generated!");
        System.out.println("");
        for (int i = 0; i < tries; i++) {
            System.out.print("            Your guess: ");
            String guessStr = scanner.nextLine();
            int guess;
            try {
                guess = Integer.parseInt(guessStr);
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.println("Please enter a valid number.");
                i--; // Don't count invalid input as a try
                continue;
            }
            if (guess == num) {
                System.out.println("");
                System.out.println("Congratulations! You guessed the number!");
                guessed = true;
                break;
            } else {
                System.out.println("");
                System.out.println("Wrong guess! You have " + (tries - i - 1) + " tries left.");
            }
        }
        if (!guessed) {
            System.out.println("");
            System.out.println("You have used all your tries! The number was: " + num);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
    }
}