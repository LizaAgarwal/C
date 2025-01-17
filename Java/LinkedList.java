public class LinkedList {
    public static class Node {
        int data;//->property
        Node next;//->property  since,'next' points to the next node, it is of type Node.
        public Node(int data){//constructor of Node class
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //step1-create new node
        Node newNode=new Node(data);//creating obj out of Node class
        size++;
        if(head==null){//incase, linked list is empty
            head=tail=newNode;
            return;
        }
        //step2-newNode's next now points to head
        newNode.next=head;
        //step3-newNode is the head now
        head=newNode;
    }
    public void addLast(int data){
        //step1-create a new node
        Node newNode=new Node(data);
        size++;
        if(head==null){//incase, linked list is empty
            head=tail=newNode;
            return;
        }
        //step2-tail's next points to the newNode
        tail.next=newNode;
        //step3-newNode is the tail noe
        tail=newNode;
    }
    public void addInMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        //create a new node
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //when i=idx-1 & temp -> prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;//returns the data to be removed
    }
    public int removeLast(){
        if(size==0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){//size-2=2nd last node
            prev=prev.next;
        }
        int val=prev.next.data;//tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public void printLL(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        Node temp=head;//a temporary variable 'temp' which points to the head node
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addInMiddle(2, 9);
        ll.removeFirst();
        ll.removeLast();
        ll.printLL();
        System.out.println(ll.size);
    }
}
