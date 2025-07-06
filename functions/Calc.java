package functions;
import java.util.Scanner;

public class Calc 
{

    public static void calc(Scanner scanner)
    {       
        while (true) 
        {
        System.out.println("            Calculator");
        System.out.println("");
        System.out.println("                1.Addition");
        System.out.println("                2.Subtraction");
        System.out.println("                3.Multiplication");
        System.out.println("                4.Division");
        System.out.println("                5.Exit");
        System.out.println("");
        

            System.out.print("            Your choice: ");
            Byte choice = scanner.nextByte();

            if (choice == 1)
            {
                calcAdd(scanner);
            }
            else if (choice == 2)
            {
                calcSub(scanner);
            }
            else if (choice == 3)
            {
                calcMulti(scanner);
            }
            else if (choice == 4)
            {
                calcDiv(scanner);
            }
            else if (choice == 5)
            {
                break;
            }
        }
    }
    
    public static void calcAdd(Scanner scanner)
    {
        System.out.println("");
        System.out.print("Enter first number: ");
        Integer num1 = scanner.nextInt();
        System.out.println("");
        System.out.print("Enter second number: ");
        Integer num2 = scanner.nextInt();
        System.out.println("");
        System.out.println("Result: " + (num1 + num2));
    }

    public static void calcSub(Scanner scanner)
    {
        System.out.println("");
        System.out.print("Enter first number: ");
        Integer num1 = scanner.nextInt();
        System.out.println("");
        System.out.print("Enter second number: ");
        Integer num2 = scanner.nextInt();
        System.out.println("");
        System.out.println("Result: " + (num1 - num2));
    }

    public static void calcMulti(Scanner scanner)
    {
        System.out.println("");
        System.out.print("Enter first number: ");
        Integer num1 = scanner.nextInt();
        System.out.println("");
        System.out.print("Enter second number: ");
        Integer num2 = scanner.nextInt();
        System.out.println("");
        System.out.println("Result: " + (num1 * num2));
    }

        public static void calcDiv(Scanner scanner)
    {
        System.out.println("");
        System.out.print("Enter first number: ");
        Integer num1 = scanner.nextInt();
        System.out.println("");
        System.out.print("Enter second number: ");
        Integer num2 = scanner.nextInt();
        if (num1 == 0)
        {
            System.out.println("Error: Division by 0 is not possible");
        }

        else if (num2 == 0)
        {
            System.out.println("");
            System.out.println("Error: Division by 0 is not possible");
        }

        else 
        {
        System.out.println("");
        System.out.println("Result: " + (num1 / num2));
        }
    }
}