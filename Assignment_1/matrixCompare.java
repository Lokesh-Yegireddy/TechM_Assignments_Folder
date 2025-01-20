// Java Program to Check Whether Two Matrix Arrays Are Equal or Not

package Assignment_1;

import java.util.Arrays;

public class matrixCompare
{
	public static void main(String args[]) 
	{
		int [][] arr1= {{1,2,3},{1,2,3},{1,2,3}};
		int [][] arr2= {{1,2,3},{1,2,3},{1,2,3}};
		
		if(Arrays.deepEquals(arr1,arr2))
			System.out.println("Two Matrixes are Equal");
		else
			System.out.println("Two Matrixes are Not Equal");
			
		
	
}

}
