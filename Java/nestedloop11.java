public class nestedloop11 {
    public static void main(Strings args[]){
        //print number pyramid
        int n=5;
        for (int i=1;i<=n;i++){
            //print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
