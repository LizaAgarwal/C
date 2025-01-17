public class DP18 {
    //Catalan's number(using recursion)
    public static int catNum(int n){
        if(n==0||n==1){//base case
            return 1;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=catNum(i)*catNum(n-i-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(catNum(n));
    }
}
