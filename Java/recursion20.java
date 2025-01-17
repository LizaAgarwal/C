import java.util.ArrayList;

public class recursion20 {
    //print all the subsets of the set of first n natural numbers
    public static void findSubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void printSubset(int n, ArrayList<Integer> subset){
        if(n==0){
            findSubset(subset);
            return;
        }
        //if an element in the set wants to be added in the subset
        subset.add(n);
        printSubset(n-1, subset);
        //if an element in the set does not want to be added in the subset
        subset.remove(subset.size()-1); //for that first remove that element, which is stored at the last index of subset
        printSubset(n-1, subset);
    }
    public static void main(String args[]){
        ArrayList<Integer> subset=new ArrayList<>();
        printSubset(3,subset);
    }
}
