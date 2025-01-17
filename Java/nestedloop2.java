public class nestedloop2 {
    public static void main(String args[]){
        //print half pyramid with 4 rows using stars
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
