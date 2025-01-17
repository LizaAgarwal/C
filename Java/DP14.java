public class DP14 {
    //Longest common substring(using tabulation)
    public static int LCSS(String str1, String str2, int n, int m){
        int dp[][]=new int[n+1][m+1];//table creation
        //initialization
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j]=0;
        }
        int ans=0;
        //meaning assign
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                //bottom up fill
                if(str1.charAt(i-1)==str2.charAt(j-1)){//case 1
                    dp[i][j]=dp[i-1][j-1]+1;
                    ans=Math.max(ans, dp[i][j]);
                }else{//case 2
                    dp[i][j]=0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str1="ABCDE";
        String str2="ABGCE";
        System.out.println(LCSS(str1,str2,str1.length(),str2.length()));
    }
}
