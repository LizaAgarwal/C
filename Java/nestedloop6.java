public class nestedloop6 {
    public static void main(Strings args[]){
        //print the inverted half pyramids with numbers upto 5 rows
        for(int i=1;i<6;i++){
            for (int j=1;j<=6-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
