class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }

    public static void main(String[] args) {
        Node h1 = new Node(1);
        h1.next = new Node(2);
        h1.next.next = new Node(3);
        h1.next.next.next = new Node(4);
        h1.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(h1);

        ReverseList reverseList = new ReverseList();
        Node reversedHead = reverseList.reversNode(h1);
        
        System.out.println("Reversed List:");
        printList(reversedHead);
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class ReverseList {
    public Node reversNode(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
