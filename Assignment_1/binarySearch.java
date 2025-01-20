//  Binary Search
package Assignment_1;

public class binarySearch {
	
	    public static void main(String[] args) {
	        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
	        int target = 7;
	        int left = 0, right = arr.length - 1;
	        int result = -1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                result = mid;
	                break;
	            }
	            if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        if (result == -1) {
	            System.out.println("Element not found.");
	        } else {
	            System.out.println("Element found at index: " + result);
	        }
	    }
	}


