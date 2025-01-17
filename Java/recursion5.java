public class recursion5 {
    //print x^n (Stack height=n)
    public static int calPow(int x,int n){
        if(x==0){
            return 0;//Base case 1
        }
        if(n==0){
            return 1;//Base case 2
        }
        int power=calPow(x, n-1);
        int printPow=x*power;
        return printPow;
    }
    public static void main(String args[]){
        int ans=calPow(2, 5);
        System.out.println(ans);
    }
}
