public class Backtracking {
    //place n Queens on an nXn chessboard such that no 2 queens can attack each other
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
    public static void nQueens(char chessboard[][],int row){
        if(row==chessboard.length){//base case
            printBoard(chessboard);
            count++;
            return;
        }
        for(int j=0;j<chessboard.length;j++){
            if (isSafe(chessboard,row,j)){
                chessboard[row][j]='Q';
                nQueens(chessboard, row+1);//placing n queens in n rows
                chessboard[row][j]='x';//backtracking step in which 'Q' is replaced by 'x'
            }
        }
    }
    static int count=0;
    public static void main(String[] args) {
        int n=4;
        char chessboard[][]=new char[n][n];
        //initialize the chessboard
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chessboard[i][j]='x';
            }
        }
        nQueens(chessboard,0);
        System.out.println("total no of ways="+count);
    }
}
