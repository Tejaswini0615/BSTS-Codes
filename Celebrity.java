import java.util.*;

public class Main {
    public static int findCelebrity(int[][] mat) {
        int n = mat.length, c = 0;
        for (int i = 1; i < n; i++) 
            if (mat[c][i] == 1) c = i;

        for (int i = 0; i < n; i++) 
            if (i != c && (mat[c][i] == 1 || mat[i][c] == 0)) return -1;

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), mat[][] = new int[n][n];
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                mat[i][j] = sc.nextInt();

        int res = findCelebrity(mat);
        System.out.println(res == -1 ? "There is no celebrity in the party" : res + " is the celebrity in the party");
    }
}
