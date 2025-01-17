public class DP8 {
    //target sum subset(Using tabulation)
    public static boolean targetSumSubset(int numbers[],int targetSum){
        int n=numbers.length;
        boolean dp[][]=new boolean[n+1][targetSum+1];//table creation
        //initialization
        for(int i=0;i<dp.length;i++){
            dp[i][0]=true;
        }
        //meaning assign
        for(int i=1;i<n+1;i++){
            for(int j=1;j<targetSum+1;j++){
                //fill(bottom up)
                if(numbers[i-1]<=j && dp[i-1][j-numbers[i-1]]==true){ //choice1:include
                    dp[i][j]=true;
                }else if(dp[i-1][j]==true){//for case2 and choice2:exclude 
                    dp[i][j]=true;
                }
            }
        }
        return dp[n][targetSum];
    }
    public static void main(String[] args) {
        int numbers[]={4,2,7,1,3};
        int targetSum=10;
        System.out.println(targetSumSubset(numbers, targetSum));
    }
}
//time complexity:O(n*sum)
