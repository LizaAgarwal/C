public class nestedloop15 {
    //print a hollow rhombus
    public static void hollow_rhombus(int n){
        //no of rows
        for(int i=1;i<=n;i++){
            //print spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //print stars
            for(int j=1;j<=n;j++){
                if(j==1||j==n||i==1||i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rhombus(5);
    }
}
