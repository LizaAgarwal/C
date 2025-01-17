public class LinkedList4 {
    //Check if linkedlist is a palindrome
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
    //slow-fast approach
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head==null || head.next==null){//incase of empty ll or ll containing only one node
            return true;
        }
        //find middle node
        Node mid=findMid(head); 
        //Reverse 2nd half of linkedlist
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        //check if 1st half = 2nd half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList4 ll4=new LinkedList4();
        ll4.addFirst(1);
        ll4.addFirst(2);
        ll4.addFirst(3);
        ll4.addFirst(1);
        System.out.println(ll4.checkPalindrome());
    }
}
