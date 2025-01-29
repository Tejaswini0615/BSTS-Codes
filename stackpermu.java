import java.util.*;

class Main {
    static boolean check(int[] ip, int[] op, int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0, j = 0; i < n; i++) {
            stack.push(ip[i]);
            while (!stack.isEmpty() && stack.peek() == op[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ip = new int[n], op = new int[n];

        for (int i = 0; i < n; i++) ip[i] = sc.nextInt();
        for (int i = 0; i < n; i++) op[i] = sc.nextInt();

        System.out.println(check(ip, op, n) ? "Valid Stack Permutation" : "Invalid Stack Permutation");
    }
}
