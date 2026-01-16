import java.util.*;

public class insertionsort {
    public static void main(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int n = arr.length();
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            j--;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = key;
            }
        }

    }
}
