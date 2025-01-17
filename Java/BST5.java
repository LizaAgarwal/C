public class BST5 {
    //Valid BST
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
    public static boolean isValid(Node root,Node min,Node max){
        if(root==null){
            return true;//an empty BST is a valid BST
        }
        if(min!=null && root.data<=min.data){
            return false;
        }else if(max!=null && root.data>=max.data){
            return false;
        }
        return isValid(root.left, min, root) && isValid(root.right, root, max);//if any of the subtree gives false value, whole BST is invalid
    }
    public static void main(String[] args) {
        int values[]={1,1,1};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=buildBST(root,values[i]);
        }
        System.out.println(isValid(root,null,null));
    }
}
