import java.util.Arrays;

public class DP22 {
    //Matrix Chain Multiplication(using memoization)
    public static int mcm(int arr[],int i,int j,int dp[][]){
        if(i==j){//base case
            return 0;
        }
        if(dp[i][j]!=-1){//already calculated
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1=mcm(arr, i, k, dp);
            int cost2=mcm(arr, k+1, j, dp);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalCost=cost1+cost2+cost3;
            ans=Math.min(ans, finalCost);
        }
        dp[i][j]=ans;
        return dp[i][j];
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int n=arr.length;
        int dp[][]=new int[n][n];//table creation
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);//initialization
        }
        System.out.println(mcm(arr,1,n-1,dp));
    }
}
