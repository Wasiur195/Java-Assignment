import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // read input number
        int sum = 0;
        while (number != 0) {
            int digit = number % 10; // extract the last digit
            sum += digit; // add the last digit to the sum
            number /= 10; // remove the last digit
        }
        System.out.println("Sum of digits: " + sum);
    }
}
