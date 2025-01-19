// Java Program to Remove Duplicate Elements From an Array

package Assignment_1;
// Java Program to Remove Duplicate Elements From an Array
import java.util.Arrays;
public class removeDuplicate {
public static void main(String args[])
{
	int [] arr= {2,9,5,7,1,1,5};
	Arrays.sort(arr);
	int count=0;
	String str="";
	int j=0;
	if(arr.length!=0) {
	for(int i=0;i<arr.length;i++)
	{     i=j;
	 if(i!=arr.length-1)
	 {
		for( j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{   //count++;
				continue;
			}
			else {
				str+=arr[i]+" ";
				break;
			}
				
		}
	
			
	}else
		str+=arr[i]+" ";
	 
	 // adding last index value when it is duplicate number 
	 if(j==arr.length) {
		 str+=arr[arr.length-1]+" ";
	
	 }
	}
	System.out.println(str);
	}
	else
		System.out.println("Input Empty Error..!");
		
}
}

