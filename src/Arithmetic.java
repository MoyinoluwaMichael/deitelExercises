public class Arithmetic {

    public static void main(String[] args) {
        int number1 = 98;
        int number2 = 5;
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.printf("Sum: %d + %d = %d%n", number1, number2, sum);
        System.out.printf("Difference: %d - %d = %d%n", number1, number2, difference);
        System.out.printf("Product: %d * %d = %d%n", number1, number2, product);
        System.out.printf("Quotient: %d / %d = %d%n", number1, number2, quotient);
        System.out.printf("Remainder: %d %% %d = %d%n", number1, number2, remainder);
    }
}
