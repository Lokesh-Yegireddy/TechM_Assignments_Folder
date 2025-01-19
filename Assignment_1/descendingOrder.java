//Java Program to Sort the Elements of an Array in Descending Order


package Assignment_1;

import java.util.Arrays;

public class descendingOrder {
public static void main(String args[])
{
		int temp;
		int[] arr= {10,64,23,12,25,11,45};
		System.out.println("Before Sorting : "+Arrays.toString(arr));

		for(int i=0;i<arr.length;i++)
		{   
			if(i==arr.length-1)
				break;
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			
			}
		}
		System.out.println("After Sorting : "+Arrays.toString(arr));
		int [] newArray=new int [arr.length];
		int count=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			newArray[count]=arr[i];
			count++;
		}
		System.out.println("Descending Order : "+Arrays.toString(newArray));
}
}
