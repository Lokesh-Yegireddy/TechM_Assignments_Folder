// Java Program to Merge Two Arrays
package Assignment_1;
import java.util.Arrays;
public class mergeArrays {
public static void main(String args[])
{
	int [] array1= {1,2,3,4};
	int [] array2= {5,6,7,8,9};
	int [] newArray=new int [array1.length+array2.length];
	int j=0;
	for(int i=0;i<newArray.length;i++)
	{   
		if(i<array1.length)
		 newArray[i]=array1[i];
		else
		{
		newArray[i]=array2[j];
		j++;
	}
	}
	System.out.println(Arrays.toString(newArray));
}
}
