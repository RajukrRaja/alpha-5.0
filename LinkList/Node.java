

public class Node {
    
    int data;
    Node Next;

    Node(int x){
        this.data= x;
        this.Next =null;
    }

void  printlist(Node head ){
    Node curr = head;

    while(curr!=null){
        System.out.println(curr);
        curr = curr.next;
    }
}
    


}

class LinkList{

    public static void main(String[] args) {
        

        Node n1= new Node(1);
             n1.Next = new Node(2);
             n1.Next.Next = new Node(0);
        
    }


}
