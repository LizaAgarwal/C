import org.w3c.dom.Node;

public class LinkedList6 {
    //removing cycle in linkedlist
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
     public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
            if(slow==fast){//cycle exists
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        //step 1- detect cycle
        Node slow=head;
        Node fast=head;
        boolean exists=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
            if(slow==fast){
                exists=true;
                break;
            }
        }
        if(exists==false){
            return;
        }
        //step 2-find meeting point of slow & fast(when s & f meet 2nd time)
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;//+1
            fast=fast.next;//+1
        }
        //step 3-remove cycle
        prev.next=null;
    }
    public static void main(String[] args) {
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        //1 -> 2 -> 3 -> 2
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
