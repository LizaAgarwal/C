public class DP23 {
    //Matrix Chain Multiplication(using tabulation)
    public static int mcm(int arr[],int n){
        int dp[][]=new int[n][n];//table creation
        //initialization
        for(int i=0;i<n;i++){
            dp[i][i]=0;
        }
        //meaning assign
        for(int len=2;len<=n-1;len++){
            for(int i=1;i<=n-len;i++){
                int j=i+len-1;
                //bottom-up fill
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<=j-1;k++){
                    int cost1=dp[i][k];
                    int cost2=dp[k+1][j];
                    int cost3=arr[i-1]*arr[k]*arr[j];
                    int finalCost=cost1+cost2+cost3;
                    dp[i][j]=Math.min(dp[i][j], finalCost);
                }
            }
        }
        return dp[1][n-1];
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        System.out.println(mcm(arr,arr.length));
    }
}
