import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read input into array
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr); // Sort array in O(n log n)

        // Print sorted array
        for (int num : arr) System.out.print(num + " ");
    }
}
