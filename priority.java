import java.util.*;

class Main {
    static class Node {
        int data, priority;
        Node(int d, int p) { data = d; priority = p; }
    }

    static PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> b.priority - a.priority);

    private static void push(int data, int priority) { pq.add(new Node(data, priority)); }
    
    private static int peek() { return pq.isEmpty() ? -1 : pq.peek().data; }
    
    private static int pop() { return pq.isEmpty() ? -1 : pq.poll().data; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) push(sc.nextInt(), sc.nextInt());
        System.out.println(peek());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(peek());
    }
}
