public class recursion18 {
    // count total ways to place tiles of size 1Xm in a floor of size nXm
    //Conditions are that we can put the tiles horizontally and vertically only
    public static int countTiles(int n, int m){
        if(n==m){
            return 2;   //if n==m then either we can place all the tiles horizontally or vertically
        }
        if(n<m){
            return 1;   //if n<m then we can place all the tiles horizontally only
        }
        //vertical placement
        int verticalPlace=countTiles(n-m, m);
        //horizontal placement
        int horizontalPlace=countTiles(n-1, m);
        return verticalPlace+horizontalPlace;
    }
    public static void main(String args[]){
        int ans=countTiles(4, 2);
        System.out.println(ans);
    }
}
