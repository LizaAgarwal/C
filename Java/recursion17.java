public class recursion17 {
    //Count total paths in a maze to move from (0,0) to (n,m) where n=m=3
    //Conditions are that you can only move downwards and towards right
    public static int countPaths(int i, int j, int n, int m){
        if(i==n-1 && j==m-1){
            return 1; //when i is placed at the last row(n-1) then it has only one choice to move towards right. Similarly, when j is placed at the last column(m-1) then it has only one choice to move downwards.
        }
        if(i==n||j==m){
            return 0;
        }
        //move downwards
        int countDown=countPaths(i+1, j, n, m);
        //move towards right
        int countRight=countPaths(i, j+1, n, m);
        return countDown+countRight;
    }
    public static void main(String args[]){
        int ans=countPaths(0, 0, 3, 3);
        System.out.println(ans);
    }
}
