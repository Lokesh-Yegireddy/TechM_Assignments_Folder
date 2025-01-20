package Assignment_1;

public class sumOfDiagonals
{
	public static void main(String args[]) 
	{
		int [][] arr1= {{1,2,3},{1,2,3},{1,2,3}};
		int sum=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{    if(i==j)
				sum+=arr1[i][j];
			}
		}
		
			System.out.println("sum of diagonals :"+sum);
		
		}
}
