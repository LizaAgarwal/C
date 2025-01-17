public class backtracking2 {
    //n-Queens: check if problem can be solved & print only 1 solution to n Queens problem
    public static void printBoard(char chessboard[][]){
        System.out.println("--------Chessboard------");
        for(int i=0;i<chessboard.length;i++){
            for(int j=0;j<chessboard.length;j++){
                System.out.print(chessboard[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char chessboard[][],int row, int col){
        //verically up
        for(int i=row-1;i>=0;i--){
            if(chessboard[i][col]=='Q'){
                return false;
            }
        }
        //upper left diag
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        //upper right diag
        for(int i=row-1,j=col+1;i>=0 && j<chessboard.length;i--,j++){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nQueens(char chessboard[][],int row){
        if(row==chessboard.length){//base case
            return true;
        }
        for(int j=0;j<chessboard.length;j++){
            if (isSafe(chessboard,row,j)){
                chessboard[row][j]='Q';
                if(nQueens(chessboard, row+1)){
                    return true;
                };//placing n queens in n rows
                chessboard[row][j]='x';//backtracking step in which 'Q' is replaced by 'x'
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n=2;
        char chessboard[][]=new char[n][n];
        //initialize the chessboard
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chessboard[i][j]='x';
            }
        }
        if( nQueens(chessboard,0)){
            System.out.println("solution exists");
            printBoard(chessboard);
        }else{
            System.out.println("solution doesn't exist");
        }
    }
}
