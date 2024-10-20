package LinkList;

public class Linklist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        size++;
        // create a new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // NewNode next = head
        newNode.next = head;
        head = newNode; // link
    }

    public void addLast(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void Middadd(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // -------------------------Remove -------------------------------

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } else {
            // Traverse the list to find the second-to-last node (prev)
            Node prev = head;
            for (int i = 0; i < size - 2; i++) {
                prev = prev.next;
            }

            // Get the value of the last node (tail)
            int val = tail.data;

            // Update the references
            prev.next = null;
            tail = prev;
            size--;

            return val;
        }
    }

    // -----------------------Search in
    // linklist(iterative)-----------------------------------------

    public int itrsearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        // Key not found
        return -1;
    }

    // -----------------------Search in
    // linklist(Recursive)-----------------------------------------
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;

        }

        if (head.data == key) {
            return 0;

        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);

    }

    // ------------------------------Reverse a Linklist -----------------------

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // ------------------FInd & Remove Node From and -----------------------------

    public void deleteNthFromEnd(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (n == size) {
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = size - n;
        Node prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    // ---------------------------------check if LL is Palindrome -----------------

    public static void main(String[] args) {
        Linklist l1 = new Linklist();
        // l1.print();
        // l1.addFirst(1);
        // l1.print();
        // l1.addFirst(7);
        // l1.print();
        // l1.addFirst(2);
        // l1.print();
        // l1.addLast(3);
        // l1.print();
        // l1.addLast(4);
        // l1.print();

        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(9);
        l1.Middadd(3, 9);
        l1.addFirst(7);
        l1.addLast(5);

        // l1.print();

        // l1.removeFirst();
        // l1.print();
        // l1.removeLast();
        // l1.print();
        // // System.out.println( l1.size);

        // System.out.println(l1.recSearch(1));

        // l1.reverse();

        l1.print();

    }
}
