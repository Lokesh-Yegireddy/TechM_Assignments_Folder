// Java Program to Check if Two Arrays Are Equal or Not

package Assignment_1;
import java.util.Arrays;
public class compareArrays {
public static void main(String args[])
{
	int arr1[]= {1,2,3,4,5};
	int arr2[]= {1,2,3,4,5};
	if(Arrays.equals(arr1,arr2))
	System.out.println("Two Arrays Are Equal");
	else
		System.out.println("Two Arrays Are Not Equal");
}
}
