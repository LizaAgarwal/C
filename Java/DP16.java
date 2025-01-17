public class DP16 {
    //Edit distance
    public static int editDistance(String str1,String str2,int n,int m){
        int dp[][]=new int[n+1][m+1];//table creation
        //initialization
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0){
                    dp[i][j]=j;
                }
                if(j==0){
                    dp[i][j]=i;
                }
            }
        }
        //meaning assign
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                //bottom up fill
                if(str1.charAt(i-1)==str2.charAt(j-1)){//case 1
                    dp[i][j]=dp[i-1][j-1];
                }else{//case 2
                    int ins=dp[i][j-1]+1;//choice 1
                    int del=dp[i-1][j]+1;//choice 2
                    int rep=dp[i-1][j-1]+1;//choice 3
                    dp[i][j]=Math.min(ins,Math.min(del, rep));
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1="intention";
        String str2="execution";
        System.out.println(editDistance(str1,str2,str1.length(),str2.length()));
    }
}
