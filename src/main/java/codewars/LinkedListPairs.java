package codewars;

public class LinkedListPairs {
    public static Node swapPairs(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node result = head.next;

        Node prev = null;
        while (head != null && head.next != null) {
            if (prev != null) {
                prev.next = head.next;
            }
            //head will become the first after swap
            prev = head;

            //the actual swap
            Node temp = head.next;
            head.next = temp.next;
            temp.next = head;

            //head is the second one after the swap. Take the next of that one for the new head in the next iteration
            head = head.next;
        }

        return result;
    }

}

class Node {
    private String value;
    public Node next;

    public Node(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return this.value;
    }

    public String printList() {
        if (this.next == null) return this.toString() + " ->";
        return this.toString() + " -> " + next.printList();
    }
}
