// Java Program to Find the Transpose

package Assignment_1;

import java.util.Arrays;

public class transposeOfMatrix {
	public static void main(String args[]) 
	{
		int [][] arr1= {{1,2,3},{1,2,3},{1,2,3}};
		int [][] arr=new int[3][3];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				arr[i][j]=arr1[j][i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		
		}
		
}
	
}
