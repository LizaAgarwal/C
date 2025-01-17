public class DP10 {
    //rod cutting(using tabulation)
    public static int rodCut(int len[],int price[],int rodLen){
        int n=len.length;
        int dp[][]=new int[n+1][rodLen+1];//table creation
        //initialization
        for(int i=0;i<n+1;i++){
            for(int j=0;j<rodLen+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
            }
        }
        //meaning assign
        for(int i=1;i<n+1;i++){
            for(int j=1;j<rodLen+1;j++){
                //bottom up fill
                if(len[i-1]<=j){//case1
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-len[i-1]], dp[i-1][j]);
                }else{//case2
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][rodLen];
    }
    public static void main(String[] args) {
        int length[]={1,2,3,4,5,6,7,8};
        int price[]={1,5,8,9,10,17,17,20};
        int rodLength=8;
        System.out.println(rodCut(length, price, rodLength));
    }
}
