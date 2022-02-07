import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Simple Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Select Oprations:");
        System.out.print("1: Add\n2: Subtract\n3: Multiply\n4: Divide\n");
        int opr = input.nextInt();
        switch (opr) {
            case 1: {
                System.out.println("Addition: " + (num1 + num2));
                break;
            }
            case 2: {
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            }
            case 3: {
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            }
            case 4: {
                System.out.println("Division: " + (num1 / num2));
                break;
            }
            default: {
                System.out.println("Invalid Input");
            }
        }
    }
}
