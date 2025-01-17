public class nestedloop3 {
    public static void main(String args[]){
        //print the inverted half pyramid with 4 rows using stars
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
