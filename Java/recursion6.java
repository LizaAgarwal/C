public class recursion6 {
    //print x^n(Stack height=logn)
    public static int calPow1(int x,int n){
        if(x==0){
            return 0;//base case 1
        }
        if(n==0){
            return 1;//base case 2
        }
        int halfPower=calPow1(x, n/2);
        //if n is even
        if(n%2==0){
            return halfPower*halfPower;
        }else{  //if n is odd
            return halfPower*halfPower*x;
        }
    }
    public static void main(String args[]){
        int ans=calPow1(2, 5);
        System.out.println(ans);
    }
}
