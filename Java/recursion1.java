public class recursion1 {
    //print numbers from 1 to 5
    public static void printNum(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        printNum(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        int n=5;
        printNum(n);
    }
}
