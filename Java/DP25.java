import java.util.Arrays;

public class DP25 {
    //Min Array Jumps(Using tabulation)
    public static int minJumps(int arr[],int n){
        int dp[]=new int[n];//table creation
        //initialization
        Arrays.fill(dp, -1);
        dp[n-1]=0;
        //meaning assign
        for(int i=n-2;i>=0;i--){
            //bottom up fill
            int steps=arr[i];
            int ans=Integer.MAX_VALUE;
            for(int j=i+1;j<=i+steps && j<n;j++){
                if(dp[j]!=-1){
                    ans=Math.min(ans, dp[j]+1);
                }
            }
            if(ans!=Integer.MAX_VALUE){
                dp[i]=ans;
            }
        }
        return dp[0];//final ans
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,1,4};
        System.out.println(minJumps(arr,arr.length));
    }
}
