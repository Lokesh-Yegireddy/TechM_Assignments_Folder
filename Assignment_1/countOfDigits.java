// count of digits
package Assignment_1;
import java.util.Scanner;

public class countOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();
        
        
           int count = 0;
       
            while (num != 0) {
                num /= 10;
                count++;
            }
        

        System.out.println("The number of digits is: " + count);
    }
}
