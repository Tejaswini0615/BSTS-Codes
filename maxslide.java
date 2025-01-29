import java.util.*;

public class Main {
    public static int[] maxSliding(int[] arr, int w) {
        int n = arr.length;
        int[] res = new int[n - w + 1];
        int[] left = new int[n], right = new int[n];

        left[0] = arr[0];
        right[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++) {
            left[i] = (i % w == 0) ? arr[i] : Math.max(left[i - 1], arr[i]);
            int j = n - i - 1;
            right[j] = (j % w == 0) ? arr[j] : Math.max(right[j + 1], arr[j]);
        }

        for (int i = 0; i + w <= n; i++)
            res[i] = Math.max(right[i], left[i + w - 1]);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        for (int x : maxSliding(arr, k)) System.out.print(x + " ");
    }
}
