public class LinkedList1 {
    //Search for a key in linked list. Return the index where it is found.If not found, return -1.
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
    public int search(int key){//iterative approach
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){//key found
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;//key not found
    }
    public int helper(Node head,int key){
        if(head==null){//key not found
            return -1;
        }
        if(head.data==key){//key found
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){//recursive approach
        return helper(head,key);
    }
    public static void main(String[] args) {
        LinkedList1 ll1=new LinkedList1();
        ll1.addFirst(4);
        ll1.addFirst(3);
        ll1.addFirst(2);
        ll1.addFirst(1);
        System.out.println(ll1.search(3));
        System.out.println(ll1.search(10));
        System.out.println(ll1.recSearch(3));
        System.out.println(ll1.recSearch(10));
    }
}
