import java.util.ArrayList;

public class BST4 {
    //root to leaf paths
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
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }
    public static void printRoottoLeaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.right==null && root.left==null){//leaf node encountered
            printPath(path);
        }
        printRoottoLeaf(root.left, path);
        printRoottoLeaf(root.right, path);
        path.remove(path.size()-1);//delete el at last index of arraylist(visited node)
    }
    public static void main(String[] args) {
        int values[]={8,5,3,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=buildBST(root,values[i]);
        }
        printRoottoLeaf(root, new ArrayList<>());
    }
}
