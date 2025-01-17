public class BST1 {
    //Search in a BST
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
    public static boolean searchKey(Node root,int key){
        if(root==null){//in case, key is not present in BST
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return searchKey(root.left, key);
        }else{
            return searchKey(root.right, key);
        }
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=buildBST(root,values[i]);
        }
        System.out.println(searchKey(root,7));
    }
}
