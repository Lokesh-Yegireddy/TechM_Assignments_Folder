// missing array element
package Assignment_1;

public class missingArrayValue {
	
	public static void main(String[] args)
	{
		int[] arr= {1,2,4,6,7,8,12,18};
		int d;
		String str="";
		int count;
		for(int i=0;i<arr.length;i++)
		{       count=1;
			if(i!=arr.length-1)
			{   
				d=arr[i]-arr[i+1];
				while(d!=-1)
				{
					str+=(arr[i]+count)+" ";
					d++;
					count++;
				}
				
			}
			
		}
		System.out.println(str);	
	}
	}