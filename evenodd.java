import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) even.add(num);
            else odd.add(num);
        }

        even.addAll(odd); // Merge even and odd lists
        for (int num : even) System.out.print(num + " ");
    }
}
