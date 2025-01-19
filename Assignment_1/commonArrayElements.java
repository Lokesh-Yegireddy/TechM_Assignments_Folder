// Java Program to Find Common Array Elements

package Assignment_1;

public class commonArrayElements {

    public static void main(String args[]) {
        int arr1[] = {1, 2, 3,7,8,6,9,4,5};
        int arr2[] = {1, 6, 2, 3, 4, 5,7};

        int min = Math.min(arr1.length, arr2.length);
        int max = Math.max(arr1.length, arr2.length);


        String str = "";

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < min; j++) {
                if (arr1[i] == arr2[j]) {
                    str += arr1[i] + " ";
                    break;
                }
            }
        }

        System.out.println(str);
    }
}


