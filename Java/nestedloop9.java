public class nestedloop9 {
    public static void main(Strings args[]){
        //print butterfly pattern using stars
        int n=4;
        // for printing the no of rows in upper half
        for(int i=1;i<=4;i++){
            //for printing stars in 1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // print spaces
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //print stars in 2nd part
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for printing the no of rows in lower half
        for(int i=n;i>=1;i--){
            //for printing stars in 1st part
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //print spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //print stars in 2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
