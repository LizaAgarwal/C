public class DP17 {
    //wildcard matching
    public static boolean isMatch(String s,String p,int n,int m){
        boolean dp[][]=new boolean[n+1][m+1];//table creation

        //initialization
        dp[0][0]=true;//case 1
        for(int i=1;i<n+1;i++){//case 2
            dp[i][0]=false;
        }
        for(int j=1;j<m+1;j++){//case 3
            if(p.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];//case 4
            }
        }

        //meaning assign
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                //bottom up fill
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){//case1 || case2
                    dp[i][j]=dp[i-1][j-1];
                }else if(p.charAt(i-1)=='*'){//case 3
                    dp[i][j]=dp[i][j-1] || dp[i-1][j]; //choice1 || choice2
                }else{
                    dp[i][j]=false;//case 4
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s="abc";
        String p="**d";
        System.out.println(isMatch(s, p,s.length(),p.length()));
    }
}
