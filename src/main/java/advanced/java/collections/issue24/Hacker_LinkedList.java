package advanced.java.collections.issue24;

import java.util.Scanner;

/*https://www.hackerrank.com/challenges/30-linked-list/problem*/

public class Hacker_LinkedList {
    public static Node insert(Node head, int data) {
        if (head == null) {
            return new Node(data);
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new Node(data);
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }

}


