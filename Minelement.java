import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Stack is Empty");
            return;
        }

        int minEle = Integer.MAX_VALUE;
        int last = 0; // Tracks last inserted element

        for (int i = 0; i < n; i++) {
            last = sc.nextInt();
            minEle = Math.min(minEle, last);
            System.out.println("Number Inserted: " + last);
        }

        System.out.println("Minimum element: " + minEle);
        System.out.println("Removed element: " + last);
        System.out.println("Stack is Empty");
    }
}
