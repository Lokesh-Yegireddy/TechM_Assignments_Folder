
// Java Program to Search an Element in an Array

import java.util.Scanner;
public class searchElement{
	  public static void main(String args[]) {
   	   Scanner sc=new Scanner(System.in);
   	   System.out.println("Enter How Many Values You Want To Insert Into Array");
    	  int n=sc.nextInt();
    	  int [] arr=new int[n];
    	  System.out.println("Enter "+n+" Values Into Array");
    	  for(int i=0;i<n;i++) {
    		  arr[i]=sc.nextInt();
    	  }
    	  System.out.println("Enter Key Value To Search In Array");
    	  int key=sc.nextInt();
    	  int i;
    	  for( i=0;i<arr.length;i++)
       	  {
       		 if(key==arr[i]) 
       		 {
       			System.out.println("Element "+key+" is Found at location "+(i));
       		    break;
       		    //return;
       		  }    	 
       	  }   

    	  if(i==arr.length)
    	  System.out.println("Element "+key+" is not found at any location in array ");
    	
}
}