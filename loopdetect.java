import java.util.Scanner;

class Node {
    int num;
    Node next;
    Node(int val) {
        num = val;
        next = null;
    }
}

public class Main {

    // Insert a new node at the end of the list
    static Node insertNode(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) return newNode;
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        return head;
    }

    // Detect cycle using Floyd's Tortoise and Hare method
    static boolean cycleDetect(Node head) {
        if (head == null) return false;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;  // Cycle detected
        }
        return false;
    }

    // Create a cycle by connecting the b-th node to the a-th node
    static void createCycle(Node head, int a, int b) {
        Node p1 = head, p2 = head;
        for (int i = 0; i < a; i++) p1 = p1.next;
        for (int i = 0; i < b; i++) p2 = p2.next;
        p2.next = p1; // Create cycle
    }

    // Display the list
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.num + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        for (int i = 0; i < n; i++) {
            head = insertNode(head, sc.nextInt());
        }
        display(head);
        int a = sc.nextInt(), b = sc.nextInt();
        createCycle(head, a, b);
        if (cycleDetect(head)) System.out.println("Cycle detected");
        else System.out.println("Cycle not detected");
    }
}
