import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform addition
        int sum = num1 + num2;

        // Perform subtraction
        int difference = num1 - num2;

        // Display the results
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);

        scanner.close();
    }
}
