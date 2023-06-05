package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        do {
            System.out.print("Enter first number : ");
            int a = sc.nextInt();
            System.out.print("Enter second number : ");
            int b = sc.nextInt();
            System.out.print("Please enter one of symbol +,-,*, / : ");
            char operation = sc.next().charAt(0);
            Calculator obj = new Calculator();
            switch (operation) {
                case '+':
                    obj.calculateResult(a, b, operation);
                    break;
                case '-':
                    obj.calculateResult(a, b, operation);
                    break;
                case '*':
                    obj.calculateResult(a, b, operation);
                    break;
                case '/':
                    obj.calculateResult(a, b, operation);
                    break;
                default:
                    System.out.println("Invalid symbol.");
            }
            System.out.println("Would you like to do more calculation Please enter 'Y' or 'N' : ");
            c = sc.next().charAt(0);
        } while (c == 'Y' || c == 'y');
        sc.close();
    }
}
