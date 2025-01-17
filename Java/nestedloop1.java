public class nestedloop1 {
    public static void main(String args[]){
        //print a hollow rectangle with 4 rows and 5 columns by using stars
        for(int i=1;i<5;i++){
            for(int j=1;j<6;j++){
                if (i==1||i==4||j==1||j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
