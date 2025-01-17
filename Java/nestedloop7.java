public class nestedloop7 {
    public static void main(Strings args[]){
        //print Floyd's triangle upto 5 rows
        int num=1;
        for(int i=1;i<6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num+1;
            }
            System.out.println();
        }
    }
}
