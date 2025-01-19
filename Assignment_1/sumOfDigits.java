// java program to find sum  of digits
package Assignment_1;
import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();  // Input number
        sc.close();

        int sum = 0;
        
        // Sum of digits
        while (num != 0) {
            sum += num % 10;  // Get the last digit
            num /= 10;  // Remove the last digit
        }

        System.out.println("The sum of digits is: " + sum);
    }
}
