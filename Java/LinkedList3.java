import org.w3c.dom.Node;

public class LinkedList3 {
    //find & remove nth node from end
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void removeNthNode(int n){
        //calculating size of linked list
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        
        if(n==size){//where we need to delete 1st node
            head=head.next;
            return;
        }

        int i=1;
        Node prev=head;
        while(i<size-n){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public void printLL(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList3 ll3=new LinkedList3();
        ll3.addFirst(1);
        ll3.addFirst(2);
        ll3.addFirst(3);
        ll3.addFirst(4);
        ll3.addFirst(5);
        ll3.removeNthNode(3);
        ll3.printLL();
    }
}
