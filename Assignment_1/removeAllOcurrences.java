// Java Program to Remove All Occurrences of an Element in an Array

package Assignment_1;

import java.util.*;

public class removeAllOcurrences {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element you want to remove from an array");
		int element=sc.nextInt();
		int arr[]= {1,2,4,1,1,1,6};
		String str="";
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(element==arr[i])
			{
				count++;
				continue;
			}
			else
				str+=arr[i]+" ";
		}
		if(count==0)
			System.out.println("No element found in the array");
		else
		System.out.println(str);
		


	}
	}


