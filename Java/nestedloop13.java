public class nestedloop13 {
    public static void main(Strings args[]){
        //print diamond pattern using stars
        int n=4;
        //print the upper half
        for(int i=1;i<=n;i++){
            //print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print stars
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //print the lower half
        for(int i=n;i>=1;i--){
            //print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
