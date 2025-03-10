public class DP13 {
    //LCS(using tabulation)
    public static int LCS(String str1, String str2, int n, int m){
        int dp[][]=new int[n+1][m+1];//table creation
        //initialization
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
            }
        }
        //meaning assign
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                //bottom up fill
                if(str1.charAt(i-1)==str2.charAt(j-1)){//case 1
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{//case 2
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1="abcde";
        String str2="ace";
        System.out.println(LCS(str1, str2,str1.length(),str2.length()));
    }
}
//Time complexity:O(n*m)
