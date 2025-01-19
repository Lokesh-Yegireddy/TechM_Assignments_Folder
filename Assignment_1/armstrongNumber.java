// java program to find out armstrong no
package Assignment_1;
import java.util.Scanner;
public class armstrongNumber {
	       public static void main(String args[]) {
	    	   Scanner sc=new Scanner(System.in);
	    	   System.out.println("Enter Any Number:");
	    	   int num=sc.nextInt();
	    	   int count=0;
	    	   int d=0;
	    	   double res=0;
	    	   int temp1=num;
	    	   int temp2=num;
	    	   while(temp1!=0) {
	    		   d=temp1%10;
	    		   count++;
	    		   temp1=temp1/10;   
	    	   }
	    	   d=0;
	    	   while(temp2!=0) {
	    		   d=temp2%10;
	    		   res=res+Math.pow(d,count);
	    		   temp2=temp2/10;
	    	   }
	    	   if(res==num)
	    		   System.out.println(num+" Is An Armstrong Number");
	    	   else
	    		   System.out.println(num+" Is Not An Armstrong Number");
	    	   
	}
	
}
