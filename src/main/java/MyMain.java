import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        int[] newarr = new int[arr.length];
        newarr[arr.length-1] = arr[0];
        for (int x = 1; x<= arr.length-1; x++) {
            newarr[x-1] = arr[x];
        }

        // REPLACE WITH YOUR CODE HERE
        return newarr;
    }

    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
        int[] newarr = new int[arr.length];
        for (int x = 0; x< arr.length-1; x++) {
            newarr[x+1] = arr[x];
        }
        newarr[0] = arr[arr.length -1];
        // REPLACE WITH YOUR CODE HERE
        return newarr;
    }

    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) {
        int[] newarr = new int[arr.length];
        for (int x = 0; x < arr.length; x++) {
            int count = 0;
            for (int y:newarr) {
                if (y == arr[x]) {
                    count ++;
                }
            }
            if (count >= 1) {
                newarr[x] = -1;
            } else {
                newarr[x] = arr[x];
            }
        }
        // REPLACE THIS WITH YOUR CODE
        return newarr;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
        System.out.println(Arrays.toString(rotateLeft(new int[] {4,7,2,4,5})));//{7,2,4,5,4}
        System.out.println(Arrays.toString(rotateRight(new int[] {4,7,2,4,5}))); // {5,4,7,2,
        // 4}
        System.out.println(Arrays.toString(duplicateReplacer(new int[] {4,3,35,42,3,4,5,4}))); // {4,3,35,42,-1,-1,5,-1}
    }
}
