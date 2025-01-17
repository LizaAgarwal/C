public class LinkedList8 {
    //Merge sort on LL
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
    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;//mid Node
    }
    private Node merge(Node head1, Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;//temp variable which points to -> mergeLL containing data -1
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }
    public Node mergeSort(Node head){
        if(head==null || head.next==null){//if ll is empty or it has only one node
            return head;
        }
        //step 1:find the mid node of ll
        Node mid=getMid(head);
        //step 2:divide the ll into two parts-left half & right half
        Node rightHead=mid.next;
        mid.next=null;
        //step 3:sort the left and right half individually
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        //step 4:merge sort left & right halfs
        return merge(newLeft,newRight); 
    }
    public void printLL(){
        if(head==null){
            System.out.println("ll is empty");
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
        LinkedList8 ll=new LinkedList8();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printLL();
        ll.head=ll.mergeSort(ll.head);
        ll.printLL();
    }
}
