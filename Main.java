import java.util.Scanner;
import functions.Calc;
import functions.Game;

class Main
{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("MULTITOOL JAVA BY GEOSPACHOS");
        System.out.println("(Hint: Type 'help' for commands)");

        while (true) {
            System.out.print(">");
            String input = scanner.nextLine();

            if (input.equals("help")) 
            {
                System.out.println("help: Displays this help message");
                System.out.println("exit: Exits the program");
                System.out.println("calc: Opens the calculator");
                System.out.println("about: Displays information about the CLI app");
                System.out.println("game: Opens the game");
                System.out.println("clear: Clears the screen");
            } 
            
            else if (input.equals("exit")) 
            {
                break;
            } 

            else if (input.equals("calc")) 
            {
                Calc.calc(scanner);
            } 

            else if (input.equals("about"))
            {
                System.out.println("Multitool Java v0.10 by geospachos");
            }

            else if (input.equals("game"))
            {
                Game.gameMenu(scanner);
            }

            else if (input.equals("clear"))
            {
                for (byte i = 0; i <= 50; i++)
                {
                    System.out.println();
                }
            }
            
            else 
            {
                System.out.println("Unknown command. Type 'help' for commands.");
            }
        }

        scanner.close();
    }

}