// java program for fibonacci series

package Assignment_1;
public class fibonacciSeries {
	public static void main(String args[])
	{
		int f1=0;
		int f2=1;
		for(int i=0;i<10;i++)
		{   
			if(i==0)
			System.out.print(i+" ");
			else {
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.print(f1+" ");
		}}
		
	}
	}

