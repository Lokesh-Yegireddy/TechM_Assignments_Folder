// Java Program to Add Two Matrices
package Assignment_1;
public class matrixAddition {
public static void main(String args[]) {
	int [][] arr1= {{1,2,3},{6,5,1},{4,1,0}};
	int [][] arr2= {{0,1,1},{3,0,1},{3,1,1}};
	int [][] newarr=new int[arr1.length][arr1[0].length];
	for(int i=0;i<arr1.length;i++)
	{
		for(int j=0;j<arr2.length;j++)
		{
			newarr[i][j]=arr1[i][j]+arr2[i][j];
		}
	}
	
	for(int i=0;i<newarr.length;i++)
	{
		for(int j=0;j<newarr[i].length;j++) {
			System.out.print(newarr[i][j]+" ");
		}
		System.out.println();
	
	}
}
}
