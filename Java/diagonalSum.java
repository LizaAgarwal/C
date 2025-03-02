public class diagonalSum {
    public static int sumOfDiagonals(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //primary diagonal sum
            sum+=matrix[i][i];
            //secondary diagonal sum
            if(i!=matrix.length-1-i){   //this condition will avoid the overlapping of the middle element
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println(sumOfDiagonals(matrix));
    }
}
