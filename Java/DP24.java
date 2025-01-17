public class DP24 {
    //Minimum Partioning(Using tabulation)
    public static int minPart(int numbers[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=numbers[i];
        }
        int W=sum/2;
        int dp[][]=new int[n+1][W+1];//table creation
        //initialization
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<W+1;j++){
            dp[0][j]=0;
        }
        //meaning assign
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                //bottom up fill
                if(numbers[i-1]<=j){//case 1
                    int ans1=numbers[i-1]+dp[i-1][j-numbers[i-1]];//choice1:include
                    int ans2=dp[i-1][j];//choice2:exclude
                    dp[i][j]=Math.max(ans1, ans2);
                }else{//case 2
                    dp[i][j]=dp[i-1][j];

                }
            }
        }
        int sum1=dp[n][W];
        int sum2=sum-sum1;
        return Math.abs(sum1-sum2);
    }
    public static void main(String[] args) {
        int numbers[]={1,6,11,5};
        System.out.println(minPart(numbers,numbers.length));
    }
}
