// Java Program to Copy All the Elements of One Array to Another Array

package Assignment_1;
import java.util.*;
public class copyArrayElements {
	  public static void main(String args[]) {
	        int arr1[] = {1, 2, 3,7,8,6,9,4,5};
	        int arr2[]=Arrays.copyOf(arr1, arr1.length);
	        System.out.println("Original Array");
	  		System.out.println(Arrays.toString(arr1));
	  		System.out.println("Copy Of Original Array");
	  		System.out.println(Arrays.toString(arr2));
	  
	  }
}