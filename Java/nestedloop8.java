public class nestedloop8 {
    public static void main(Strings args[]){
        //print 0-1 triangle upto 5 rows
        for (int i=0;i<6;i++){
            for(int j=1;j<=i;j++){
                // consider each digit as matrix cell
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
