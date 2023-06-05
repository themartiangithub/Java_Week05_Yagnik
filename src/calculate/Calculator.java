package calculate;

public class Calculator {
    int result = 0;
    public void addition(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is : " +result);
    }

    public void substraction(int a, int b) {
        System.out.println("Substraction of " + a + " and " + b + " is : " +result);
    }

    public void division(int a, int b) {
        System.out.println("Division of " + a + " and " + b + " is : " +result);
    }

    public void multiplication(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " is : " +result);
    }

    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            result = a + b;
            addition(a, b);
        } else if (symbol == '-') {
            result = a - b;
            substraction(a, b);
        } else if (symbol == '*') {
            result = a * b;
            multiplication(a, b);
        } else if (symbol == '/') {
            if (b != 0) {
                result = a / b;
                division(a, b);
            } else {
                System.out.println("Division by zero is not possible.");
            }
        }
    }
}
