public class BST2 {
    //Delete a node
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node buildBST(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=buildBST(root.left, val);
        }else{
            root.right=buildBST(root.right, val);
        }
        return root;
    }
    public static Node del(Node root,int val){
        if(root.data>val){
            root.left=del(root.left, val);
        }else if(root.data<val){
            root.right=del(root.right, val);
        }else{
            //case 1:leaf node
            if(root.right==null && root.left==null){
                return null;//return null to parent of leaf node
            }
            //case 2:single child
            if(root.left==null){
                return root.right;//to parent of single child node
            }else if(root.right==null){
                return root.left;
            }
            //case 3:2 children
            Node IS=findIS(root.right);
            root.data=IS.data;
            root.right=del(root.right, IS.data);
        }
        return root;
    }
    public static Node findIS(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=buildBST(root,values[i]);
        }
        inorder(root);
        del(root,14);
        System.out.println();
        inorder(root);
    }
}
