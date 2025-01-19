// maximum and minimum of digit

package Assignment_1;
import java.util.Scanner;

public class MaxMinDigit {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();
          int max=num%10,min=num%10;
          int d;
       
            while (num != 0)
            {
            	d=num%10;
            	if(d>max)
            		max=d;
            	if(d<min)
            		min=d;
            	num /=10;
            }
            
          
        System.out.println("Maximum Digit: " + max);
        System.out.println("Minimum Digit: " + min);
    }
}
