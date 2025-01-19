// Java Program For Array Rotation

package Assignment_1;
import java.util.*;
public class arrayRotation {
    public static void main(String args[]) {
        System.out.println("Before Rotation");
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter Type of Rotation (L for Left, R for Right)");
        Scanner sc = new Scanner(System.in);
        char rotationType = sc.next().charAt(0);

        System.out.println("Enter Number Of Rotations");
        int n = sc.nextInt();

        if (rotationType == 'L' || rotationType == 'l') {
            leftRotation(arr, n);
        } else if (rotationType == 'R' || rotationType == 'r') {
            rightRotation(arr, n);
        } else {
            System.out.println("Invalid Rotation Type");
        }

        System.out.println("After Rotation");
        System.out.println(Arrays.toString(arr));
    }

    public static void leftRotation(int[] arr, int n) {
        while (n != 0) {
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
            n--;
        }
    }

    public static void rightRotation(int[] arr, int n) {
        while (n != 0) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            n--;
        }
    }
}


