// Program on Switch

package Assignment_1;
import java.util.Scanner;
public class switchDemo {
	
	static int  add(int n1,int n2) {
		return n1+n2;
	}
	static int  sub(int n1,int n2) {
		return n1-n2;
	}
	static int  mul(int n1,int n2) {
		return n1*n2;
	}
	static int  div(int n1,int n2) {
		return n1/n2;
	}
	
 public static void main(String args[])
 {
	 
	 Scanner inputReader=new Scanner(System.in);
	 int choice;
	 int n1,n2;
	 do{
	 System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n0.Exit\nEnter Your Choice...");
	  choice=inputReader.nextInt();
	 switch(choice) {
	 case 1 :   System.out.println("Enter Any Two Values To Add...");
	            System.out.println("Enter First Value : ");
	            n1=inputReader.nextInt();
	            System.out.println("Enter Second Value : ");
	            n2=inputReader.nextInt();
                int result = add( n1, n2);
                System.out.println("Sum Of Two Numbers is "+result);
                break;
	 case 2 :   System.out.println("Enter Any Two Values To Subtract...");
                System.out.println("Enter First Value : ");
                n1=inputReader.nextInt();
                System.out.println("Enter Second Value : ");
                n2=inputReader.nextInt();
                result = sub( n1, n2);
                System.out.println("Subtraction Of Two Numbers is "+result);
                break;
	 case 3 :   System.out.println("Enter Any Two Values To Multiplate...");
                System.out.println("Enter First Value : ");
                n1=inputReader.nextInt();
                System.out.println("Enter Second Value : ");
                n2=inputReader.nextInt();
                result = mul( n1, n2);
                System.out.println("Multiplication Of Two Numbers is "+result);
                break;
	 case 4 :   System.out.println("Enter Any Two Values To Division...");
                System.out.println("Enter First Value : ");
                n1=inputReader.nextInt();
                System.out.println("Enter Second Value : ");
                n2=inputReader.nextInt();
                result = div( n1, n2);
                System.out.println("Division Of Two Numbers is "+result);
                break;
	 case 0:
                System.out.println("Are you sure you want to exit? (y/n)");
                String confirm = inputReader.next();
                if (confirm.equalsIgnoreCase("y")) {
                System.out.println("Thanks For Using Our Program...!");
                boolean exitConfirmed = true;
         } else {
             System.out.println("Exiting cancelled. Returning to main menu.");
         }
         break;

                
	 default : System.out.println("Invalid! Choice...");
	 } 
	 }while(choice!=0);
	
 
 
}
}
