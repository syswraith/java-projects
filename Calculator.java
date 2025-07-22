/*
Implement a robust Java calculator program that captures user input
dynamically, processes mathematical operations using conditional
logic and looping constructs and ensures efficient error handling.
- scanner
- switch case

*/

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        boolean notExit = true;
        int number1, number2;
        char operation;

        while (notExit)
        {
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            System.out.println("+ for addition\n- for subtraction\n* for multiplication\n/ for division\n% for modulus");
            System.out.print("Enter operation: ");
            operation = scanner.next().charAt(0);
            System.out.print("Enter number 1: ");
            number1 = scanner.nextInt();
            System.out.print("Enter number 2: ");
            number2 = scanner.nextInt();
            System.out.print("Result: ");

            switch(operation)
            {
                case '+': 
                    System.out.println(number1 + number2);
                    break;
                case '-': 
                    System.out.println(number1 - number2);
                    break;
                case '*': 
                    System.out.println(number1 * number2);
                    break;
                case '/': 
                    System.out.println(number1 / number2);
                    break;
                case '%': 
                    System.out.println(number1 % number2);
                    break;        
            }
        }
    }
}
