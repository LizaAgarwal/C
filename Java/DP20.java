public class DP20 {
    //catalan's number(using tabulation)
    public static int catNum(int n){
        int dp[]=new int[n+1];//table creation
        //initialization
        dp[0]=1;
        dp[1]=1;
        //meaning assign
        for(int i=2;i<n+1;i++){
            //bottom up fill
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(catNum(n));
    }
}
//time complexity:O(n^2)
