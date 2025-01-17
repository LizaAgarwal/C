public class DP7 {
    //0-1 knapsack(Using tabulation)
    public static int knapsack(int val[],int wt[],int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1];//table creation
        //initialization
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;//0th col
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;//0th row
        }
        //meaning assign
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                //fill(bottom up)
                if(wt[i-1]<=j){
                    //include
                    int ans1=val[i-1]+dp[i-1][j-wt[i-1]];
                    //exclude
                    int ans2=dp[i-1][j];
                    dp[i][j]=Math.max(ans1, ans2);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        System.out.println(knapsack(val, wt, W));
    }
}
//time complexity:O(n*W)
