// java program for factorial

package Assignment_1;


import java.util.Scanner;
public class factorial {
	
	static int fact(int num)
	{   
		if(num==0 )
			return 1;
			return num*fact(num-1);
		
	}
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter Number To Find Factorial :");
    	  int num=sc.nextInt();
    	  int res=fact(num);
    	  System.out.println(res);
    	  
    	  //int fact=1
    	  
    	  /*  factorial of a number without recursion
    	   * while(num>0)
    	  {
    	    fact=fact*num;
    	    num--;
    	  }
    	  System.out.println(fact);
    	  
    	  */
      }
}

