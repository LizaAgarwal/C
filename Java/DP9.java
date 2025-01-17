public class DP9 {
    //unbounded knapsack(Uisng tabulation)
    public static int unboundKanpsack(int val[],int wt[],int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1];//table creation
        //initialization
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;
        }
        //meaning assign
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                //bottom up fill
                //case1:
                if(wt[i-1]<=j){
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]] , dp[i-1][j]); //choice2:exclude
                }else{//case2:
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];//last cell 
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        System.out.println(unboundKanpsack(val, wt, W));
    }
}
