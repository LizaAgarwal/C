public class nestedloop4 {
    public static void main(Strings args[]){
        //print the inverted half pyramid(rotated by 180 degree)
        for(int i=1;i<5;i++){
            //inner loop -> space printing
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            //inner loop-> star printing
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
