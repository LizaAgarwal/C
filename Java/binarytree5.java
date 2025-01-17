import org.w3c.dom.Node;

public class binarytree5 {
    //diameter of a tree-O(n^2)
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int ld=diameter(root.left);
        int lh=height(root.left);
        int rd=diameter(root.right);
        int rh=height(root.right);
        
        int rootDiam=lh+rh+1;//when diameter passes through the root
        return Math.max(Math.max(ld,rd),rootDiam);
    }
    public static void main(String[] args) {
        /*  
            1
           / \
          2   3
         / \  / \
        4   5 6  7
        */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println(diameter(root));
    }
}
