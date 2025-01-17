public class nestedloop12 {
    public static void main(String args[]){
        //print palindromic pattern
        int n=5;
        for (int i=1;i<=n;i++){
            //print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print numbers in 1st part
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //print numbers in 2nd part
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
