package Assignment_1;

import java.util.Scanner;
public class largestNumber {
           public static void main(String args[]) {
        	   Scanner sc=new Scanner(System.in);
        	   System.out.println("Enter How Many Values You Want To Insert Into Array");
         	  int n=sc.nextInt();
         	  int [] arr=new int[n];
         	  System.out.println("Enter "+n+" Values Into Array");
         	  for(int i=0;i<n;i++) {
         		  arr[i]=sc.nextInt();
         	  }
         	 int max=arr[0];
         	  int min=arr[0];
         	 for(int i=0;i<arr.length;i++)
       	  {
       		  if(max<arr[i])
       			  max=arr[i];
       	/*	 else if(min>arr[i])
       			  min=arr[i];
       	*/
       	   
       			  
       	  }
         	  System.out.println("Largest Number is : "+max);
         //	  System.out.println("Minimum Number is : "+min);
         	  
           }
}
